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
	smartDto dto=dao.getData(num);
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
		
		<tr>
			<td>
				<div align="center">
					<button type="button" class="btn btn-outline-success" onclick="location.href='index.jsp?main=smartBoard/boardList.jsp'"><i class="bi bi-list-ul"></i> 목록</button>
					<button type="button" class="btn btn-outline-info" onclick="location.href='index.jsp?main=smartBoard/smartform.jsp'"><i class="bi bi-plus-square"></i> 글쓰기</button>
					<button type="button" class="btn btn-outline-warning" onclick="location.href=''"><i class="bi bi-pencil-fill"></i> 수정</button>
					<button type="button" class="btn btn-outline-danger" onclick="location.href=''"><i class="bi bi-x-square"></i> 삭제</button>
				</div>
				
			</td>
		</tr>
	</table>
</div>
</body>
</html>
