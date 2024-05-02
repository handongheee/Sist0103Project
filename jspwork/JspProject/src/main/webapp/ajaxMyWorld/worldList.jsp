<%@page import="java.text.SimpleDateFormat"%>	
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="myworld.model.WorldDto"%>
<%@page import="java.util.List"%>
<%@page import="myworld.model.WorldDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%	
	// json으로 파싱
	WorldDao dao=new WorldDao();
	// 목록 가져오기
	List<WorldDto> list=dao.getAllMyWorld();
	
	JSONArray arr=new JSONArray();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	// list를 dto타입에 전체 대입 size()와 같음?
	for(WorldDto dto:list){
		JSONObject ob=new JSONObject();
		ob.put("num", dto.getNum());
		ob.put("writer", dto.getWriter());
		ob.put("content", dto.getContent());
		ob.put("avata", dto.getAvata());
		//ob.put("writeday", dto.getWriteday()); // 타임스탬프 형태를 스트링에 담으면 안 됨 => sdf 필요
		ob.put("writeday", sdf.format(dto.getWriteday())); // sdf로 형태 변환해서 put에 담기
		
		// arr에 추가
		arr.add(ob);
	}
%>

<%=arr.toString()%>
