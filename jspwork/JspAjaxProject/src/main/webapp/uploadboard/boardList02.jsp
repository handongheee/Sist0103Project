<%@page import="java.text.SimpleDateFormat"%>
<%@page import="uploadboard.data.uploadBoardDto"%>
<%@page import="java.util.List"%>
<%@page import="uploadboard.data.uploadBoardDao"%>
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
<style>

</style>
</head>
<%
	// db 불러오기
	uploadBoardDao dao=new uploadBoardDao();
	List<uploadBoardDto> list=dao.getAllDatas();
	// 날짜
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>
<body>
<div style="margin:50px 100px; width:1000px;">
	<button type="button" class="btn btn-info" onclick="location.href='boardList.jsp'">목록으로</button><br><br>
		<%
			for(int i=0; i<list.size(); i++){
				uploadBoardDto dto=list.get(i);
	
			%>
				<div style="float:left;">
					<table class="table table-bodered" style="margin-right:30px; width:200px;">
						<tr>
							<td><a href="content.jsp?num=<%=dto.getNum()%>"><img src="../save/<%=dto.getImgname()%>" style="height:150px;"></a> <td><br>
							<tr>
								<td><b><%=dto.getSubject() %></b> <br>
								<%=dto.getWriter() %> <br>
								<%=sdf.format(dto.getWriteday()) %> &nbsp;
								조회 <%= dto.getReadcount() %> </td>
							</tr>
						</tr>
					</table>		
				</div>			
			<%}
		%>
</div>
</body>
</html>
