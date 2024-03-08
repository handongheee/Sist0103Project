/*package myworld.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;

public class WorldDao {
	DbConnect db=new DbConnect();
	
	// 추가
	public void insertWorld(WorldDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="insert into myworld values(null,?,?,?,now())";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getAvata());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	// 전체조회
	public List<WorldDto> getAllMyWorld(){
		List<WorldDto> list=new Vector<WorldDto>();
			
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from myworld order by num desc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				WorldDto dto=new WorldDto();
				
				// db를 읽어서 dto에 추가
				dto.setNum(rs.getString("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setAvata(rs.getString("avata"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				
				// 추가한 dto를 list에 추가
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return list;
	}
}*/

package myworld.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;

public class WorldDao {

	DbConnect db=new DbConnect();
	
	// 추가
	public void insertWorld(WorldDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="insert into myworld values(null,?,?,?,now())";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getAvata());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}				
	}
	
	// 전체조회
	public List<WorldDto> getAllMyWorld() {
		List<WorldDto> list=new Vector<WorldDto>();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from myworld order by num desc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				WorldDto dto=new WorldDto();
				
				dto.setNum(rs.getString("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setAvata(rs.getString("avata"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		
		return list;
	}
	
	// 삭제
	public void deleteWorld(String num) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="delete from myworld where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num); // 바인딩
			pstmt.execute(); // 실행
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	// num에 해당하는 dto 반환 - 해당하는 데이터 띄워주기 위함
	public WorldDto getData(String num) {
		WorldDto dto=new WorldDto();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from myworld where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setNum(rs.getString("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setAvata(rs.getString("avata"));
				dto.setWriteday(rs.getTimestamp("writeday"));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}		
		return dto;
	}
	
	// 수정
	public void updateWorld (WorldDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="update myworld set writer=?, content=?, avata=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			// 바인딩
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getAvata());
			pstmt.setString(4, dto.getNum());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
}
