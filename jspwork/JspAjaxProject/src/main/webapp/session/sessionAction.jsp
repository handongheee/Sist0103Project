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
	
	// 세션이 있는지 확인 후 없으면 선물 꽝 
	String msg=(String)session.getAttribute("msg"); // 오브젝트 형식이라 양쪽 형식 (String)으로 캐스팅해줘야 됨
	String gift=request.getParameter("gift");
	
	// msg가 아니거나, happy가 아니면
	if(msg==null || !msg.equals("happy")){%>
		<h3 style="color:red;">시간초과로 꽝입니다</h3>
	<%} else{ %>
		<h3 style="color:green;">축하합니다 <%=gift %> 선물에 당첨되었습니다!</h3>
	<%}
%>

<a href="sessionMain.jsp">다시 선택</a>
</body>
</html>
