<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="quizshop.model.QuizShopDto"%>
<%@page import="java.util.List"%>
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
<title>목록</title>
<style type="text/css">
	.detail:hover{
		cursor:pointer;
		color:blue;
	}
</style>

<script type="text/javascript">
	$(function(){
		$(".detail").click(function(){
			var num=$(this).attr("num");
			//alert(num);
			location.href='detailPage.jsp?num='+num;
		})
	});
</script>
</head>
<%
	QuizShopDao dao=new QuizShopDao();
	List<QuizShopDto> list=dao.getAllDatas();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
%>
<body>
<div style="margin:50px 50px; width:800px;">
	<h3 class="alert alert-info">QuizShop 입고 목록</h3>
	<br>
	<button type="button" class="btn btn-info" onclick="location.href='addForm.jsp'">상품추가</button>
	<br>
	<table class="table table-bordered">
		<tr class="table-info">
			<th width="60">번호</th>
			<th width="260">상품명</th>
			<th width="180">가격</th>
			<th width="160">입고일</th>
			<th width="160">등록일</th>
		</tr>
		<%
			for(int i=0; i<list.size(); i++){
				QuizShopDto dto=list.get(i); %>
				<tr>
					<td align="center"><%=i+1 %></td>
					<td><span num="<%=dto.getNum()%>" class="detail"><%=dto.getSang_name() %></span></td>
					<td><%=dto.getPrice() %>원</td>
					<td><%=dto.getIpgoday() %></td>
					<td><%=sdf.format(dto.getWriteday()) %></td>
				</tr>
				
			<%}
		%>	
	</table>
</div>
</body>
</html>
