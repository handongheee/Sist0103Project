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
	<div style="margin:50px 100px">
		<form action="addAction.jsp" method="post">
			<table class="table table-bordered" style="width:350px;">
				<tr>
					<th>이름</th>
					<td>
						<input type="text" name="name" placeholder="이름" required="required" class="form-control" style="width:120px">
					</td>
				</tr>
				
				<tr>
					<th>주소</th>
					<td>
						<input type="text" name="addr" placeholder="주소" required="required" class="form-control" style="width:250px">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="전송" class="btn btn-outline-success">
						<input type="submit" value="목록" class="btn btn-outline-warning" onclick="location.href='list.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
