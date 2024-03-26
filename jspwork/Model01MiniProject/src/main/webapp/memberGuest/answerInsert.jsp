<%@page import="data.dao.answerGuestDao"%>
<%@page import="data.dto.answerGuestDto"%>
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
	request.setCharacterEncoding("utf-8");

	//data읽어서 dto넣기
	answerGuestDto dto = new answerGuestDto();
	dto.setNum(request.getParameter("num"));
	dto.setMyid(request.getParameter("myid"));
	dto.setContent(request.getParameter("content"));

	//페이지 번호 읽기
	String currentPage = request.getParameter("currentPage");

	//db에저장
	answerGuestDao dao = new answerGuestDao();
	dao.insertAnswer(dto);

	//다시보던페이지로 이동
	response.sendRedirect("../index.jsp?main=memberGuest/guestList.jsp?currentPage=" + currentPage);
%>
</body>
</html>
