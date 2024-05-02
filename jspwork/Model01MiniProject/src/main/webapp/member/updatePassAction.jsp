<%@page import="javax.tools.DocumentationTool.Location"%>
<%@page import="data.dao.memberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String num=request.getParameter("num");
	String pass=request.getParameter("pass");
	
	memberDao dao=new memberDao();
	boolean p=dao.isEqualPass(num, pass);
	
	if(p){
		response.sendRedirect("../index.jsp?main=member/updateForm.jsp?num="+num);
	} else{ %>
		<script>
			alert("비밀번호가 일치하지 않습니다.");
			history.back();
		</script>
		
	<%}
%>