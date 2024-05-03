package day0131;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import oracleDB.DbConnect;

public class ShopDbModel {
	// 02	
	DbConnect db=new DbConnect();
	
	// 04
	// 추가 메서드
	public void insertShop(ShopDto dto) {
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		String sql="insert into sshop values (seq0.nextval,?,?,?,?,sysdate)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			// 바인딩, dto에서 가지고 옴
			pstmt.setString(1, dto.getSangpum()); 
			pstmt.setString(2, dto.getPhoto());
			pstmt.setInt(3, dto.getSu());
			pstmt.setInt(4, dto.getDan());
			
			// 업데이트
			pstmt.execute();		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	// 06
	// 전체조회
	public Vector<ShopDto> getAllSangpums(){
		// shopdto를 꾸러미로 묶음
		Vector<ShopDto> list=new Vector<ShopDto>();
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from sshop order by sangpum";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				// db에서 하나의 레코드(행)를 읽어서 dto에 넣는다
				ShopDto dto=new ShopDto();
				
				// 레코드 하나
				dto.setNum(rs.getString("num")); // rs에 있는 값 dto에 set해줌
				dto.setSangpum(rs.getString("sangpum"));
				dto.setPhoto(rs.getString("photo"));
				dto.setSu(rs.getInt("su"));
				dto.setDan(rs.getInt("dan"));
				dto.setGuipday(rs.getDate("guipday"));
				//
				
				// list에 dto 추가
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return list; // 꾸러미 리턴
	}
	
	// 삭제
	
	// 수정
}
