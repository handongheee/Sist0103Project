<%@page import="java.text.SimpleDateFormat"%>
<%@page import="simpleguest.model.GuestDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="simpleguest.model.GuestDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
   <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<title>Insert title here</title>
<style type="text/css">
	span.day{
		float:right;
		color:#bbb;
	}
	
	body{
	 	font-family: 'IBM Plex Sans KR';
	}
	
	div.edit{
		float:right;
	}
</style>
</head>
<%
	GuestDao dao=new GuestDao();
	ArrayList<GuestDto> list=dao.getAllDatas();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<body>
	<div style="margin:50px 100px; width:600px">
		<button type="button" class="btn btn-info btn-sm" onclick="location.href='insertForm.jsp'">글쓰기</button>
		<br><br>
		<%
			for(int i=0; i<list.size();i++){
				GuestDto dto=list.get(i); // 특정 list 인덱스값에 dto 값 가져옴
				int no=list.size()-i; // 내림차순으로 뽑기 위함 
				%>
				
				<div class="edit">
					<i class="bi bi-pencil-square" onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>' "></i>
					<i class="bi bi-x-square-fill" onclick="location.href='deleteGuest.jsp?num=<%=dto.getNum()%>' "></i>
				</div>
				
				<table class="table table-bordered" style="width:600px;">
					<tr>
						<td>
							<b>No. <%=no %></b> &nbsp;&nbsp;
							<b><%=dto.getNickname() %></b>
							<span class="day"><%=sdf.format(dto.getWriteday()) %></span>
						</td>
					</tr>
					
					<tr>
						<td>
							<div style="width:400px;">
								<img src="../image/avata/b<%=dto.getImage()%>.png" align="left" hspace="20">
								<pre><%=dto.getContent() %></pre>						
							</div>
						</td>
					</tr>
				</table>
					
			<%}
		%>
		
	</div>
</body>
</html>
