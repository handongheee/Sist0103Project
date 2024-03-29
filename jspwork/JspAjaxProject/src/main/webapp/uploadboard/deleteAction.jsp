<%@page import="java.io.File"%>
<%@page import="uploadboard.data.uploadBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	// num, pass 읽기
	String num=request.getParameter("num");
	String pass=request.getParameter("pass");

	// dao 선언
	uploadBoardDao dao=new uploadBoardDao();
	
	// isEqualPass에서 반환값 b에 넣기
	boolean b=dao.isEqualPass(num, pass);
	
	if(b){
		// 게시글 삭제 전 업로드된 이미지 지우기 save 파일 삭제
		String imgname=dao.getData(num).getImgname();
		// 업로드 경로 구하기
		String uploadPath=getServletContext().getRealPath("/save");
		
		// 파일생성 /=\\(맥은 \ 못씀)
		File file=new File(uploadPath+"/"+imgname);
		
		// 파일 삭제
		if(file.exists()){ // 파일이 존재하면 
			file.delete(); // 파일 삭제
		}

		// DB 삭제
		dao.deleteUploadBoard(num); 
		response.sendRedirect("boardList.jsp");
	} else{%>
		<script>
			alert("비밀번호가 일치하지 않습니다");
			history.back();
		</script>
	
	<%}
	
%>