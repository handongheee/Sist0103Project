<%@page import="simpleguest.model.GuestDto"%>
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
	request.setCharacterEncoding("utf-8");
	/*
	String image=request.getParameter("image");
	String nickname=request.getParameter("nickname");
	String pass=request.getParameter("pass");
	String content=request.getParameter("content");
	
	GuestDto dto=new GuestDto();	
	dto.setImage(image);
	dto.setNickname(nickname);*/
%>

<jsp:useBean id="dao" class="simpleguest.model.GuestDao"/>
<jsp:useBean id="dto" class="simpleguest.model.GuestDto"/>
<jsp:setProperty property="*" name="dto"/>
<%
	dao.insertGuest(dto); 
	response.sendRedirect("guestList.jsp"); // 리스트로
%>
</body>
</html>
