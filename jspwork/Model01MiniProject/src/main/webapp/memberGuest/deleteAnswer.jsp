<%@page import="data.dao.answerGuestDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String idx=request.getParameter("idx");
  answerGuestDao dao=new answerGuestDao();
  dao.deleteAnswer(idx);
%>
