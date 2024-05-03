<%@page import="mem_gaip.model.MemgaipDto"%>
<%@page import="mem_gaip.model.MemgaipDao"%>
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
<title>수정 처리</title>
</head>
<body>
<%
	String realPath=getServletContext().getRealPath("/upload");
	int uploadSize=1024*1024*3; // 3mb
	
	MultipartRequest multi=null;
	
	try{
		multi=new MultipartRequest(request, realPath, uploadSize, "utf-8", new DefaultFileRenamePolicy());
		
		// dao 선언
		MemgaipDao dao=new MemgaipDao();
		// dto 선언
		MemgaipDto dto=new MemgaipDto();
		
		dto.setM_num(multi.getParameter("m_num"));
		dto.setM_name(multi.getParameter("m_name"));
		dto.setM_hp(multi.getParameter("m_hp"));
		
		String photo=multi.getFilesystemName("m_photo");
		if(photo==null){
			// 사진 선택 안하면 기존 사진을 그대로 넣어준다
			String oldPhoto=dao.getData(dto.getM_num()).getM_photo(); // 기존 이미지 가져옴
			dto.setM_photo(oldPhoto);
		} else{
			dto.setM_photo("../upload/"+photo); // 사진 선택한 경우
		} 
		
		// DB 업데이트
		dao.updateMemgaip(dto);
					
		// 리스트로 이동
		response.sendRedirect("memList.jsp");
		
	} catch(Exception e){
		
	}
%>
</body>
</html>
