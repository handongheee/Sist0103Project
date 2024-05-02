<%@page import="simpleboard.model.SimpleBoardDao"%>
<%@page import="simpleboard.model.SimpleBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	/* 방법 01
	String num=request.getParameter("num");
	String subject=request.getParameter("subject");
	String pass=request.getParameter("pass");
	String content=request.getParameter("content");
	
	SimpleBoardDto dto=new SimpleBoardDto();
	dto.setNum(num);
	dto.setSubject(subject);
	dto.setPass(pass);
	dto.setContent(content);
	
	SimpleBoardDao dao=new SimpleBoardDao();
	dao.updateSimpleBoard(dto);
	
	response.sendRedirect("contentView.jsp?num="+num);
	*/
%>
	
<jsp:useBean id="dao" class="simpleboard.model.SimpleBoardDao"/>
<jsp:useBean id="dto" class="simpleboard.model.SimpleBoardDto"/>
<jsp:setProperty property="*" name="dto"/>

<%
	dao.updateSimpleBoard(dto);
	response.sendRedirect("contentView.jsp?num="+dto.getNum());
%>
