<%@page import="java.io.File"%>
<%@page import="data.dao.guestDao"%>
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
	// db삭제와 업로드된 파일도 삭제하기
	String num=request.getParameter("num");
	String currentPage=request.getParameter("currentPage");
	
	// db로부터 저장된 이미지명 얻기
	guestDao dao=new guestDao();
	String photoname=dao.getData(num).getPhotoname();
	
	// 파일 삭제
	// 프로젝트 실제 경로
	String realPath=getServletContext().getRealPath("/save");
	
	// 파일 객체 생성
	File file=new File(realPath+"/"+photoname);
	
	// 파일삭제 if(파일이 존재한다면)
	if(file.exists()){
		file.delete();
	}
	
	// DB 삭제
	dao.deleteGuest(num);
	
	%>
		<script type="text/javascript">
			alert("삭제되었습니다.");
		</script>
	<%
	
	// 리스트로 이동
	response.sendRedirect("../index.jsp?main=memberGuest/guestList.jsp?currentPage="+currentPage);
%>
</body>
</html>
