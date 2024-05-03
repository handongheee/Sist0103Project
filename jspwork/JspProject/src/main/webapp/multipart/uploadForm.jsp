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
	<!-- 파일 업로드하려면 method="post" enctype="multipart/form-data" 필수 -->
	<form action="uploadProc.jsp" method="post" enctype="multipart/form-data">
		<table class="table table-bordered" style="width:500px;">
		<caption align="top"><b>이미지 한개 업로드</b></caption>
			<tr>
				<th width="100">이름</th>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			
			<tr>
				<th width="100">제목</th>
				<td>
					<input type="text" name="subject">
				</td>
			</tr>
			
			<tr>
				<th width="100">이미지</th>
				<td>
					<input type="file" name="uploadFile">
				</td>
			</tr>
		
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="업로드">
				</td>
			</tr>
		</table>
	
		
	</form>
</body>
</html>
