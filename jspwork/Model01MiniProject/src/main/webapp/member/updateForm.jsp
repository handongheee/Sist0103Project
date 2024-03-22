<%@page import="java.util.StringTokenizer"%>
<%@page import="data.dao.memberDao"%>
<%@page import="data.dto.memberDto"%>
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
	$(function(){
		
		// 메일 선택 이벤트
		$("#selEmail").change(function(){
			if($(this).val()=='-'){
				$("#email02").val('');
			} else{
				$("#email02").val($(this).val());
			}
			
		});	
	});

	function check(f){
		// check(this)로 넘어온 폼 값들
		if(f.pass.value!=f.passCon.value){
			alert("비밀번호가 일치하지 않습니다.");
			// 초기화
			f.pass.value="";
			f.passCon.value="";
			return false; // form action 호출하지 않는다
		}
	}
</script>
</head>
<%
	// num
	String num=request.getParameter("num");
	// dao
	memberDao dao=new memberDao();
	// dto
	memberDto dto=dao.getDataMember(num);
	
	// email @를 구분자로 분리하기 StringTokenizer
	StringTokenizer st=new StringTokenizer(dto.getEmail(), "@");
	String email01=st.nextToken();
	String email02=st.nextToken();
%>
<body>
<div style="margin:100px 100px;" width:500px;>
	<form action="member/updateAction.jsp" method="post" onsubmit="return check(this)">
		<input type="hidden" name="num" value="<%=num%>">
		<table class="table table-bordered" style="width:500px;">
			<caption align="top"><b>회원 정보 수정</b></caption>
			<tr>
				<th width="100" class="table-success">아이디</th>
				<td>
					<div class="d-inline-flex">
						<b><%=dto.getId() %></b>
					</div>
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">이름</th>
				<td>
					<input type="text" name="name" class="form-control" required="required" style="width:120px;" value="<%=dto.getName()%>">
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">핸드폰</th>
				<td>
					<input type="text" name="hp" class="form-control" required="required" style="width:150px;" value="<%=dto.getHp()%>">
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">주소</th>
				<td>
					<input type="text" name="addr" class="form-control" required="required" style="width:160px;" value="<%=dto.getAddr()%>">
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">이메일</th>
				<td>
					<div class="d-inline-flex">
						<input type="text" name="email01" class="form-control" required="required" style="width:80px;" value="<%=email01 %>">
						<b style="margin-left:10px;"> @ </b>
						<input type="text" name="email02" id="email02" class="form-control" required="required" style="width:110px; margin-left:10px;" value="<%=email02 %>">
							<select id="selEmail" class="form-control" style="margin-left:10px;">
								<option value="-">직접 입력</option>
								<option value="naver.com">네이버</option>
								<option value="gmail.com">지메일</option>
								<option value="daum.net">다음</option>
								<option value="kakao.com">카카오</option>
							</select>
					</div>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-outline-warning" style="width:100px;">수정하기</button>
					<button type="reset" class="btn btn-outline-danger" style="width:100px;">초기화</button>
				</td>
			</tr>
	
		</table>
	</form>
</div>
</body>
</html>