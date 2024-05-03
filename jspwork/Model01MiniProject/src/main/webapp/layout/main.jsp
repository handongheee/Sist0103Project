<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>main</title>
</head>
<%
	// 프로젝트 경로 (절대경로)
	String root=request.getContextPath();
%>
<body>
	<img alt="" src="<%=root%>/image/ourCompany.png" style="width:1195px;"> <br><br>
	
	<h3>주요 제품 보기</h3>

	<img alt="" src="<%=root%>/image/oricoke.png" style="width:390px;"> 
	<img alt="" src="<%=root%>/image/spriteZero.png" style="width:390px;"> 
	<img alt="" src="<%=root%>/image/zeroLemon.png" style="width:390px;">
</body>
</html>
