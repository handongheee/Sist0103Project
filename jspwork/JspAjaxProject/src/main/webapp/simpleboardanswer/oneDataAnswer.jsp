<%@page import="org.json.simple.JSONObject"%>
<%@page import="simpleboardAnswer.model.SimpleAnswerDto"%>
<%@page import="simpleboardAnswer.model.SimpleAnswerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	// 하나의 idx에 따른 dto를 json으로 파싱
	String idx=request.getParameter("idx");

	SimpleAnswerDao dao=new SimpleAnswerDao();
	SimpleAnswerDto dto=dao.getAnswerData(idx);
	
	JSONObject ob=new JSONObject();
	ob.put("idx", dto.getIdx());
	ob.put("nick", dto.getNickname());
	ob.put("content", dto.getContent());
%>
<%=ob.toString()%>