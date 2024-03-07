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
	// post니 엔코딩
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="dao" class="introduce.model.introduceDao"/>
<jsp:useBean id="dto" class="introduce.model.introduceDto"/>

<!-- 한번에 dto 주입 -->
<jsp:setProperty property="*" name="dto"/>

<%
	String []hobby=request.getParameterValues("hobby"); // 배열형태로 선언
	String myhobby="";
	
	if(hobby==null){
		myhobby="no"; // myhobby=null; 
	} else{
		for(int i=0; i<hobby.length; i++){
			myhobby+=hobby[i]+",";
		}
		myhobby=myhobby.substring(0, myhobby.length()-1); // 마지막 , 제거
	}
	
	// dto에 hobby 담기
	dto.setHobby(myhobby);
	// dao에 insert
	dao.insertIntroduce(dto);
	
	// 리스트로
	response.sendRedirect("introduceList.jsp");
%>
</body>
</html>
