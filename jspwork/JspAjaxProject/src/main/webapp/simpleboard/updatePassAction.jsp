<%@page import="simpleboard.model.SimpleBoardDao"%>
<%@page import="simpleboard.model.SimpleBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String num=request.getParameter("num");
	String pass=request.getParameter("pass");
	
	SimpleBoardDto dto=new SimpleBoardDto();
	dto.setNum(num);
	dto.setPass(pass);
	
	SimpleBoardDao dao=new SimpleBoardDao();
	boolean b=dao.isEqualPass(num, pass);
	
	if(b){
		response.sendRedirect("updateForm.jsp?num="+num);
	} else{%>
		<script>
			alert("비밀번호가 일치하지 않습니다");
			history.back();
		</script>
	<%}
	
%>