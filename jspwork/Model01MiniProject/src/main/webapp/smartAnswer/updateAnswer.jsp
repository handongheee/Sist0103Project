<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="data.dao.smartAnswerDao"/>
<jsp:useBean id="dto" class="data.dto.smartAnswerDto"/>
<jsp:setProperty property="*" name="dto"/>
<%
	dao.updateAnswer(dto);
%>