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
	<h4>quiz02</h4>
	<div style="margin: 50px 50px;">
		<!-- action에 뒤에것만 넣어야 함 -->
		<form action="info" method="post">
			<table class="table table-bordered" style="width: 300px;">
				<tr>
					<th>사원</th>
					<td><input type="text" name="s_name" class="form-control"
						style="width: 130px;"></td>
				</tr>

				<tr>
					<th>급여</th>
					<td><input type="text" name="pay" class="form-control"
						style="width: 160px;"></td>
				</tr>

				<tr>
					<th>나이</th>
					<td><input type="text" name="s_age" class="form-control"
						style="width: 130px;"></td>
				</tr>

				<tr>
					<th>부서</th>
					<td><input type="text" name="buseo" class="form-control"
						style="width: 160px;"></td>
				</tr>

				<tr>
					<td colspan="2" align="center">
						<button type="submit" class="btn btn-info">데이터전송</button>
					</td>
				</tr>
			</table>
		</form>
	</div>


</body>
</html>