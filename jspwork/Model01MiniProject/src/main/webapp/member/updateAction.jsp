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
	String email=request.getParameter("email01")+"@"+request.getParameter("email02");
%>
<jsp:useBean id="dao" class="data.dao.memberDao"/>
<jsp:useBean id="dto" class="data.dto.memberDto"/>
<jsp:setProperty property="*" name="dto"/>
<%
	dto.setEmail(email);
	dao.updateMember(dto);
	
	// 마이페이지
	response.sendRedirect("../index.jsp?main=member/myPage.jsp");
%>
</body>
</html>
