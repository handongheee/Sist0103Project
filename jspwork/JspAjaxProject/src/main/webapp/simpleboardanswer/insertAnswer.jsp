<%@page import="simpleboardAnswer.model.SimpleAnswerDao"%>
<%@page import="simpleboardAnswer.model.SimpleAnswerDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	/* 방법01
	String num=request.getParameter("num");
	String nickname=request.getParameter("nickname");
	String content=request.getParameter("content");
	
	SimpleAnswerDto dto=new SimpleAnswerDto();
	dto.setNum(num);
	dto.setNickname(nickname);
	dto.setContent(content);
	
	SimpleAnswerDao dao=new SimpleAnswerDao();
	dao.insertAnswer(dto);
*/
%>
<jsp:useBean id="dto" class="simpleboardAnswer.model.SimpleAnswerDto"/>
<jsp:useBean id="dao" class="simpleboardAnswer.model.SimpleAnswerDao"/>
<jsp:setProperty property="*" name="dto"/>
<%
	dao.insertAnswer(dto);
%>	
