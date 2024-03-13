<%@page import="uploadboard.data.uploadBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String num=request.getParameter("num");

	uploadBoardDao dao=new uploadBoardDao();
	dao.deleteUploadBoard(num);
	
	response.sendRedirect("boardList.jsp");
%>