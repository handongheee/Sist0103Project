<%@page import="simpleguest.model.GuestDto"%>
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
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String num=request.getParameter("num");
	String pass=request.getParameter("pass");
	String nickname=request.getParameter("nickname");
	String content=request.getParameter("content");
	String image=request.getParameter("image");
	
	GuestDao dao=new GuestDao();	
	// 비밀번호가 맞으면 수정 후 목록으로 이동, 틀리면 경고 스크립트
	if(dao.isEqualPass(num, pass)){ // true 생략
		// dto에 넣어서 묶어줌
		GuestDto dto=new GuestDto();
		dto.setNum(num);
		dto.setNickname(nickname);
		dto.setContent(content);
		dto.setImage(image);
		
		// 수정메서드 호출해서 dto 넘김
		dao.updateGuest(dto);
		
		// 리스트로
		response.sendRedirect("guestList.jsp");
	} else{%>
		<script type="text/javascript">
			alert("비밀번호가 틀렸습니다!!");
			history.back(); // 앞으로 이동
		</script>
	<%}
%>
</body>
</html>
