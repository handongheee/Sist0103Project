<%@page import="java.text.SimpleDateFormat"%>
<%@page import="uploadboard.data.uploadBoardDao"%>
<%@page import="uploadboard.data.uploadBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>상세페이지</title>
</head>
<%
	String num=request.getParameter("num");	
	uploadBoardDao dao=new uploadBoardDao();
	
	// 데이터 가져오기
	uploadBoardDto dto=dao.getData(num);
	
	// 조회수 증가
	dao.updateReadCount(num);
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
%>
<body>
<div style="margin: 50px 100px">
	<table class="table table-condensed" style="width:800px;">
		<tr>
			<td><h5><b><%=dto.getSubject() %></b></h5>
			<%=dto.getWriter() %>
			<div align="right"><%=sdf.format(dto.getWriteday()) %></div>
			<div align="right">조회수 <%=dto.getReadcount() %></div>
			</td>
		</tr>
		<tr>
			<!-- replace("\n","<br>") : 줄바꿈 설정 -->
			<td><%=dto.getContent().replace("\n","<br>") %> <br>
			
			<!-- 이미지 클릭하면 원래 크기로 출력 -->
			<a href="../save/<%=dto.getImgname()%>">
			<img src="../save/<%=dto.getImgname()%>" style="max-width:180px; margin-left:50px;">
			</a></td>
		</tr>

	</table>
	
	<button type="button" class="btn btn-info" onclick="location.href='boardList.jsp'">목록으로</button>
	<button type="button" class="btn btn-success" onclick="location.href='addForm.jsp'">추가</button>
	<button type="button" class="btn btn-danger" onclick="location.href='deleteAction.jsp?num=<%=dto.getNum()%>'">삭제</button>
	<button type="button" class="btn btn-warning" onclick="location.href=''">수정</button>
	
</div>

</body>
</html>