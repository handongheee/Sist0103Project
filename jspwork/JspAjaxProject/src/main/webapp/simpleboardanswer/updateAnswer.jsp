<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<jsp:useBean id="dto" class="simpleboardAnswer.model.SimpleAnswerDto"/>
<jsp:useBean id="dao" class="simpleboardAnswer.model.SimpleAnswerDao"/>
<jsp:setProperty property="*" name="dto"/>
<%
	dao.updateAnswer(dto);	
%>
