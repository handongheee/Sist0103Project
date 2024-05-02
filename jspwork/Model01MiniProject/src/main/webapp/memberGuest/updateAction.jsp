<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="data.dao.guestDao"%>
<%@page import="data.dto.guestDto"%>
<%@page import="data.dto.memberDto"%>
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
	String realPath=getServletContext().getRealPath("/save");
	System.out.println(realPath);
	
	int uploadSize=1024*1024*3;
	
	MultipartRequest multi=null;
	
	try{
		multi=new MultipartRequest(request, realPath, uploadSize, "utf-8", new DefaultFileRenamePolicy());
		
		String num=multi.getParameter("num");
		String currentPage=multi.getParameter("currentPage"); // 리스트에 넘겨주기 위해 currentPage 받아줌
		String content=multi.getParameter("content");
		String photoname=multi.getFilesystemName("photo");
		
		// 기존 사진명 가져오기
		guestDao dao=new guestDao();
		String old_photoname=dao.getData(num).getPhotoname();
		
		// dto에 저장
		guestDto dto=new guestDto();
		dto.setNum(num);
		dto.setContent(content);
		// 사진 선택을 안하면 기존 이미지로 저장
		dto.setPhotoname(photoname==null?old_photoname:photoname);
		
		// update
		dao.updateGuest(dto);
		
		// 수정했던 페이지로 이동 currentPage
		response.sendRedirect("../index.jsp?main=memberGuest/guestList.jsp?currentPage="+currentPage);
		
	} catch(Exception e){
		
	}


%>
</body>
</html>
