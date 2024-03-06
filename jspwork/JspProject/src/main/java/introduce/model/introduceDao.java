package introduce.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import mysql.db.DbConnect;

public class introduceDao {
	DbConnect db=new DbConnect();
	
	public void insertIntroduce(introduceDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="insert into introduce (name, age, birthday, hometown, hobby, memo) values ()";
		
		pstmt=conn.prepareStatement(sql);
	}

}
