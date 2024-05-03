<%@page import="org.json.simple.JSONObject"%>
<%@page import="data.dao.guestDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	// num 읽기
	String num=request.getParameter("num");
	
	guestDao dao=new guestDao();
	dao.updateChu(num);
	
	// 증가된 chu 값
	int chu=dao.getData(num).getChu();
	
	// 증가된 추천수 값 json 파싱
	JSONObject ob=new JSONObject();
	ob.put("chu", chu);
	
%>
<%=ob.toString()%>