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
		// 아이디 중복체크(유효성 확인) - alert 출력
		$("#btnIdCheck").click(function(){
			var id=$("#id").val(); // id 읽기
			//alert(id);
			
			$.ajax({
				type:"get",
				dataType:"json",
				url:"member/idCheck.jsp",
				data:{"id":id},
				success:function(res){
					//alert(res.count);
					if(res.count==1){
						//alert("이미 존재하는 아이디입니다.\n다시 입력해주세요.");
						$("span.idSuccess").text("사용 불가");
						$("#id").val('');
					} else{
						//alert("사용 가능한 아이디입니다.");
						$("span.idSuccess").text("사용 가능!");
					}
				}
			});
		});
		
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
<body>
<div style="margin:100px 100px;" width:500px;>
	<form action="member/addAction.jsp" method="post" onsubmit="return check(this)">
		<table class="table table-bordered" style="width:500px;">
			<caption align="top"><b>회원가입</b></caption>
			<tr>
				<th width="100" class="table-success">아이디</th>
				<td>
					<div class="d-inline-flex">
						<input type="text" name="id" id="id" maxlength="8" class="form-control" required="required" style="width:120px">
						<button type="button" class="btn btn-danger" id="btnIdCheck" style="margin-left:10px;">아이디 확인</button>
						<span class="idSuccess" style="color:orange; margin-left:10px;"></span>
					</div>
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">비밀번호</th>
				<td>
					<div class="d-inline-flex">
						<input type="password" name="pass" class="form-control" required="required" style="width:130px;" placeholder="비밀번호">
						<input type="password" name="passCon" class="form-control" required="required" style="width:130px; margin-left:5px;" placeholder="비밀번호 확인">
					</div>	
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">이름</th>
				<td>
					<input type="text" name="name" class="form-control" required="required" style="width:120px;">
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">핸드폰</th>
				<td>
					<input type="text" name="hp" class="form-control" required="required" style="width:120px;">
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">주소</th>
				<td>
					<input type="text" name="addr" class="form-control" required="required" style="width:120px;">
				</td>
			</tr>
			
			<tr>
				<th width="100" class="table-success">이메일</th>
				<td>
					<div class="d-inline-flex">
						<input type="text" name="email01" class="form-control" required="required" style="width:80px;">
						<b style="margin-left:10px;"> @ </b>
						<input type="text" name="email02" id="email02" class="form-control" required="required" style="width:110px; margin-left:10px;">
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
					<button type="submit" class="btn btn-outline-info" style="width:100px;">가입하기</button>
					<button type="reset" class="btn btn-outline-danger" style="width:100px;">초기화</button>
				</td>
			</tr>
	
		</table>
	</form>
</div>
</body>
</html>