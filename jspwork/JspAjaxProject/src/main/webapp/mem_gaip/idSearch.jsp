<%@page import="mem_gaip.model.MemgaipDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>아이디 입력</title>
<script type="text/javascript">
	function saveId(id){
		//alert(id);
		
		// 부모창: opener
		// addForm.jsp에서 openId() 불러서 idSearch.jsp 열었으므로 부모창은 addForm이 된다
		opener.mfrm.m_id.value=id;
		window.close(); // 현재창 닫기
	}

</script>
</head>
<body>
	<%
		String key=request.getParameter("key"); // 처음 호출 시엔 null 값
		if(key==null){
			// null값일 때 폼을 나타냄
			%>
			<div style="margin:10px 30px;">
				<form action="idSearch.jsp" method="post">
					<b>아이디를 입력해주세요</b><br>
					<div class="d-inline-flex">
						<input type="text" name="m_id" class="form-control" style="width:130px;" required="required" placeholder="아이디 입력">
						<input type="hidden" name="key" value="yes">
						<button type="submit" class="btn btn-success" style="margin-left: 10px;">중복체크</button>
					</div>		
				</form>	
			</div>
		<%} else{
			// 액션 처리 (form action="idSearch.jsp")
			String m_id=request.getParameter("m_id");
			// dao 선언 후 아이디가 DB에 존재하는지 확인
			MemgaipDao dao=new MemgaipDao();
			boolean b=dao.isIdCheck(m_id);
			
			if(b){
				// 아이디가 DB에 존재하면
				%>
				<div style="margin: 50px 50px;">
					<h5><%=m_id %> 는 존재하는 아이디입니다.</h5>
					<img alt="" src="../image/jquery_img/image_01.png" width="60" align="left">
					<button type="button" class="btn btn-danger" onclick="location.href='idSearch.jsp'">다시 입력</button>
				</div>
			<%} else{
				// 아이디가 존재하지 않는 경우
				%>
				<div style="margin: 50px 50px;">
					<h5><%=m_id %> 는 사용 가능한 아이디입니다.</h5>
					<img alt="" src="../image/jquery_img/03.png" width="60" align="left">
					<button type="button" class="btn btn-info" onclick="saveId('<%=m_id%>')">적용하기</button>
					<button type="button" class="btn btn-danger" onclick="location.href='idSearch.jsp'">다시 입력</button>
				</div>
			<%}
			
		}
	
		
	%>
</body>
</html>
