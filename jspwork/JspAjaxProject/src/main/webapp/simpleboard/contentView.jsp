<%@page import="simpleboardAnswer.model.SimpleAnswerDto"%>
<%@page import="simpleboardAnswer.model.SimpleAnswerDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="simpleboard.model.SimpleBoardDto"%>
<%@page import="simpleboard.model.SimpleBoardDao"%>
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
<title>상세보기</title>
<style type="text/css">
	body *{
		font-family: 'IBM Plex Sans KR';
		font-size: 13pt;
	}
	span.day{
		color:#ccc;
		font-size: 0.9em;
	}
	span.aday{
		float:right;
		font-size: 0.8em;
		color:#bbb;
	}
	div.alist{
		margin-left: 20px;
	}
	
	i.amod{
		color:blue;
	}
	i.adel{
		color:red;
		margin-left: 20px;
	}
</style>

<!-- 댓글 -->
<script type="text/javascript">
	$(function(){
		
		list();
		
		// ajax 
		// insert 댓글 추가
		var num=$("#num").val();
		//alert(num);
		
		$("#btnsend").click(function(){
			var nickname=$("#nickname").val().trim(); // trim() 띄어쓰기
			var content=$("#content").val().trim();
			//alert(nickname+content);
			
			if(nickname==''){
				alert("닉네임을 입력 후 저장해주세요");
				return;
			} 
			if(content==''){
				alert("댓글 내용을 입력 후 저장해주세요");
				return;
			}
			
			$.ajax({
				type:"get",
				url:"../simpleboardanswer/insertAnswer.jsp",
				dataType:"html",
				data:{"num":num, "nickname":nickname, "content":content},
				success:function(data){
					//alert("댓글 작성 성공");
					// 기존 입력값 지우기
					$("#nickname").val('');
					$("#content").val('');
					
					list(); // 댓글 작성 후 새로고침 안해도 댓글 추가되려면 list 호출
				}
			});	
		});
		
		// delete 리스트의 삭제버튼 클릭 시
		$(document).on("click","i.adel", function(){
			var idx=$(this).attr("idx");
			//alert(idx);
			var ans=confirm("댓글을 삭제하려면 확인을 눌러주세요");
			
			if(ans){
				$.ajax({
					type:"get",
					url:"../simpleboardanswer/deleteAnswer.jsp",
					dataType:"html",
					data:{"idx":idx},
					success:function(){
						alert("삭제되었습니다.");
						list();
					}
				});
			}
		});
		
		// 댓글 글자 누르면 댓글 작성창 나오게
		$("b.acount").click(function(){
			$("div.aupdateform").hide();
			$("div.aform").toggle();
		});
		
		// 일단 수정 댓글창 안보이게
		$("div.aupdateform").hide();
		
		// getData 댓글 리스트에 수정 아이콘 누르면 수정 댓글창에 해당 idx의 내용 출력
		$(document).on("click", ".amod", function(){
			$("div.aform").hide();
			$("div.aupdateform").show();
			
			var idx=$(this).attr("idx");
			//alert(idx);
			$("#idx").val(idx);
			
			$.ajax({
				type:"get",
				dataType:"json",
				url:"../simpleboardanswer/oneDataAnswer.jsp",
				data:{"idx":idx},
				success:function(res){
					$("#idx").val(res.idx);
					$("#unickname").val(res.nick);
					$("#ucontent").val(res.content);
				}
			});
		});
		
		// update 수정
		$("#ubtnsend").click(function(){
			var idx=$("#idx").val();
			var nick=$("#unickname").val();
			var content=$("#ucontent").val();
			//alert(idx+", "+nick+", "+content);
			
			$.ajax({
				type:"get",
				url:"../simpleboardanswer/updateAnswer.jsp",
				dataType:"html",
				data:{"idx":idx, "nickname":nick, "content":content},
				success:function(){
					//alert("수정");
					list();
					$("div.aupdateform").hide();
					$("div.aform").show();
				}
			});
		});
		

	})
	
	function list(){
		
		console.log("list num="+$("#num").val());
		$.ajax({
			type:"get",
			url:"../simpleboardanswer/listAnswer.jsp",
			dataType:"json",
			data:{"num":$("#num").val()},
			success:function(res){
				// 댓글 개수 출력
				$("b.acount>span").text(res.length);
				
				// 댓글 리스트
				var s="";
				$.each(res, function(idx, item){
					s+="<div>"+item.nick+" : "+item.content;
					s+="<span class='aday'>"+item.writeday+"</span>";
					s+="<i class='bi bi-x-square adel' idx='"+item.idx+"'></i> &nbsp;";
					s+="<i class='bi bi-pencil-square amod' idx="+item.idx+"></i>";
				});
				$("div.alist").html(s);
			}
			
		});
	}
