<%@page import="myworld.model.WorldDao"%>
<%@page import="myworld.model.WorldDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	// 한글 엔코딩 - post 방식으로 넘어가기 때문에
	request.setCharacterEncoding("utf-8");
	
	// num, writer, content, avata
	String num=request.getParameter("unum");
	String writer=request.getParameter("uwriter");
	String content=request.getParameter("ucontent");
	String avata=request.getParameter("uavata");
	
	// dto 담기
	WorldDto dto=new WorldDto();
	dto.setNum(num);
	dto.setWriter(writer);
	dto.setContent(content);
	dto.setAvata(avata);
	
	// dao 선언
	WorldDao dao=new WorldDao();
	
	// 수정메서드 호출 (비동기방식(ajax)이므로 redirect만 안해줌 나머지 동일)
	dao.updateWorld(dto); 
	
%>