<%@page import="ajaxboard.AjaxBoardDao"%>
<%@page import="ajaxboard.AjaxBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String num=request.getParameter("unum");
	String writer=request.getParameter("uwriter");
	String subject=request.getParameter("usubject");
	String avata=request.getParameter("uavata");
	String content=request.getParameter("ucontent");
	
	// dto 선언
	AjaxBoardDto dto=new AjaxBoardDto(); 
	// dto에 수정폼에서 전달받은 값들 set
	dto.setNum(num);
	dto.setWriter(writer);
	dto.setSubject(subject);
	dto.setAvata(avata);
	dto.setContent(content);
	
	// dao 선언
	AjaxBoardDao dao=new AjaxBoardDao(); 
	dao.updateBoard(dto); // 재정비한 dto값 넣어줌
%>
