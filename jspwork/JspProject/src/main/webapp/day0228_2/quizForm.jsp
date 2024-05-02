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
<%--
출력모양

사원명:   이효리      text
입사일자:  2024-02-03  date
오늘 선택 점심메뉴:  사진한장나오게..     radio  (value에 이미지경로)
건의하는 메뉴 :  [쌀국수 ] [마라탕]  (혹은 원하는 메뉴없음)   select(multiple)
 --%>
<body>
	<form action="quizWrite.jsp" method="post">
		<table class="table table-bordered" style="width:400px">
			<tr>
				<th width="100">사원명</th>
				<td>
					<input type="text" name="name" style="width:120px">
				</td>
			</tr>
			
			<tr>
				<th width="100">입사일자</th>
				<td>
					<input type="date" name="ipsa" style="width:150px">
				</td>
			</tr>
			
			<tr>
				<th width="100">점심메뉴</th>
				<td>
					<input type="radio" name="menu" value="../image/Food/1.jpg"> 샌드위치
					<input type="radio" name="menu" value="../image/Food/3.jpg"> 우동
					<input type="radio" name="menu" value="../image/Food/11.jpg"> 빙수
				</td>
			</tr>
			
			<tr>
				<th width="100">건의 메뉴</th>
				<td>
					<select name="reqMenu" style="width:100px" multiple="multiple">
						<option value="쌀국수">쌀국수</option>
						<option value="햄버거">햄버거</option>
						<option value="치킨">치킨</option>
						<option value="파스타">파스타</option>
						<option value="볶음밥">볶음밥</option>		
					</select>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="전송" class="btn btn-success">
					<input type="reset" value="초기화" class="btn btn-warning">
				</td>
			</tr>
	
		</table>
	</form>
</body>
</html>
