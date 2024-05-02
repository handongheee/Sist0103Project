<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
<div style="margin:50px 100px; width:600px;">
	<form action="shop/addAction.jsp" method="post" enctype="multipart/form-data">
		<table class="table table-bordered">
			<caption align="top"><b>상품등록</b></caption>
			<tr>
				<td style="width:150px;" class="table-light">
					<b>카테고리</b>
				</td>
				
				<td>
					<select style="width: 100px;" class="form-control" required="required" name="category">
						<option value="제로" selected="selected">제로</option>
						<option value="콜라">콜라</option>
						<option value="이온음료">이온음료</option>
						<option value="커피">커피</option>
						<option value="물">물</option>
						
					</select>
				</td>
			</tr>
			
			<tr>
				<td style="width:150px;" class="table-light">
					<b>상품명</b>
				</td>
				
				<td>
					<input type="text" name="sangpum" class="form-control" style="width:200px;" required="required" placeholder="상품명 입력">
				</td>
			</tr>
			
			<tr>
				<td style="width:150px;" class="table-light">
					<b>이미지 등록</b>
				</td>
				
				<td>
					<input type="file" name="photo" class="form-control" style="width:300px;">
				</td>
			</tr>
			
			<tr>
				<td style="width:150px;" class="table-light">
					<b>상품 가격</b>
				</td>
				
				<td>
					<input type="text" name="price" class="form-control" style="width:150px;" required="required" placeholder="가격 입력">
				</td>
			</tr>
			
			<tr>
				<td style="width:150px;" class="table-light">
					<b>입고일</b>
				</td>
				
				<td>
					<%
						// 현재 날짜 구하기
						SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
						String today=sdf.format(new Date());
					%>
					<input type="date" name="ipgoday" class="form-control" style="width:200px;" required="required" value="<%=today%>">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-success" style="width:100px;">상품저장</button>
					<button type="button" class="btn btn-outline-info" style="width:100px;" onclick="location.href='index.jsp?main=shop/shopList.jsp'">상품목록</button>
					
					
				</td>
			</tr>
			
		</table>
		
	
	</form>
	
</div>
</body>
</html>
