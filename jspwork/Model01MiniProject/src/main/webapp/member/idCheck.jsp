<%@page import="org.json.simple.JSONObject"%>
<%@page import="data.dao.memberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String id=request.getParameter("id");
	memberDao dao=new memberDao();
	int count=dao.isIdCheck(id); // 존재하면 1 반환
	
	JSONObject ob=new JSONObject();
	ob.put("count", count); 
%>
<%=ob.toString()%>