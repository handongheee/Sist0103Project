<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<title>Insert title here</title>
<style type="text/css">
	body *{
		font-family:'IBM Plex Sans KR';
	}
	
	div.board{
		position:absolute;
		left: 20%;
		top: 20%;
		font-family:'IBM Plex Sans KR';
		font-size: 1.1em;
	}
	
	div.list{
		width: 800px;	
	}
	
	.detail:hover{
		cursor:pointer;
		color:gray;
	}
</style>

<script type="text/javascript">
	$(function(){
		$("div.addForm").hide();
		$("div.updateForm").hide();
		$("div.detailView").hide();
		//$("div.list").hide();
		
		list();
		
		// 이미지 선택 시
		$("#selImage").change(function(){
			var im=$(this).val();
			
			// 이미지명을 현재 값에 추가로 누적하여 더하기
			//var data=$("#image").val();
			//$("#image").val(data+im);
			$("#image").val(im);
			
			// 아래 imgView에 추가로 이미지가 보이게
			var s="<img src='"+im+"' width='50'>";
			$("#imgView").html(s);
			
		});
		
		// 글쓰기 버튼 누르면 입력폼 보이게
		$(document).on("click", ".addbtn", function(){
			$("div.list").hide();
			$("div.addForm").show();			
		});
		
		// DB추가 버튼을 클릭했을 때
		$("#btnInsert").click(function(){
			var data=$("#addFrm").serialize();
			//alert(data);
			
			var writer=$("#writer").val();
			var subject=$("#subject").val();
			var story=$("#story").val();
			var image=$("#image").val();
			//alert(writer+subject+story+image);
			
			$.ajax({
				type:"post",
				dataType:"html",
				url: "insertWrite.jsp",
				data:{"writer":writer, "subject":subject, "story":story, "image":image},
				success:function(){
					//alert("인서트 성공");
					
					list();
					
					// 기존 작성 값 지우기
					$("#writer").val('');
					$("#subject").val('');
					$("#story").val('');
					$("#image").val('');
					
					$("#imgView").empty();
					
					// 추가폼은 없애고 리스트 출력되게
					$("div.addForm").hide();
					$("div.list").show();
				}
			});
		});
		
		// 제목을 클릭했을 때 상세페이지로
		$(document).on("click",".detail",function(){
			//alert("클릭");
			$("div.list").hide();
			$("div.detailView").show();

			var num=$(this).attr("id");
			//alert(num);

			$.ajax({
				type:"get",
				dataType:"json",
				data:{"num":num},
				url:"getDataWrite.jsp",
				success:function(data){
					//alert("성공");
					$("span.title").html(data.subject);
					$("span.day").html(data.writeday);
					$("span.writer").html(data.writer);
					$("div.story").html("<pre>"+data.story+"</pre>");
					$("div.image").html("<img src='"+data.image+"'>");				
				}
			});
		});
		
		// 상세보기에서 글쓰기 버튼 누르면 상세보기 사라지고 입력폼 출력
		$(".writebtn").click(function(){
			$("div.detailView").hide();
			$("div.addForm").show();	
		});
		
		
		
	});
	
	function list(){
		$.ajax({
			type:"get",
			dataType:"json",
			url:"listWrite.jsp",
			success:function(res){
				//alert(res.length);
				var s="";
				
				s+="<table class='table table-bordered'>";
				s+="<caption align='top'><button type='button' class='btn btn-info addbtn'>";
				s+="<i class='bi bi-pencil-square'></i>글쓰기</button></caption>";
				s+="<tr class='table table-light'>";
				s+="<td width='80' align='center'>번호</td>";
				s+="<td width='300'>제목</td>";
				s+="<td width='150'>작성자</td>";
				s+="<td width='200'>작성일</td>";
				s+="<td width='80' align='center'>추천</td>";
				s+="</tr>";
				
				var n=res.length;
				if(n==0){
					s+="<tr>";
					s+="<td colspan='5' align='center'>";
					s+="<b>게시된 글이 없습니다</b></td></tr>";
				} else{
					$.each(res, function(i, elt){
						// 출력
						s+="<tr>";
						s+="<td align='center'>"+(i+1)+"</td>";
						s+="<td><span class='detail' id='"+elt.num+"'>"+elt.subject+"<span></td>";
						s+="<td>"+elt.writer+"</td>";
						s+="<td>"+elt.writeday+"</td>";
						s+="<td align='center'>"+elt.likes+"</td>";
						s+="</tr>";
						
					})
				}
				s+="</table>";
				
				$("div.list").html(s);
			}
		});
	}

</script>
</head>
<body>
	<!-- 추가폼 addForm -->
	<div class="board addForm" style="width:400px;">
		<form id="addFrm">
			<table class="table table-bordered" style="width:400px;">
				<caption align="top"><b>글쓰기</b></caption>
				<tr>
					<th width="100" class="table-success">작성자</th>
					<td>
						<input type="text" name="writer" id="writer" class="form-control" required="required" style="width:130px;">
					</td>
				</tr>
				
				<tr>
					<th width="100" class="table-success">제목</th>
					<td>
						<input type="text" name="subject" id="subject" class="form-control" required="required" style="width:250px;">
					</td>
				</tr>
				
				<tr>
					<th width="100" class="table-success">내용</th>
					<td>
						<textarea style="width:300px; height:100px;" name="story" id="story" required="required" class="form-control"></textarea>	
					</td>
				</tr>
				
				<tr>
					<th width="100" class="table-success">이미지</th>
					<td>
						<input type="hidden" name="image" id="image" width="100%">
						<select id="selImage" style="width:100px;" class="form-control">
							<option value="../image/avata/b1.png" selected="selected">사랑해</option>
							<option value="../image/avata/b2.png">우울해</option>
							<option value="../image/avata/b5.png">배고파</option>
							<option value="../image/avata/b6.png">좌절</option>
							<option value="../image/avata/b10.png">심심해</option>
							<option value="../image/avata/b8.png">최고</option>
						</select>
						<br>
						<div id="imgView">
							
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<button type="button" class="btn btn-danger" id="btnInsert">DB 추가</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<div class="board updateForm">수정폼</div>
	<div class="board list">목록</div>
	
	<div class="board detailView">
		<table class="table table-bordered" style="width:600px;">
			<caption align="top"><b>게시글 확인</b></caption>
			<tr>
				<td>
					<span class="title">제목</span> 
					<span class="day" style="margin-left:400px;">날짜</span>
				</td>
			</tr>
			
			<tr>
				<td>
					<span class="writer">작성자</span> 
					<span class="likes" style="margin-left:480px;">
						<i class="bi bi-heart-fill" style='color:red;'></i>
						<span class="su">0</span>
					</span>
				</td>
			</tr>
			
			<tr>
				<td style="height:200px;" valign="top">
					<div class="story">내용</div>
					<div class="image">이미지</div>
				</td>
			</tr>
			
			<tr>
				<td>
					<button type="button" class="btn btn-outline-info btn-sm" onclick="location.href='mainPage.jsp'">목록</button>
					<button type="button" class="writebtn btn btn-outline-success btn-sm">글쓰기</button>
					<button type="button" class="updatebtn btn btn-outline-warning btn-sm">수정</button>
					<button type="button" class="deletebtn btn btn-outline-danger btn-sm">삭제</button>
				</td>
			</tr>
			
		</table>

	</div>

</body>
</html>
