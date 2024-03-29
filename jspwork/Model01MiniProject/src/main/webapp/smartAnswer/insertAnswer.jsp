<%@page import="data.dao.smartAnswerDao"%>
<%@page import="data.dto.smartAnswerDto"%>
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
	String nickname=request.getParameter("nickname");
	String content=request.getParameter("content");
	String num=request.getParameter("num");
	
	smartAnswerDto dto=new smartAnswerDto();
	dto.setNum(num);
	dto.setNickname(nickname);
	dto.setContent(content);
	
	smartAnswerDao dao=new smartAnswerDao();
	dao.insertAnswer(dto);
	
	response.sendRedirect("../index.jsp?main=smartBoard/contentView.jsp?num="+num);
	
%>
</body>
</html>
