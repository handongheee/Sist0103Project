<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="myworld.model.WorldDto"%>
<%@page import="myworld.model.WorldDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	// 하나의 dto값 위해 json 파싱
	
	WorldDao dao=new WorldDao();

	String num=request.getParameter("num");
	
	// getData 호출해서 dto로 넣음
	WorldDto dto=dao.getData(num);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	// 하나의 값만 필요함으로 JSONObject 형식으로 put에 담아서 파싱
	JSONObject ob=new JSONObject();
	ob.put("num", dto.getNum());
	ob.put("writer", dto.getWriter());
	ob.put("content", dto.getContent());
	ob.put("avata", dto.getAvata());
	ob.put("writeday", sdf.format(dto.getWriteday()));
%>

<%=ob.toString()%>