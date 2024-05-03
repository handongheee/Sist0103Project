<%@page import="java.util.Enumeration"%>
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
	// 톰캣에 업로드된 프로젝트 경로 구하기
	ServletContext context=getServletContext();

	// 프로젝트에 업로드된 실제 경로
	String realFolder=context.getRealPath("/upload");
	
	System.out.println(realFolder); // 삭제, 업로드 유무 확인
	
	MultipartRequest multi=null;
	
	// 업로드 시 허용할 크기
	int uploadSize=1024*1024*3; // 3mb
	
	try{
		// 선언 (try~catch 만들어주기)
		multi=new MultipartRequest(request, realFolder, uploadSize,"utf-8", new DefaultFileRenamePolicy());
		 
		// 입력한 값들 읽어오기
		String writer=multi.getParameter("writer");
				
		// 파일이 여러개인 경우
		Enumeration forNames=multi.getFileNames(); // Enumeration: file타입만 얻어옴
		
		// hasMoreElements(): 엘리먼트가 없을때까지
		while(forNames.hasMoreElements()){
			// 파일태그 name 얻기
			String fileName=(String)forNames.nextElement(); // 캐스팅
			System.out.println("file type의 이름: "+fileName);
			
			// 실제 업로드된 파일명 얻기
			String uploadFileName=multi.getFilesystemName(fileName);
			
			// 실제 이미지만 넣기
			if(uploadFileName!=null){ %>
				<img alt="" src="../upload/<%=uploadFileName%>" style="max-width:200px;" border="1">
				<br>
				<b><%=uploadFileName %></b>
				
				<h3>작성자: <%=writer%></h3>
			<%}
			
		}

	} catch(Exception e){
		
	}
	
%>
</body>
</html>
