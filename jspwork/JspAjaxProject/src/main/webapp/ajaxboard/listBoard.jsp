<%@page import="org.json.simple.JSONObject"%>
<%@page import="ajaxboard.AjaxBoardDto"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="ajaxboard.AjaxBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	AjaxBoardDao dao=new AjaxBoardDao();
	List<AjaxBoardDto> list=dao.getAllDatas(); 
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
	JSONArray arr=new JSONArray(); // json 생성
	
	// dto에 list 대입
	for(AjaxBoardDto dto:list){
		JSONObject ob=new JSONObject(); 
		ob.put("num", dto.getNum());
		ob.put("writer", dto.getWriter());
		ob.put("subject", dto.getSubject());
		ob.put("content", dto.getContent());
		ob.put("avata", dto.getAvata());
		ob.put("writeday", sdf.format(dto.getWriteday()));
		
		arr.add(ob);
	}

%>

<%= 
	// 객체들이 갖고 있는 모든 정보를 문자열로 변환해서 리턴
	arr.toString()
%>