</script>
<!-- -->

</head>
<%
	String num=request.getParameter("num");
	SimpleBoardDao dao=new SimpleBoardDao();
	
	// dto
	SimpleBoardDto dto=dao.getContent(num);
	// 조회수 1 증가
	dao.updateReadCount(num);
	// 날짜
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<!-- 댓글 -->
<input type="hidden" id="num" value="<%=dto.getNum()%>">
<!--  -->

<div style="margin: 50px 100px; width: 500px;">
	<table class="table table-bordered">
		<caption align="top"><b style="font-size:15pt;"><%=dto.getSubject() %></b></caption>
		<tr>
			<td>
				<b>작성자: <%=dto.getWriter() %></b><br>
				<span class="day"><%=sdf.format(dto.getWriteday()) %></span>
				&nbsp;&nbsp;&nbsp;조회 <%=dto.getReadcount() %>
			</td>
		</tr>
		
		<tr height="250">
			<td>
				<%=dto.getContent().replace("\n", "<br>") %>
			</td>
		</tr>
		
		<!-- 댓글 -->
		<tr>
			<td>
				<b class="acount">댓글 <span>0</span></b>
				<!-- 바로 댓글목록으로 화면 포커스하려면 id 값 줘야 됨 -->
				<div class="alist" id="alist">
					댓글목록
				</div>
				
				<!-- 댓글 작성폼 -->
				<div class="aform input-group">
					
					<input type="text" id="nickname" class="form-control" style="width:80px;" placeholder="닉네임">
					<input type="text" id="content" class="form-control" style="width:300px; margin-left:5px;" placeholder="댓글메세지">	
					
					<button type="button" id="btnsend" class="btn btn-info btn-sm" style="margin-left:7px;">저장</button>		
				</div>
				
				<!-- 댓글 수정폼 -->
				<div class="aupdateform input-group">
					
					<input type="hidden" id="idx">
					
					<input type="text" id="unickname" class="form-control" style="width:80px;" placeholder="닉네임">
					<input type="text" id="ucontent" class="form-control" style="width:300px; margin-left:5px;" placeholder="댓글메세지">	
					
					<button type="button" id="ubtnsend" class="btn btn-warning btn-sm" style="margin-left:7px;">수정</button>		
				</div>
				
			</td>
		</tr>
		<!--  -->
		
		<tr>
			<td align="center">
				<button type="button" class="btn btn-outline-success" onclick="location.href='addForm.jsp'"><i class="bi bi-pencil-square"></i>글쓰기</button>
				<button type="button" class="btn btn-outline-info" onclick="location.href='boardList.jsp'"><i class="bi bi-list-ul"></i>목록</button>
				<button type="button" class="btn btn-outline-warning" onclick="location.href='updatePassForm.jsp?num=<%=dto.getNum()%>'"><i class="bi bi-layout-text-sidebar-reverse"></i>수정</button>
				<button type="button" class="btn btn-outline-danger" onclick="location.href='deletePassForm.jsp?num=<%=dto.getNum()%>'"><i class="bi bi-x-square"></i>삭제</button>
			
			</td>
		</tr>
	
	</table>
	
</div>
<body>
</body>
</html>
