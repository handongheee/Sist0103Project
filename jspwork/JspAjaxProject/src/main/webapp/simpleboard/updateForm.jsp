<%@page import="simpleboard.model.SimpleBoardDao"%>
<%@page import="simpleboard.model.SimpleBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>수정페이지</title>
</head>
<%
	String num=request.getParameter("num");	
	SimpleBoardDao dao=new SimpleBoardDao();
	SimpleBoardDto dto=dao.getContent(num);
%>
<body>
<div style="margin:50px 100px; width:500px;">
	<form action="updateAction.jsp" method="post">
		<input type="hidden" name="num" value="<%=dto.getNum()%>">
		<table class="table table-bordered">
			<tr>
				<th width="100" class="table-light">작성자</th>
				<td>
					<b><%=dto.getWriter() %></b>
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-light">제목</th>
				<td>
					<input type="text" name="subject" class="form-control" style="width:300px;" required="required" value="<%=dto.getSubject()%>">
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-light">비밀번호</th>
				<td>
					<input type="password" name="pass" class="form-control" style="width:200px;" required="required" value="<%=dto.getPass()%>">
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<textarea style="width:480px; height:100px;" class="form-control" name="content" required="required"><%=dto.getContent() %></textarea>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<!-- type이 image submit인 경우 기본 기능이 submit -->
					<button type="submit" style="width:100px;" class="btn btn-success btn-md">수정하기</button>
					<button type="button" style="width:100px;" class="btn btn-warning btn-md" onclick="location.href='boardList.jsp'">목록으로</button>
				</td>
			</tr>
		</table>
	</form>	
</div>
</body>
</html>
