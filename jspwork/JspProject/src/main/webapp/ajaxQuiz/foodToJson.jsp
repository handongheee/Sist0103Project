<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="mysql.db.DbConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
	DbConnect db=new DbConnect();
	Connection conn=db.getConnection();
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	String sql="select * from food order by num";
	
	try{
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		JSONArray arr=new JSONArray();
		while(rs.next()){
			String num=rs.getString("num");
			String name=rs.getString("foodname");
			String photo=rs.getString("foodphoto");
			String price=rs.getString("price");
			String cnt=rs.getString("cnt");
			
			JSONObject ob=new JSONObject();
			ob.put("num", num);
			ob.put("name", name);
			ob.put("photo", photo);
			ob.put("price", price);
			ob.put("cnt", cnt);
			
			arr.add(ob);			
		}%>
		<%=arr.toString() %>
		
	<%} catch(SQLException e){
		
	} finally{
		db.dbClose(rs, pstmt, conn);
		
	}
	

%>
