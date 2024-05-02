<%@page import="introduce.model.introduceDto"%>
<%@page import="introduce.model.introduceDao"%>
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
<%
	String num=request.getParameter("num"); // detailPage에서 넘긴 num값 받기
	introduceDao dao=new introduceDao(); 
	introduceDto dto=dao.getOneData(num);	
%>
<body>
<div style="margin: 30px 50px;">
	<form action="updateAction.jsp.jsp" method="post">
	<!-- num값 히든으로 -->
	<input type="hidden" name="num" value="<%=num%>">
		<table class="table table-bordered" style="width:600px">
			<caption align="top"><h2><%=dto.getName() %>님의 자기소개 수정</h2></caption>
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" class="form-control"style="width:80px" value="<%=dto.getName() %>">
				</td>
			</tr>
			
			<tr>
				<th>나이</th>
				<td>
					<input type="number" name="age" class="form-control" value="<%=dto.getAge() %>" style="width:60px">	
				</td>
			</tr>
			
			<tr>
				<th>생년월일</th>
				<td>
					<input type="date" name="birthday" class="form-control" value="<%=dto.getBirthday() %>" style="width:200px">	
				</td>
			</tr>
			
			<tr>
				<th>거주지역</th>
				<td>
					<label><input type="radio" name="hometown" value="서울" checked="checked" <%=dto.getHometown().equals("서울")?"checked":"" %>>서울</label>
					<label><input type="radio" name="hometown" value="경기" <%=dto.getHometown().equals("경기")?"checked":"" %>>경기</label>
					<label><input type="radio" name="hometown" value="인천" <%=dto.getHometown().equals("인천")?"checked":"" %>>인천</label>
					<label><input type="radio" name="hometown" value="강원" <%=dto.getHometown().equals("강원")?"checked":"" %>>강원</label>
					<label><input type="radio" name="hometown" value="대구" <%=dto.getHometown().equals("대구")?"checked":"" %>>대구</label>
				</td>
			</tr>
			
			<tr>
				<th>취미</th>
				<td>
					<label><input type="checkbox" name="hobby" value="게임" <%=dto.getHobby().contains("게임")?"checked":"" %>>게임</label>
					<label><input type="checkbox" name="hobby" value="넷플릭스" <%=dto.getHobby().contains("넷플릭스")?"checked":"" %>>넷플릭스</label>
					<label><input type="checkbox" name="hobby" value="독서" <%=dto.getHobby().contains("독서")?"checked":"" %>>독서</label>
					<label><input type="checkbox" name="hobby" value="여행" <%=dto.getHobby().contains("여행")?"checked":"" %>>여행</label>
					<label><input type="checkbox" name="hobby" value="공부" <%=dto.getHobby().contains("공부")?"checked":"" %>>공부</label>
				</td>
			</tr>
			
			<tr>
				<th>성격</th>
				<td>
					<textarea style="width:500px; height:100px" placeholder="자유롭게 서술하세요." class="form-control" name="memo"><%=dto.getMemo() %></textarea>
				</td>
			</tr>
		
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-outline-warning">수정하기(전송)</button>
				</td>
			</tr>
		</table>
	
	</form>

</div>
</body>
</html>
