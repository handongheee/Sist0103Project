<%@page import="data.dto.memberDto"%>
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
<%
	String id=request.getParameter("id");
	
	memberDao dao=new memberDao();
	String name=dao.getName(id);
%>
<body>
	<div style="margin:100px 100px;">
		<img alt="" src="image/logo.png" style="width:400px;"><br><br>
		<b><%=name %> 님의 회원가입을 축하합니다!</b>
		<br><br>
		<button type="button" class="btn btn-danger" onclick="location.href='index.jsp?main=login/loginMain.jsp'">로그인</button>
		<button type="button" class="btn btn-success" onclick="location.href='index.jsp'">메인</button>
	</div>
	
</body>
</html>
