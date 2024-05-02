<%@page import="org.json.simple.JSONObject"%>
<%@page import="data.dto.smartAnswerDto"%>
<%@page import="data.dao.smartAnswerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String idx=request.getParameter("idx");
	smartAnswerDao adao=new smartAnswerDao();
	smartAnswerDto adto=adao.getAnswerData(idx);
	
	JSONObject ob=new JSONObject();
	ob.put("idx", adto.getIdx());
	ob.put("nickname", adto.getNickname());
	ob.put("content", adto.getContent());
%>
<%=ob.toString() %>
