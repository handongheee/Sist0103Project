<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="quizshop.model.QuizShopDto"%>
<%@page import="quizshop.model.QuizShopDao"%>
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
<style type="text/css">
</style>
</head>
<body>
<!-- 이미지가 크게 나오고 옆에 설명 출력(상품명, 가격, 입고일)
목록/수정/삭제 버튼 3개 추가 -->
<%	
	String num=request.getParameter("num");
	QuizShopDao dao=new QuizShopDao();
	QuizShopDto dto=dao.getOneData(num);
%>
<div style="margin: 50px 100px">
	<table class="table table-bordered" style="width:600px">
		<caption align="top"><b>상품 상세 정보</b></caption>
		<tr class="table-success">
			<th style="width:250px">상품이미지</th>
			<th colspan="2">상품 정보</th>
		</tr>
		
		<tr>
			<td rowspan="4"><img src="../image/쇼핑몰사진/<%=dto.getPhoto() %>.jpg" style="width:200px;"></td>	
		</tr>

		<tr>
			<th width="80">상품명</th>
			<td><%=dto.getSang_name() %></td>	
		</tr>
		
		<tr>
			<th>가격</th>
			<td><%=dto.getPrice() %>원</td>	
		</tr>
		
		<tr>
			<th>입고일</th>
			<td><%=dto.getIpgoday()%></td>	
		</tr>
		
	</table>
	<button type="button" class="btn btn-danger" onclick="location.href=''">삭제</button>
	<button type="button" class="btn btn-warning" onclick="location.href=''">수정</button>
	<button type="button" class="btn btn-success" onclick="location.href='shopList.jsp'">목록으로</button>

</div>


</body>
</html>
