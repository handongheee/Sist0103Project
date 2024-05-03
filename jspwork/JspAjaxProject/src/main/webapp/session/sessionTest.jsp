<%@page import="java.util.Date"%>
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
<%
	// 세션 저장하는 법
	session.setAttribute("msg", "happy day!");
	session.setMaxInactiveInterval(60); // 유지시간 지정. 60초 60*60*1=1시간
%>

	<h3>세션값 얻기</h3>
	세션값: <%=session.getAttribute("msg") %>	<br>
	세션유지시간: <%=session.getMaxInactiveInterval() %> 초<br>
	세션 생성시간1: <%=session.getCreationTime() %> <br>
	세션 생성시간2: <%=new Date(session.getCreationTime()) %>
</body>
</html>
