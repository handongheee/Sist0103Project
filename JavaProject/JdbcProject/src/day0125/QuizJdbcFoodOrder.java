package day0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizJdbcFoodOrder {
	
	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void foodOrder() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select j.order_num, f.pno, j.order_name, f.fname, to_char(f.price, 'L999,999') price, f.fshopname, f.shoploc, j.order_addr from foodshop f, jumun j where f.pno=j.pno order by order_name asc";
		
		try {
			conn=DriverManager.getConnection(URL, "stu", "a1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("주문번호\t음식번호\t주문자\t음식명\t가격\t상호명\t상점위치\t주문자위치");
			System.out.println("---------------------------------------------------------------------------------");
			
			while(rs.next()) {
				int order_num=rs.getInt("order_num");
				int pno=rs.getInt("pno");
				String order_name=rs.getString("order_name");
				String fname=rs.getString("fname");
				String price=rs.getString("price");
				String fshopname=rs.getString("fshopname");
				String shoploc=rs.getString("shoploc");
				String order_addr=rs.getString("order_addr");
				
				System.out.println(order_num+"\t"+pno+"\t"+order_name+"\t"+fname+"\t"+price+"\t"+fshopname+"\t"+shoploc+"\t-"+order_addr);
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizJdbcFoodOrder fo = new QuizJdbcFoodOrder();
		fo.foodOrder();
	}

}
