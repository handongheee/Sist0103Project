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
</style>
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
		
		<tr>
			<td align="center">
				<button type="button" class="btn btn-outline-success" onclick="location.href='addForm.jsp'"><i class="bi bi-pencil-square"></i>글쓰기</button>
				<button type="button" class="btn btn-outline-info" onclick="location.href='boardList.jsp'"><i class="bi bi-list-ul"></i>목록</button>
				<button type="button" class="btn btn-outline-warning" onclick="location.href='updatePassForm.jsp'"><i class="bi bi-layout-text-sidebar-reverse"></i>수정</button>
				<button type="button" class="btn btn-outline-danger" onclick="location.href='deletePassForm.jsp'"><i class="bi bi-x-square"></i>삭제</button>
			
			</td>
		</tr>
	
	</table>
	
</div>
<body>
</body>
</html>
