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
	String loginok=(String)session.getAttribute("loginok"); // 캐스팅해줌 (String)
	
	if(loginok==null || loginok.equals("")){ // 로그아웃 상태
		%>
		<jsp:include page="loginForm.jsp"/>
		
	<%} else{%>
		<jsp:include page="logoutForm.jsp"/>
	<%}
%>

</body>
</html>
