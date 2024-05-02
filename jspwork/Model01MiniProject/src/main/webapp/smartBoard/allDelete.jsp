<%@page import="data.dao.smartDao"%>
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
	smartDao dao=new smartDao();

	// nums 읽음
	String nums=request.getParameter("nums");
	
	// , 로 분리해서 배열 선언
	String []num=nums.split(",");
	
	// 배열의 개수만큼 delete
	/*for(int i=0; i<num.length; i++){
		dao.deleteSmart(num[i]);
	}*/
	
	for(String n:num){
		dao.deleteSmart(n);
	}
	
	// 목록으로 이동
	response.sendRedirect("../index.jsp?main=smartBoard/boardList.jsp");
%>
</body>
</html>
