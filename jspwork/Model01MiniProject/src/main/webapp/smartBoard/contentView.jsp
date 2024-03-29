<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dao.smartDao"%>
<%@page import="data.dto.smartDto"%>
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
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	span.aday{
		color:#aaa;
		float:right;
		font-size: 0.8em;
	}
	
	div.alist{
		margin-left: 20px;
		color:#aaa;
		font-size: 0.8em;
	}
	
	span.day{
		color:#aaa;
		font-size: 0.8em;
	}
	
	span.icon{
		margin-left: 30px;
	}
</style>

<script type="text/javascript">
	$(function(){
		list(); 
		
		var num=$("#num").val();
		
		// 댓글 쓰기
		$("#btnsend").click(function(){
			var nickname=$("#nickname").val().trim();
			var content=$("#content").val().trim();	
			
			// null 체크
			if(nickname.length==0){
				alert("닉네임을 입력해주세요.");
				return;
			}
			if(content.length==0){
				alert("내용을 입력해주세요.");
				return;
			}
			
			//alert(num+", "+nickname+", "+content);
			
			$.ajax({
				type:"get",
				dataType:"html",
				url:"smartAnswer/insertAnswer.jsp",
				data:{"num":num, "nickname":nickname, "content":content},
				success:function(){
					alert("댓글 등록 성공");
					
					// 초기화
					$("#nickname").val('');
					$("#content").val('');
					
					// 댓글 작성 후 댓글 목록 가져오기 위해 list 다시 출력
					list();
				}		
			})		
		});	
		
		
		// 삭제
		$(document).on("click", "i.adel",function(){
			//alert("click");
			var idx=$(this).attr("idx");
			//alert(idx);
			
			var ans=confirm("댓글을 삭제하려면 확인을 눌러주세요");
			
			if(ans){
				$.ajax({
					type:"get",
					url:"smartAnswer/deleteAnswer.jsp",
					dataType:"html",
					data:{"idx":idx},
					success:function(){
						alert("삭제성공");
						//swal("삭제 성공!", "삭제가 성공되었습니다", "success");
						list();
					}
				});
				
			}
		})

		
		// 수정폼에 데이터 띄우기
		$(document).on("click","i.amod",function(){
			
			idx=$(this).attr("idx");
			//alert(idx);
			
			$.ajax({
				type:"get",
				url:"smartAnswer/jsonUpdateForm.jsp",
				dataType:"json",
				data:{"idx":idx},
				success:function(res){
					$("#unickname").val(res.nickname);
					$("#ucontent").val(res.content);
				}
			});
			
			$("#myModal").modal("show");
		});
		
		// 댓글 수정
		$("#btnUpdate").click(function(){
			var nickname=$("#unickname").val();
			var content=$("#ucontent").val();
			//alert(nickname+", "+content);
			
			$.ajax({
				type:"get",
				url:"smartAnswer/updateAnswer.jsp",
				dataType:"html",
				data:{"idx":idx, "nickname":nickname,"content":content},
				success:function(){
					list();
				}
			})
		});
		
		
		
		
		
		
	});
	
	
	
	// 상세보기 삭제
	function funcdel(num, currentPage){
		//alert(num+", "+currentPage);
		var yes=confirm("삭제하시겠습니까?");
		
		if(yes){
			location.href="smartBoard/delete.jsp?num="+num+"&currentPage="+currentPage;
		}
	}
	
	// 리스트 출력
	function list(){
		//console.log("list num="+$("#num").val());
		//alert($("#num").val());
			
		$.ajax({
			type:"get",
			url:"smartAnswer/listAnswer.jsp",
			dataType:"json",
			data:{"num":$("#num").val()},
			success:function(res){
				// 댓글 개수 출력
				$("b.acount>span").text(res.length);
				
				var s="";
				$.each(res, function(idx, item){
					s+="<div>"+item.nick+" : "+item.content;
					s+="<span class='aday'>"+item.writeday+"</span>";
					s+="<span class='icon'><i class='bi bi-trash3 adel' idx="+item.idx+"></i>";
					s+="<i class='bi bi-pencil amod' idx="+item.idx+"></i></span>";
					s+="</div>";
					
				});
				
				$("div.alist").html(s);
			}
		});
	}

</script>

</head>
<body>
<!-- 상세페이지
	- 작성자/제목/작성일/내용, 조회수 증가
	- 아래에 목록, 글쓰기, 수정, 삭제 버튼
 -->
<%
	String num=request.getParameter("num");
	String currentPage=request.getParameter("currentPage");
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	smartDao dao=new smartDao();
	// dto 가져오기
	smartDto dto=dao.getData(num);
	// 조회수 1 증가
	dao.updateReadcount(num); 
%>
<div style="margin:50px 100px; width:600px;">
<input type="hidden" id="num" value="<%=num%>">
	
	<table class="table table-bordered">
		<tr>
			<td>
				작성자 <%=dto.getWriter() %> <br>
				<h5><%=dto.getSubject() %></h5>
				<div style="text-align: right; color:#aaa">
					조회 <%=dto.getReadcount() %> <br>
					<span class="day"><%=sdf.format(dto.getWriteday()) %> </span>
				</div>
					
			</td>
		</tr>
		
		<tr height="300">
			<td>
				<%=dto.getContent() %>
			</td>
		</tr>
		
		<!-- 댓글 -->
		<tr>
			<td>
				<b class="acount">댓글 <span>0</span></b>
				<div class="alist">
					댓글 목록
				</div>
				
				<div class="aform d-inline-flex">
					
					<input type="text" id="nickname" class="form-control" style="width:100px;" placeholder="닉네임">
					<input type="text" id="content" class="form-control" style="width:300px;" placeholder="댓글 내용">
					<button type="button" id="btnsend" class="btn btn-info">저장</button>
				</div>
			</td>
		</tr>
		
		
		<tr>
			<td>
				<div align="center">
					<button type="button" class="btn btn-outline-success" onclick="location.href='index.jsp?main=smartBoard/boardList.jsp'"><i class="bi bi-list-ul"></i> 목록</button>
					<button type="button" class="btn btn-outline-info" onclick="location.href='index.jsp?main=smartBoard/smartform.jsp'"><i class="bi bi-plus-square"></i> 글쓰기</button>
					<button type="button" class="btn btn-outline-warning" onclick="location.href='index.jsp?main=smartBoard/updateForm.jsp?num=<%=num%> & currentPage=<%=currentPage%>'"><i class="bi bi-pencil-fill"></i> 수정</button>
					<button type="button" class="btn btn-outline-danger" onclick="funcdel(<%=num%>, <%=currentPage%>)"><i class="bi bi-x-square"></i> 삭제</button>
				</div>
				
			</td>
		</tr>
	</table>
</div>



<!-- The Modal -->
<div class="modal fade" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title">댓글 수정</h4>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>

      <!-- Modal body -->
      <div class="modal-body">
       	<input type="text" id="unickname" style="width:100px;" placeholder="닉네임">
       	<input type="text" id="ucontent" style="width:300px;" placeholder="댓글내용">
       	
      </div>

      <!-- Modal footer -->
      <div class="modal-footer">
        <button type="button" class="btn btn-warning" data-bs-dismiss="modal" id="btnUpdate">댓글 수정</button>
      </div>

    </div>
  </div>
</div>


</body>
</html>
