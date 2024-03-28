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
<title>Insert title here</title>
<script type="text/javascript">
	function funcdel(num, currentPage){
		//alert(num+", "+currentPage);
		var yes=confirm("삭제하시겠습니까?");
		
		if(yes){
			location.href="smartBoard/delete.jsp?num="+num+"&currentPage="+currentPage;
		}
	}
	
	$(function(){
		$("#btnsend").click(function(){
			var nickname=$("#nickname").val();
			var content=$("#content").val();
			
			//alert(nickname+", "+content);
			
			$.ajax({
				type:"get",
				dataType:"html",
				url:"smartAnswer/insertAnswer.jsp?",
				data:{"nickname":nickname, "content":content},
				success:function(){
					alert("댓글 등록 성공");
				}
				
			})
		});
	});
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
	<table class="table table-bordered">
		<tr>
			<td>
				작성자 <%=dto.getWriter() %> <br>
				<h5><%=dto.getSubject() %></h5>
				<div style="text-align: right; color:#aaa">
					조회 <%=dto.getReadcount() %> <br>
					<%=sdf.format(dto.getWriteday()) %> 
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
				<div>
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
</body>
</html>
