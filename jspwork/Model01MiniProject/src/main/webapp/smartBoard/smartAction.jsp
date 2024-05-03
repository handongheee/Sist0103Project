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
%>
<jsp:useBean id="dto" class="data.dto.smartDto"/>
<jsp:useBean id="dao" class="data.dao.smartDao"/>
<jsp:setProperty property="*" name="dto"/>

<%
	dao.insertSmart(dto);

	int num=dao.getMaxNum();
	
	// 일단 목록으로 이동 나중에 디테일로 변경 예정
	//response.sendRedirect("../index.jsp?main=smartBoard/boardList.jsp");
	response.sendRedirect("../index.jsp?main=smartBoard/contentView.jsp?num="+num+"&currentPage=1");
%>

</body>
</html>
