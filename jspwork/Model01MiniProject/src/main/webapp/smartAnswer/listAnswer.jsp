<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="data.dto.smartAnswerDto"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.smartAnswerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String num=request.getParameter("num");
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	smartAnswerDao dao=new smartAnswerDao();
	List<smartAnswerDto> list=dao.getAnswerList(num);
	
	JSONArray arr=new JSONArray();
	
	for(smartAnswerDto dto:list){
		JSONObject ob=new JSONObject();
		ob.put("num", dto.getNum());
		ob.put("idx", dto.getIdx());
		ob.put("nick", dto.getNickname());
		ob.put("content", dto.getContent());
		ob.put("writeday", sdf.format(dto.getWriteday()));
		
		arr.add(ob);
	}
%>
<%=arr.toString()%>