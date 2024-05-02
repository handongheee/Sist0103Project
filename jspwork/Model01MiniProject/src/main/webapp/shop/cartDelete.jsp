<%@page import="data.dao.shopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	// 삭제 처리 ajax
	String idx=request.getParameter("idx");
	shopDao dao=new shopDao();
	dao.deleteCart(idx);
%>
