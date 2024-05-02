<%@page import="org.json.simple.JSONObject"%>
<%@page import="simpleboardAnswer.model.SimpleAnswerDao"%>
<%@page import="simpleboardAnswer.model.SimpleAnswerDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String idx=request.getParameter("idx");
	
	SimpleAnswerDao dao=new SimpleAnswerDao();
	
	dao.deleteAnswer(idx);
%>	
