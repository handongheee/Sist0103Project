<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.memberDto"%>
<%@page import="java.util.List"%>
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
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	#mainImg{
		width:100px;
		height:100px;
	 	border-radius: 100px;

	}
</style>

<script type="text/javascript">
	function delfunc(num){
		//alert(num);
		$("#delNum").val(num);
		$("#myModal").modal("show");
		
		// 삭제버튼 이벤트
		$(".btnDel").click(function(){
			var num=$("#delNum").val();
			var pass=$("#delPass").val();
			//alert(num+pass);
			location.href="member/deleteMyPage.jsp?num="+num+"&pass="+pass;
		});
	}
</script>
</head>
<%
	memberDao dao=new memberDao();
	List<memberDto> list=dao.getAllMembers();
	SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd");
%>
<body>
	<div style="margin:100px 100px; width:800px;">
		<table class="table table-bordered">
			<%
				for(memberDto dto:list){%>
					<tr>
						<td rowspan="6" align="center" valign="middle" style="width:150px;">
							<img alt="" src="image/roundLogo.png" id="mainImg">
						</td>
						
						<td style="width:300px">회원명: <%=dto.getName() %></td>
						<td rowspan="6" style="width:180px;" align="center" valign="middle">
							<button type="button" class="btn btn-outline-success btn-sm">수정</button><br><br>
							<button type="button" class="btn btn-outline-danger btn-sm" onclick="delfunc('<%=dto.getNum()%>')">탈퇴</button>
						</td>
					</tr>
					
					<tr>
						<td>아이디: <%=dto.getId() %></td>
					</tr>
					
					<tr>
						<td>이메일: <%=dto.getEmail() %></td>
					</tr>
					
					<tr>
						<td>핸드폰: <%=dto.getHp() %></td>
					</tr>
					
					<tr>
						<td>주소: <%=dto.getAddr() %></td>
					</tr>
					
					<tr>
						<td>가입일: <%=sdf.format(dto.getGaipday()) %></td>
					</tr>
				<%}
			
			%>
				
		</table>
		
	
	</div>
	
	
	<!-- The Modal -->
	<div class="modal" id="myModal">
	  <div class="modal-dialog modal-sm">
	    <div class="modal-content">
	
	      <!-- Modal Header -->
	      <div class="modal-header">
	        <h4 class="modal-title">탈퇴 확인</h4>
	        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
	      </div>
	
	      <!-- Modal body -->
	      <div class="modal-body d-inline-flex">
	      	<input type="hidden" id="delNum">	
	        <b>삭제 비밀번호 :  </b>
	        <input type="password" id="delPass" class="form-control" style="width:120px;">
	      </div>
	
	      <!-- Modal footer -->
	      <div class="modal-footer">
	        <button type="button" class="btn btn-danger btnDel" data-bs-dismiss="modal">삭제하기</button>
	      </div>
	
	    </div>
	  </div>
	</div>
	
</body>
</html>
