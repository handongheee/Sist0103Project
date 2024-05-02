<%@page import="test.Student"%>
<%@page import="java.util.Vector"%>
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
	<h3>request에 Vector 저장 후 불러오는 연습</h3>
	<%
		Vector<Student> list=new Vector<>();
		list.add(new Student("이미영", "강남구", 89));
		list.add(new Student("이영자", "서초구", 94));
		list.add(new Student("김미영", "영등포구", 76));
		list.add(new Student("이소라", "부산시", 84));
		list.add(new Student("배윤영", "제주 애월", 97));
		
		// 데이터 vector를 request에 저장
		request.setAttribute("list", list);
		
		// 데이지 이동 방법 2가지: forward(url 주소 안바뀜), redirect(url 주소 바뀜)
	%>
	
	<jsp:forward page="stuForward_10.jsp"/>
</body>
</html>
