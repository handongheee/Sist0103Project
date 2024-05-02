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

	String grade=request.getParameter("grade");
	String []lang=request.getParameterValues("lang");
	String like=request.getParameter("like");
	String height=request.getParameter("height");
	String weight=request.getParameter("weight");
	String ipsa=request.getParameter("ipsaday");
%>

	<h5>최종학력: <%=grade %></h5>
	<h5>가능언어:
	<%
		if(lang==null){%>
			<font color="green">아무 언어도 못함</font>
		<%} else{
			for(int i=0; i<lang.length; i++){%>
				[<%=lang[i] %>]
		<%}	
		}
	%>
	</h5>
	<h5>같은 조하고 싶은 사람: <%=like %> </h5>
	<h5>나의 키: <%=height %></h5>
	<h5>나의 몸무게: <%=weight %></h5>
	<h5>입사일: <%=ipsa %></h5>
</body>
</html>
