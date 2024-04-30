<%@page import="data.dao.guestDao"%>
<%@page import="data.dto.guestDto"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	// 아이디 세션값 가져오기
	String myid=(String)session.getAttribute("myid");
	
	// 이미지 저장 경로 가져오기
	String realPath=getServletContext().getRealPath("/save");
	System.out.println("절대경로2: "+realPath);
	
	int uploadSize=1024*1024*3; // 이미지 업로드 사이즈 3mb
	
	MultipartRequest multi=null;
	
	try{
		multi=new MultipartRequest(request, realPath, uploadSize, "utf-8", new DefaultFileRenamePolicy());	
		String content=multi.getParameter("content"); // content 
		String photoname=multi.getFilesystemName("photo"); // photoname 경로명
		
		// dto 에 저장
		guestDto dto=new guestDto();
		dto.setMyid(myid);
		dto.setContent(content);
		dto.setPhotoname(photoname);
		
		// dao 메서드 호출
		guestDao dao=new guestDao();
		dao.insertGuest(dto);
		
		// 방명록 목록으로 이동 guestList
		response.sendRedirect("../index.jsp?main=memberGuest/guestList.jsp");
	} catch(Exception e){
		
	}
	
	
	
%>

</body>
</html>
