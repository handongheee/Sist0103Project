<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>수정</title>
</head>
<%
	String num=request.getParameter("num");
%>
<body>
<form action="updatePassAction.jsp">
	<div style="margin:100px 100px" >
		<caption><b>비밀번호를 입력하세요</b></caption> <br>
		<input type="hidden" name="num" value=<%=num %>>
		<input type="password" name="pass" class="form-control" style="width:150px" placeholder="비밀번호"> <br>
		<button type="submit" class="btn btn-warning">수정하기</button>
	</div>
</form>
</body>
</html>
