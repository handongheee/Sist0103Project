<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt"	uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<h2>forEach문, forTokens문</h2>
	
<!-- forEach -->
<!-- [1] [2]..[10] -->
<b>forEach</b> <br>
<c:forEach var="a" begin="1" end="10">	
	[${a }] 
</c:forEach>
<br>
<c:forEach var="a" begin="1" end="10" step="2">	
	[${a }] 
</c:forEach>

<%
	String [] myColors={"red", "yellow", "gray", "green", "cyan", "orange", "magenta"};
%>
<c:set value="<%=myColors %>" var="myColors"/>

<table class="table table-bordered" style="width:300px;">
	<caption align="top"><b>전체출력</b></caption>
	<tr>
		<th>index</th><th>count</th><th>color</th>
	</tr>
	
	<c:forEach var="a" items="${myColors }" varStatus="i">
		<!-- items:리스트가 받아올 배열명, varStatus:상태변수 -->
		<tr>
			<td>${i.index }</td>
			<td>${i.count }</td>
			<td style="color: ${a}">${a }</td>
		</tr>		
	</c:forEach>
</table>

<table class="table table-bordered" style="width:300px;">
	<caption align="top"><b>일부출력</b></caption>
	<tr>
		<th>index</th><th>count</th><th>color</th>
	</tr>
	
	<c:forEach var="a" items="${myColors }" varStatus="i" begin="2" end="5">
		<!-- items:리스트가 받아올 배열명, varStatus:상태변수 -->
		<tr>
			<td>${i.index }</td>
			<td>${i.count }</td>
			<td style="color: ${a}">${a }</td>
		</tr>		
	</c:forEach>
</table>

<hr>

<!-- forTokens -->
<c:set var="flowers" value="장미, 수국, 달리아, 프리지아, 라일락"></c:set>

<h3>${flowers }</h3>

<h3>flowers 값을 컴마로 분리해서 출력하기_forTokens</h3>
<c:forTokens items="${flowers }" delims="," varStatus="i" var="s">
	<h3>${i.count}: ${s }</h3>
</c:forTokens>
</body>
</html>
