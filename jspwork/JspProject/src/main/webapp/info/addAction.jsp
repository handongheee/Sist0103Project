<%@page import="info.model.infoDAO"%>
<%@page import="info.model.infoDTO"%>
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
		String name=request.getParameter("name");
		String addr=request.getParameter("addr");
		
		// 입력데이터를 dto로 묶어서 메서드로 전달
		infoDTO dto=new infoDTO();
		
		// db에 전달하기 위해 dto에 넣음
		dto.setName(name); 
		dto.setAddr(addr);
		
		// insert 메서드로 전달
		infoDAO dao=new infoDAO();
		dao.infoInsert(dto); // name, addr 값이 들어간 dto ???
		
		// 출력 jsp로 이동 - url이 액션에 머무르면 안되고 주소가 바껴야함 redirect
		response.sendRedirect("list.jsp");
	
	%>
</body>
</html>
