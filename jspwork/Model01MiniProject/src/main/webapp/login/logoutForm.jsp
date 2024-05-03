<%@page import="data.dao.memberDao"%>
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
	// 로그인중인 이름 가져오기
	String id=(String)session.getAttribute("myid");
	memberDao dao=new memberDao();
	String name=dao.getName(id);
%>
	<div style="margin:100px 100px;">
		<img alt="" src="image/logo.png" style="width:400px;" align="center"> <br><br>
			
		<h5>[<%=name %>] 님이 로그인 중</h5> <br><Br>
			
		<button type="submit" class="btn btn-danger" onclick="location.href='login/logoutAction.jsp'">로그아웃</button>
	</div>
</body>
</html>
