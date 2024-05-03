<%@page import="data.dto.shopDto"%>
<%@page import="data.dao.shopDao"%>
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
	// 업로드할 경로
	String uploadPath=getServletContext().getRealPath("/shopsave");
	System.out.println(uploadPath);
	
	// 업로드 할 사이즈
	int uploadSize=1024*1024*5; // 5mb
	
	MultipartRequest multi=null;
	try{
		multi=new MultipartRequest(request, uploadPath, uploadSize, "utf-8",new DefaultFileRenamePolicy());
		
		String category=multi.getParameter("category");
		String sangpum=multi.getParameter("sangpum");
		String ipgoday=multi.getParameter("ipgoday");
		int price=Integer.parseInt(multi.getParameter("price"));
		String photo=multi.getFilesystemName("photo");
		
		System.out.println(photo);
		
		// dao 선언
		shopDao dao=new shopDao();
		
		// dto에 데이터 담기
		shopDto dto=new shopDto();
		dto.setCategory(category);
		dto.setSangpum(sangpum);
		dto.setIpgoday(ipgoday);
		dto.setPrice(price);
		dto.setPhoto(photo);
		
		// db에 추가
		dao.insertShop(dto);
		
		// 다시 상품 등록폼으로 이동
		response.sendRedirect("../index.jsp?main=shop/addForm.jsp");
		
	} catch(Exception e){
		
	}	
%>

</body>
</html>
