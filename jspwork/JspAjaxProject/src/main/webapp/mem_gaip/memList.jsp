<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="mem_gaip.model.MemgaipDao"%>
<%@page import="mem_gaip.model.MemgaipDto"%>
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
<style type="text/css">
	
</style>
</head>
<%
	MemgaipDao dao=new MemgaipDao();
	List<MemgaipDto> list=dao.getMemList();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
%>
<body>
	<div style="margin:50px 100px; width:1000px;">
		<b>총 <%=list.size() %> 명의 회원이 가입되어있습니다</b>
		<button type="button" class="btn btn-info" onclick="location.href='addForm.jsp'" style="float:right; margin-right:50px;">회원가입</button>
		<br>
		<table class="table table-bordered">
			<caption align="top"><b>전체 회원 명단</b></caption>
			<tr class="table-success">
				<th width="80">번호</th>
				<th width="180">아이디</th>
				<th width="180">회원명</th>
				<th width="200">전화번호</th>
				<th width="200">가입일</th>
				<th width="150">편집</th>
			</tr>
			<%
				int i=1;
				for(MemgaipDto dto:list){
					%>
					
					<tr>
						<td align="center" valign="middle"><%=i++ %></td>
						<td valign="middle"><%=dto.getM_id() %></td>
						<td valign="middle">
							<img alt="" src="<%=dto.getM_photo()%>" class="rounded-circle" style="width:35px; height:35px;">
							<b><%=dto.getM_name() %></b>
						</td>
						<td valign="middle"><%=dto.getM_hp() %></td>
						<td valign="middle"><%=sdf.format(dto.getGaipday()) %></td>
						<td valign="middle">
							<button type="button" class="btn btn-danger btn-sm" onclick="location.href='deletePassForm.jsp?num=<%=dto.getM_num()%>'">삭제</button>
							<button type="button" class="btn btn-success btn-sm" onclick="location.href='updatePassForm.jsp?num=<%=dto.getM_num()%>'">수정</button>
						</td>
					</tr>
					
				<%}
			
			%>
			
		</table>
	</div>

</body>
</html>