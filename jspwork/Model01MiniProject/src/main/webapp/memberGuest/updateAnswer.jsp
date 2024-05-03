<%@page import="data.dao.answerGuestDao"%>
<%@page import="data.dto.answerGuestDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String idx=request.getParameter("idx");
	String content=request.getParameter("content");
	
	answerGuestDao dao=new answerGuestDao();
	dao.updateAnswer(idx, content);
%>