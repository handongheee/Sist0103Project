<%@page import="myinfo.db.MyInfoDao"%>
<%@page import="myinfo.db.MyInfoDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	// 삭제할 항목의 num 값 넘겨 받음
	String num=request.getParameter("num");
	
	// dao 선언 후, delete dao에 넘겨받은 num 넣음
	MyInfoDao dao=new MyInfoDao();
	dao.deleteMyInfo(num);
	
	// 리스트로 연결
	response.sendRedirect("infoList.jsp");
%>	