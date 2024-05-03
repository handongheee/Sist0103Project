<%@page import="data.dao.smartAnswerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String idx=request.getParameter("idx");
	smartAnswerDao dao=new smartAnswerDao();
	dao.deleteAnswer(idx);
%>
