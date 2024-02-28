<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	String imgSrc = request.getParameter("celeb");
	%>

	<h4>전달받은 이름: <%=name%></h4>
	<h4>전달받은 주소: <%=addr%></h4>
	<h4>전달받은 이미지:</h4>
	<img alt="" src="<%=imgSrc%>">
</body>
</html>
