<%@page import="data.dao.memberDao"%>
<%@page import="data.dto.memberDto"%>
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
<!-- 관리자가 강퇴시키는 페이지 -->
<%
	String num=request.getParameter("num");

	// dao 선언
	memberDao dao=new memberDao();
	// num값 dao로 넘김
	dao.deleteMember(num);
	
	// 삭제 후 멤버리스트로
	// response.sendRedirect 할때는 상대 주소 ../index.jsp?main= 붙여야 한다
	response.sendRedirect("../index.jsp?main=member/memberList.jsp");
%>
</body>
</html>
