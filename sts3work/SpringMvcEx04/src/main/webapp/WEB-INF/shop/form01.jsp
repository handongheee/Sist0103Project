<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt"	uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<link
href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap"
rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<h2>get 방식 폼</h2>
	<form action="read01" method="get">
		이름:<input type="text" name="name" size="6"> <br>
		나이:<input type="text" name="age" size="5"> <br>
		<button type="submit">get방식 전송</button> 
	</form>
	
	<h2>post 방식 폼_dto</h2>
	<form action="read02" method="post">
		상품:<input type="text" name="sang" size="10"> <br>
		가격:<input type="text" name="price" size="7"> <br>
		색상:<input type="text" name="color" size="10"> <br>
		구입일:<input type="text" name="guipday" size="7"> <br>
		<button type="submit">post방식 전송</button> 
	</form>
	
	<h2>post 방식 폼_map</h2>
	<form action="read03" method="post">
		상품:<input type="text" name="sang" size="10"> <br>
		가격:<input type="text" name="price" size="7"> <br>
		색상:<input type="text" name="color" size="10"> <br>
		<button type="submit">post방식 전송</button> 
	</form>
</body>
</html>