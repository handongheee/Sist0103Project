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
<title>title</title>
</head>
<%
	// 프로젝트 경로 (절대경로)
	String root=request.getContextPath();
%>
<body>
	<a href="<%=root%>" style="color:black; text-decoration: none">
		<img alt="" src="<%=root%>/image/logo.png" style="width:200px;">
		JSP & JQuery 미니 프로젝트 
	</a>
	
	<!-- 메인에 로그인 출력 -->
	<div style="float:right; padding-right: 10px;">
		<%
			// 로그인 세션 얻기
			String loginok=(String)session.getAttribute("loginok");
			// 아이디 얻기
			String myid=(String)session.getAttribute("myid");
			
			// DB에서 아이디로 이름 얻기
			memberDao dao=new memberDao();
			String name=dao.getName(myid);
			
			if(loginok==null){%>
				<!-- 로그아웃 상태면 로그인 버튼 출력 -->
				<!-- 로그인 폼 출력해야 되므로 경로 설정해줌 (index.jsp?main=) -->
				<button type="button" class="btn btn-success" style="width:100px;" onclick="location.href='index.jsp?main=login/loginForm.jsp'">Login</button>
			<%} else{%>
				<b><%=name %> 님 환영합니다.</b>
				<!-- 단순 처리여서 경로 설정 안해도 됨 -->
				<button type="button" class="btn btn-danger" style="width:100px;" onclick="location.href='login/logoutAction.jsp'">Logout</button>
			<%}
		%>
	</div>
</body>
</html>
