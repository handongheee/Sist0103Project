<%@page import="info.model.infoDAO"%>
<%@page import="info.model.infoDTO"%>
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
	// 데이터 읽어서 dto 담기
	String name=request.getParameter("name");
	String addr=request.getParameter("addr");
	String num=request.getParameter("num");
		
	infoDTO dto=new infoDTO();
	dto.setName(name);
	dto.setAddr(addr);
	dto.setNum(num);
	
	// db에 저장
	infoDAO dao=new infoDAO();
	dao.infoUpdate(dto);
	
	// 목록으로 이동
	response.sendRedirect("list.jsp");
	
%>
</body>
</html>
