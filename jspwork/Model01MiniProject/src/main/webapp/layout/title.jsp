<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>title</title>
</head>
<%
	// 프로젝트 경로 (절대경로)
	String root=request.getContextPath();
%>
<body>
	<a href="<%=root%>" style="color:black; text-decoration: none">
		<img alt="" src="<%=root%>/image/logo.png" style="width:200px;">
		JSP & JQuery 미니 프로젝트 
	</a>
</body>
</html>
