package mysql.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnect {
	static final String MYSQLDRIVER = "com.mysql.cj.jdbc.Driver"; // 상수
	static final String MYSQL_URL = "jdbc:mysql://localhost:3306/coffee";
	

	public DbConnect() {
		try {
			Class.forName(MYSQLDRIVER);
			System.out.println("드라이버 연결 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("mysql 드라이버 실패: " + e.getMessage());
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(MYSQL_URL, "han", "1234");
			System.out.println("mysql 계정 연결 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("mysql 연결 실패: " + e.getMessage());
		}
		return conn;
	}

	// close 총 4개 오버로딩
	public void dbClose(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dbClose(Statement stmt, Connection conn) {
		try {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dbClose(PreparedStatement pstmt, Connection conn) {
		try {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		DbConnect db=new DbConnect();
//	}

}
