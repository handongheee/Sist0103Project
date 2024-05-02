package introduce.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;

public class introduceDao {
	DbConnect db=new DbConnect();
	
	// 추가 insert
	public void insertIntroduce(introduceDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		String sql="insert into introduce (name, age, birthday, hometown, hobby, memo) values (?,?,?,?,?,?)";
		//String sql="insert into introduce values (null, ?,?,?,?,?,?)"
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			// 순서대로 바인딩
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAge());
			pstmt.setString(3, dto.getBirthday());
			pstmt.setString(4, dto.getHometown());
			pstmt.setString(5, dto.getHobby());
			pstmt.setString(6, dto.getMemo());
			
			// 실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	// 전체 조회
	public List<introduceDto> getAllDatas(){
		List<introduceDto> list=new Vector<introduceDto>();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from introduce order by num";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				introduceDto dto=new introduceDto();
				
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setBirthday(rs.getString("birthday"));
				dto.setHobby(rs.getString("hobby"));
				dto.setHometown(rs.getString("hometown"));
				dto.setMemo(rs.getString("memo"));
				dto.setAge(rs.getString("age"));
				
				list.add(dto);
			}
			
		} catch(SQLException e) {
			
		} finally {
			db.dbClose(rs, pstmt, conn);
		}	
		
		return list;
	}
	
	// detailView - num에 해당하는 하나의 dto 반환
	public introduceDto getOneData(String num) {
		introduceDto dto=new introduceDto();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from introduce where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setBirthday(rs.getString("birthday"));
				dto.setHobby(rs.getString("hobby"));
				dto.setHometown(rs.getString("hometown"));
				dto.setMemo(rs.getString("memo"));
				dto.setAge(rs.getString("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}		
		return dto;
	}
	
	// 수정(나이, 생년월일, 거주지, 취미, 성격)
	public void updateIntroduce(introduceDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="update introduce set age=?, birthday=?, hometown=?, hobby=?, memo=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getAge());
			pstmt.setString(2, dto.getBirthday());
			pstmt.setString(3, dto.getHometown());
			pstmt.setString(4, dto.getHobby());
			pstmt.setString(5, dto.getMemo());
			pstmt.setString(6, dto.getNum());
	
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	// 삭제 (해당 num db 삭제)
	public void deleteIntroduce(String num) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="delete from introduce where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	
	
	
}
