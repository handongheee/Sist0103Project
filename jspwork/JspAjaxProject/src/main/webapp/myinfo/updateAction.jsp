<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String hp=request.getParameter("hp1")+"-"+request.getParameter("hp2")+"-"+request.getParameter("hp3");
%>

<jsp:useBean id="dao" class="myinfo.db.MyInfoDao"/>
<jsp:useBean id="dto" class="myinfo.db.MyInfoDto"/>
<jsp:setProperty property="*" name="dto"/>

<%
	dto.setHp(hp);
	dao.updateMyInfo(dto);
	response.sendRedirect("infoList.jsp");
%>	