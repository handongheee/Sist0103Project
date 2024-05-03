package oracleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	// url 변수
	static final String ORACLE_DB="jdbc:oracle:thin:@localhost:1521:XE";

	// connect (void가 아니라 리턴 필수)
	public Connection getOracle() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(ORACLE_DB, "stu", "a1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("로컬 오라클 연결 실패!!!");
		}
		return conn;
	}

	// close 메서드 총 4개(오버로딩)
	// 1. rs, stmt, conn
	public void dbClose(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 2. stmt, conn
	public void dbClose(Statement stmt, Connection conn) {
		try {
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 3. rs, PreparedStatement(미완), conn
	public void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs!=null)
				rs.close();
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 4. pstmt, conn
	public void dbClose( PreparedStatement pstmt, Connection conn) {
		try {
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
