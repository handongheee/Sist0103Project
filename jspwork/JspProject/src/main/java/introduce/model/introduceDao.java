package introduce.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mysql.db.DbConnect;

public class introduceDao {
	DbConnect db=new DbConnect();
	
	public void insertIntroduce(introduceDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		String sql="insert into introduce (name, age, birthday, hometown, hobby, memo) values (?,?,?,?,?,?)";

		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAge());
			pstmt.setString(3, dto.getBirthday());
			pstmt.setString(4, dto.getHometown());
			pstmt.setString(5, dto.getHobby());
			pstmt.setString(6, dto.getMemo());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

}
