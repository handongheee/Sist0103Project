<%@page import="myinfo.db.MyInfoDao"%>
<%@page import="myinfo.db.MyInfoDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String name=request.getParameter("name");
	String blood=request.getParameter("blood");
	String hp1=request.getParameter("hp1");
	String hp2=request.getParameter("hp2");
	String hp3=request.getParameter("hp3");
	String birth=request.getParameter("birth");
	
	String hp=request.getParameter("hp1")+"-"+request.getParameter("hp2")+"-"+request.getParameter("hp3");
	//String hp=hp1+"-"+hp2+"-"+hp3;
	
	MyInfoDto dto=new MyInfoDto();
	dto.setName(name);
	dto.setBlood(blood);
	dto.setHp(hp);
	dto.setBirth(birth);
		
	MyInfoDao dao=new MyInfoDao();
	dao.insertMyInfo(dto);
	
	response.sendRedirect("infoList.jsp"); // 동기식
%>