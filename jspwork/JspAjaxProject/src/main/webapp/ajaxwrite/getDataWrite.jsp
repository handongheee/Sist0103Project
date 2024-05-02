<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="ajaxwrite.model.AjaxWriteDao"%>
<%@page import="ajaxwrite.model.AjaxWriteDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	String num=request.getParameter("num");
	AjaxWriteDao dao=new AjaxWriteDao();
	AjaxWriteDto dto=dao.getData(num);
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
	JSONObject ob=new JSONObject();	
	ob.put("writer", dto.getWriter());
	ob.put("subject", dto.getSubject());
	ob.put("story", dto.getStory());
	ob.put("image", dto.getImage());
	ob.put("likes", dto.getLikes());
	ob.put("writeday", sdf.format(dto.getWriteday()));

%>
<%=ob.toString() %>
