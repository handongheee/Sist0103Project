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
	<h3>oneInclude_07.jsp를 include 하기</h3>
	<%
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:include page="oneInclude_07.jsp">
		<jsp:param value="오늘은 좋은 날!!" name="msg" />
		<jsp:param value="../image/Food/1.jpg" name="imgName" />

	</jsp:include>
</body>
</html>
