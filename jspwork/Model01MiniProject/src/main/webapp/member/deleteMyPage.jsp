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
<%
	String num=request.getParameter("num");
	String pass=request.getParameter("pass");
	
	// dao 선언
	memberDao dao=new memberDao();
	// 비밀번호 일치 확인 후 true/false 반환
	boolean d=dao.isEqualPass(num, pass);
	
	// true면 삭제
	if(d){
		dao.deleteMember(num);
	%>
		<script type="text/javascript">
	   		alert("회원 탈퇴 성공!");
	   		location.href="../index.jsp";
	 	</script>
	<%
	} else{ %>
		<script type="text/javascript">
			alert("비밀번호가 일치하지 않습니다");
			history.back();
		</script>
	<%}
%>
<body>

</body>
</html>
