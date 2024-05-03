<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: 50px 50px;">
	<h3>입력폼</h3>
		<form action="result" method="post">
			<table class="table table-bordered">
				<tr>
					<th width="130px;">이름</th>
					<td><input type="text" name="name"> <br></td>
				</tr>

				<tr>
					<th>좋아하는 색상</th>
					<td><input type="color" name="color"> <br></td>
				</tr>

				<tr>
					<th>취미</th>
					<td>
						<input type="checkbox" name="hobby" value="운동">운동 <br>
						<input type="checkbox" name="hobby" value="영화보기">영화보기 <br>
						<input type="checkbox" name="hobby" value="코딩하기">코딩하기 <br>
						<input type="checkbox" name="hobby" value="독서">독서 <br>
					</td>
				</tr>

				<tr>
					<th>가장 재미있는 언어 선택</th>
					<td>
						<select name="lang">
							<option value="Java" selected="selected">Java</option>
							<option value="HTML">HTML</option>
							<option value="AJAX">AJAX</option>
							<option value="Spring">Spring</option>
						</select>
					</td>
				</tr>
				
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="전송하기">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>