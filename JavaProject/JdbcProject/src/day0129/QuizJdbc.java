package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracleDB.DbConnect;

public class QuizJdbc {
	
	DbConnect db=new DbConnect();
	Scanner sc=new Scanner(System.in);
	
	public void insertMember() {
		System.out.println("사원 이름?");
		String s_name=sc.nextLine();
		
		System.out.println("부서?");
		String buseo=sc.nextLine();
		
		System.out.println("직급?");
		String position=sc.nextLine();
		
		System.out.println("성별?");
		String gender=sc.nextLine();
		
		System.out.println("월급여?");
		int pay=Integer.parseInt(sc.nextLine());
		
		System.out.println("보너스?");
		int bonus=Integer.parseInt(sc.nextLine());
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		String sql="insert into sawonmember values (seq_smem.nextval, ?,?,?,?,?,?,sysdate)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, s_name);
			pstmt.setString(2, buseo);
			pstmt.setString(3, position);
			pstmt.setString(4, gender);
			pstmt.setInt(5, pay);
			pstmt.setInt(6, bonus);
			
			pstmt.execute();		
			
			System.out.println("추가되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}		
	}
	
	public void writeMember(){
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="Select s_no, s_name, buseo, position, gender, to_char(pay, 'L999,999,999') pay, to_char(bonus, 'L999,999,999') bonus, ipsaday from sawonmember order by s_no asc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t보너스\t입사일");
			System.out.println("-----------------------------------------------------------------");
			
			while(rs.next()) {	
				System.out.println(rs.getInt("s_no")+"\t"+rs.getString("s_name")+"\t"+rs.getString("buseo")+"\t"+rs.getString("position")+"\t"+rs.getString("gender")+" "+rs.getString("pay")+" "+rs.getString("bonus")+" "+rs.getDate("ipsaday").toString());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		
	}
	
	public void deleteMember() {
		System.out.println("삭제할 사원번호를 입력하시오");
		int n=Integer.parseInt(sc.nextLine());
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		String sql="delete from sawonmember where s_no=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, n);
			int a=pstmt.executeUpdate();
			
			if(a==0) {
				System.out.println(n+"번은 없는 사원번호 입니다.");
			} else {
				System.out.println(n+"번 사원이 삭제되었습니다.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}	
	}
	
	public void updateMember() {
		System.out.println("수정할 사원번호 입력하시오");
		int num=Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 부서명?");
		String buseo=sc.nextLine();
		
		System.out.println("수정할 직급?");
		String position=sc.nextLine();
		
		System.out.println("수정할 급여?");
		int pay=Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 보너스?");
		int bonus=Integer.parseInt(sc.nextLine());
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		String sql="update sawonmember set buseo=?, position=?, pay=?, bonus=? where s_no=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, buseo);
			pstmt.setString(2, position);
			pstmt.setInt(3, pay);
			pstmt.setInt(4, bonus);
			pstmt.setInt(5, num);
			
			int b=pstmt.executeUpdate();
			
			if(b==0) {
				System.out.println(num+"번은 없는 사원번호입니다.");
			} else {
				System.out.println(num+"번 사원이 수정되었습니다.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void searchMember() {
		System.out.println("검색할 이름을 입력하시오");
		String name=sc.nextLine();
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t보너스\t입사일");
		System.out.println("-----------------------------------------------------------------");
		
		String sql="Select s_no, s_name, buseo, position, gender, to_char(pay, 'L999,999,999') pay, to_char(bonus, 'L999,999,999') bonus, ipsaday from sawonmember where s_name LIKE ?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, "%"+name+"%");
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("s_no")+"\t"+rs.getString("s_name")+"\t"+rs.getString("buseo")+"\t"+rs.getString("position")+"\t"+rs.getString("gender")+" "+rs.getString("pay")+" "+rs.getString("bonus")+" "+rs.getDate("ipsaday").toString());
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}	
	}
	
	public void process() {
		while(true) {
			System.out.println("1.사원정보입력  2.전체사원출력  3.사원삭제  4.사원수정  5.이름검색  9.시스템종료");
			int n=Integer.parseInt(sc.nextLine());
			
			switch(n){
			case 1:
				this.insertMember();
				break;
			case 2:
				this.writeMember();
				break;
			case 3:
				this.deleteMember();
				break;
			case 4:
				this.updateMember();
				break;
			case 5:
				this.searchMember();
				break;
			case 9:
				System.out.println("시스템 종료");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizJdbc qj=new QuizJdbc();
		qj.process();
	}

}
