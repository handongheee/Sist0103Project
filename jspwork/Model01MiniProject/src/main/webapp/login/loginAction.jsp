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
<body>
<%
	String id=request.getParameter("id");
	String pass=request.getParameter("pass");
	String cbSave=request.getParameter("cbSave"); // 체크 안 하면 null
	
	memberDao dao=new memberDao();
	boolean b=dao.isIdPass(id, pass);
	
	// ID/PW 맞으면 세션 3개(id, pass, cbSave) 저장 후 로그인메인
	if(b){
		session.setMaxInactiveInterval(60*60*8); // 8시간 세션 유지, 생략 시 디폴트 30분
		
		// 세션 생성
		session.setAttribute("loginok", "yes");
		session.setAttribute("myid", id);
		session.setAttribute("saveok", cbSave==null?null:"yes");
		
		response.sendRedirect("../index.jsp?main=login/loginMain.jsp");
	} else{
		%>
		<script type="text/javascript">
			alert("아이디 또는 비밀번호가 틀렸습니다.");
			history.back();
		</script>
	<%}
%>
</body>
</html>
