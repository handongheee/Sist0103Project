<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="data.dto.memberDto"%>
<%@page import="data.dao.memberDao"%>
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
<script type="text/javascript">
	// 관리자 페이지
	$(function(){
		$(".deletebtn").click(function(){
			var num=$(this).val();
			//alert(num);
			
			var qa=confirm("정말 강퇴시키겠습니까?");
			if(qa){
				location.href="member/memberDelete.jsp?num="+num;
			}
			
		});
	});

</script>

</head>
<%
	memberDao dao=new memberDao();
	List<memberDto> list=dao.getAllMembers();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>
<body>
<div style="margin:100px 100px; width:1000px;">
	<table class="table table-bordered">
		<div>총 <%=list.size() %> 명의 회원이 있습니다.</div>
		<caption align="top"><b>전체 회원 명단</b></caption>
		<tr>
			<th width="80px">번호</th>
			<th width="120px">이름</th>
			<th width="140px">아이디</th>
			<th width="220px">핸드폰</th>
			<th width="280px">주소</th>
			<th width="220px">이메일</th>
			<th width="180px">가입일</th>
			<th width="120px">편집</th>
		</tr>	
		<% 
			int no=1;
			for(memberDto dto:list){
			%>
				<tr align="center">
					<td><%=no++ %></td>
					<td><%=dto.getName() %></td>
					<td><%=dto.getId() %></td>
					<td><%=dto.getHp() %></td>
					<td><%=dto.getAddr() %></td>
					<td><%=dto.getEmail() %></td>
					<td><%=sdf.format(dto.getGaipday()) %></td>
					<td>
						<button type="button" class="btn btn-danger btn-sm deletebtn" value="<%=dto.getNum()%>">삭제</button>
					</td>
				</tr>				
			<%	
			}
		%>	
	</table>
</div>
</body>
</html>