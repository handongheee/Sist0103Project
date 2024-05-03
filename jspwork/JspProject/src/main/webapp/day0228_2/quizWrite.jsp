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
	String name=request.getParameter("name");
	String ipsa=request.getParameter("ipsa");
	String launch=request.getParameter("menu");
	String []reqmenu=request.getParameterValues("reqMenu");
%>

<h5>사원명: <%=name %></h5>
<h5>입사일자: <%=ipsa %> </h5>
<h5>오늘 선택 점심 메뉴: </h5>
<img alt="" src="<%=launch %>" style="width:200px">
<br><br>
<h5>건의하는 메뉴: 
<%
	if(reqmenu==null){%>
		<b style="color:red">원하는 메뉴 없음</b>
	<%} else{
		for(int i=0; i<reqmenu.length; i++){%>
			<b style="font-size:20px">[<%=reqmenu[i] %>]&nbsp;</b>
		<%}
	}
%>

</h5>


</body>
</html>
