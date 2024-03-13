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
	session.setAttribute("msg", "happy");
	session.setMaxInactiveInterval(10); // 10초
%>
<h2>10초 안에 눌러주세요!</h2>
<form action="sessionAction.jsp" method="post">
	<h2>받고 싶은 생일선물은?</h2>
	<input type="radio" value="아이폰15" name="gift">아이폰15 &nbsp;
	<input type="radio" value="맥북에어" name="gift" checked="checked">맥북에어 &nbsp;
	<input type="radio" value="현금" name="gift">현금 &nbsp;
	<input type="radio" value="백화점 상품권" name="gift">백화점 상품권 &nbsp;
	
	<input type="submit" value="선물 선택">
</form>
</body>
</html>
