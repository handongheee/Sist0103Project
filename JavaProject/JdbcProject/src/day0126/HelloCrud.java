package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDB.DbConnect;

public class HelloCrud {

	DbConnect db = new DbConnect();
	
	// insert
	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name, addr;
		String sql=""; // 변수선언
		
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		
		System.out.println("주소를 입력하세요");
		addr=sc.nextLine();
		
		sql="insert into hello values (seq0.nextval, '"+name+"', '"+addr+"', sysdate)";
		System.out.println(sql);
		
		// 1. db 연결
		Connection conn=null;
		// 2. statement
		Statement stmt=null; // sql문 객체 전송에 필요한 API
		
		conn=db.getOracle(); // 계정 가져오기
		
		try {
			stmt=conn.createStatement();
			
			// 3. sql문 실행 (execute:단순전송)
			stmt.execute(sql);
			System.out.println("데이터 추가됨 insert");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	
	// select(에만 ResultSet 필요)
	public void select() {
		System.out.println("시퀀스\t이름\t주소\t가입일");
		System.out.println("-------------------------------");
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from hello order by num";
		
		conn=db.getOracle();
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			// 2개 이상 데이터 가져올 땐 while(if는 하나)
			while(rs.next()) {
				// 방식01
//				int num=rs.getInt("num");
//				String name=rs.getString("name");
//				String addr=rs.getString("addr");
//				String date=rs.getString("sdate"); //String date=rs.getDate("sdate").toString();
//				System.out.println(num+"\t"+name+"\t"+addr+"\t "+date);
				
				// 방식02
				System.out.println(rs.getInt("num")+"\t"+rs.getString("name")+"\t"+rs.getString("addr")+"\t"+rs.getDate("sdate"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	
	// delete
	public void delete() {
		// 삭제할 번호 입력 후 삭제
		Scanner sc = new Scanner(System.in);
		String num;
		String sql=""; 
		
		System.out.println("삭제할 번호 입력");
		num=sc.nextLine();
		
		sql="delete from hello where num="+num;
		
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		
		conn=db.getOracle();
		
		try {
			stmt=conn.createStatement();
			int a = stmt.executeUpdate(sql); // 성공한 레코드의 개수
			
			// 없는 번호 입력 시 실제 삭제가 안되므로 0 반환됨
			if(a==0) {
				System.out.println("없는 데이터 번호입니다");
			} else {
				System.out.println("** 삭제되었습니다 **");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
		
	}
	
	// 수정하려는 데이터 조회
	public boolean getOneData(String num) {
		boolean flag=false; // 시퀀스에 해당하는 데이터가 있으면 true 반환 없으면 false 반환
		String sql="select * from hello where num="+num;
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		conn=db.getOracle();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			// 한개만 조회할 경우는 if문
			if(rs.next()) { // 데이터가 있는 경우
				flag=true;
			} else {
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
	
	// 수정 update
	public void update() {
		// 수정할 시퀀스를 입력 후 이름, 주소 입력
		Scanner sc = new Scanner(System.in);
		String num, name, addr;
		
		System.out.println("수정할 번호를 입력");
		num=sc.nextLine();
		
		if(!this.getOneData(num)) { // !getOneData(num))
			System.out.println("해당 번호는 존재하지 않습니다");
			return; // 메서드 종료
		}
		
		System.out.println("수정할 이름으로 변경해주세요");
		name=sc.nextLine();
		
		System.out.println("수정할 주소로 변경해주세요");
		addr=sc.nextLine();
		
		String sql="update hello set name='"+name+"', addr='"+addr+"' where num="+num;
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		
		conn=db.getOracle();
		try {
			stmt=conn.createStatement();
			//stmt.execute(sql); // boolean 반환
			int a=stmt.executeUpdate(sql); // string 반환
			
			if(a==0) {
				System.out.println("수정할 데이터가 존재하지 않습니다.");
			} else {
				System.out.println("** 수정되었습니다 **");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloCrud hc=new HelloCrud();
		
		Scanner sc = new Scanner(System.in); 
		
		int n;
		
		while(true) {
			System.out.println("** Hello DB 연습 **");
			System.out.println("1.insert  2.select  3.delete  4.update  9. exit");
			
			n=Integer.parseInt(sc.nextLine()); // 버퍼 먹기 때문에 형변환
			
			if(n==1) {
				hc.insert();
			} else if(n==2) {
				hc.select();
			} else if(n==3) {
				hc.delete();
			} else if(n==4) {
				hc.update();
			} else if(n==9) {
				System.out.println("종료할게요~");
				break;
			}
			
		}
	
	}

}
