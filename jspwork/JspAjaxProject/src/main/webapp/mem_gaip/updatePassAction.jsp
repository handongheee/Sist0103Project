<%@page import="mem_gaip.model.MemgaipDao"%>
<%@page import="mem_gaip.model.MemgaipDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String num=request.getParameter("num");
	String pass=request.getParameter("pass");
	
	MemgaipDao dao=new MemgaipDao();
	boolean p=dao.isEqualPass(num, pass);
	
	if(p){
		response.sendRedirect("updateForm.jsp?num="+num);
	} else{
	%>
		<script>
			alert("비밀번호가 일치하지 않습니다.");
			history.back();
		</script>
	<%
	}
%>
   