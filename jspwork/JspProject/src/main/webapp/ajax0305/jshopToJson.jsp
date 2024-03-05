<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="mysql.db.DbConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	DbConnect db=new DbConnect();
	Connection conn=db.getConnection();
	Statement stmt=null;
	ResultSet rs=null;
	
	String sql="select * from jshop order by num";
	
	try{
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		
		// 배열선언
		JSONArray arr=new JSONArray();
		while(rs.next()){
			String num=rs.getString("num");
			String sangpum=rs.getString("sangpum");
			String color=rs.getString("color");
			String price=rs.getString("price");
			String imageName=rs.getString("imagename");
			
			// 각각을 오브젝트에 담음
			JSONObject ob=new JSONObject();
			ob.put("num", num);
			ob.put("sangpum", sangpum);
			ob.put("color", color);
			ob.put("price", price);
			ob.put("imagename", imageName);
			
			// array에 추가
			arr.add(ob);
		} %>
		
		<%--배열을 스트링으로 출력 --%>
		<%=arr.toString() %>
		
	<%} catch(SQLException e){
		
	} finally{
		db.dbClose(rs, stmt, conn);
	}
	
%>
