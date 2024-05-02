package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDB.DbConnect;

public class QuizStuInfo {

	DbConnect db = new DbConnect();

	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name, gender, hp;
		int age;
		String sql="";

		System.out.println("이름을 입력하세요");
		name=sc.nextLine();

		System.out.println("성별을 입력하세요");
		gender=sc.nextLine();

		System.out.println("나이를 입력하세요");
		age=Integer.parseInt(sc.nextLine());

		System.out.println("연락처를 입력하세요");
		hp=sc.nextLine();

		sql="insert into stuinfo values (seq_info.nextval, '"+name+"', '"+gender+"', '"+age+"', '"+hp+"', sysdate)";
		System.out.println(sql);

		Connection conn=null;
		Statement stmt=null;

		conn=db.getOracle();
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}

	public void select() {
		System.out.println("s_no\ts_name\ts_gender s_age\ts_hp\tgaipday");
		System.out.println("-------------------------------------------------------------");
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from stuinfo";
		
		conn=db.getOracle();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int s_no=rs.getInt("s_no");
				String s_name=rs.getString("s_name");
				String s_gender=rs.getString("s_gender");
				int s_age=rs.getInt("s_age");
				String s_hp=rs.getString("s_hp");
				String gaipday=rs.getDate("gaipday").toString();
				
				System.out.println(s_no+"\t"+s_name+"\t"+s_gender+"\t"+s_age+"\t"+s_hp+"\t"+gaipday);	
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		String n;
		String sql="";
		
		System.out.println("삭제할 번호를 입력하세요");
		n=sc.nextLine();
		
		sql="delete from stuinfo where s_no="+n;
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		
		conn=db.getOracle();
		try {
			stmt=conn.createStatement();
			int a=stmt.executeUpdate(sql);
			
			if(a==0) {
				System.out.println("삭제 실패하였습니다");
			} else {
				System.out.println("삭제 성공");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}

	}
	
	public boolean Data(String num) {
		boolean flag=false;
		String sql="select * from stuinfo where s_no="+num;
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		conn=db.getOracle();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				flag=true;
			}else {
				flag=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		return flag;
	}

	public void update() {
		Scanner sc = new Scanner(System.in);
		String n, name, gender, age, hp;
		String sql="";
		
		System.out.println("수정할 번호를 입력하세요");
		n=sc.nextLine();
		
		if(!this.Data(n)) {
			System.out.println("데이터가 없습니다.");
			return;
		}		
		
		System.out.println("수정할 이름을 입력하세요");
		name=sc.nextLine();
		
		System.out.println("수정할 성별을 입력하세요");
		gender=sc.nextLine();
		
		System.out.println("수정할 나이를 입력하세요");
		age=sc.nextLine();
		
		System.out.println("수정할 전화번호를 입력하세요");
		hp=sc.nextLine();
	
		
		sql="update stuinfo set s_name='"+name+"', s_gender='"+gender+"', s_age='"+age+"', s_hp='"+hp+"' where s_no="+n;
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		
		conn=db.getOracle();
		
		try {
			stmt=conn.createStatement();
			int a = stmt.executeUpdate(sql);
			
			if(a==0) {
				System.out.println("수정할 데이터 없음");
			} else {
				System.out.println("수정되었습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	public void namesearch() {
		Scanner sc = new Scanner(System.in);
		String search;
		String sql="";
		
		System.out.println("검색할 이름을 적으세요");
		search=sc.nextLine();
		
		sql="select * from stuinfo where s_name LIKE '%"+search+"%'";
		System.out.println(sql);
		
		System.out.println("s_no\ts_name\ts_gender s_age\ts_hp\tgaipday");
		System.out.println("-------------------------------------------------------------");
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		conn=db.getOracle();
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int s_no=rs.getInt("s_no");
				String s_name=rs.getString("s_name");
				String s_gender=rs.getString("s_gender");
				int s_age=rs.getInt("s_age");
				String s_hp=rs.getString("s_hp");
				String gaipday=rs.getDate("gaipday").toString();
				
				System.out.println(s_no+"\t"+s_name+"\t"+s_gender+"\t"+s_age+"\t"+s_hp+"\t"+gaipday);	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizStuInfo qu = new QuizStuInfo();

		Scanner sc = new Scanner(System.in);
		int n;

		while(true) {
			System.out.println("1.학생정보입력  2.정보출력  3.정보삭제  4. 학생정보수정  5.학생검색  9.종료");
			n=Integer.parseInt(sc.nextLine());

			if(n==1) {
				qu.insert();
			} else if (n==2) {
				qu.select();
			} else if (n==3) {
				qu.delete();
			} else if(n==4) {
				qu.update();
			} else if(n==5) {
				qu.namesearch();
			} else if(n==9) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}

}
