package day0130;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import oracleDB.DbConnect;

public class SwingJdbcScore extends JFrame implements ActionListener{
	DbConnect db=new DbConnect();
	Container cp; 
	
	DefaultTableModel model; // 테이블에 대한 추가, 삭제 시 DefaultTableModel
	JTable table;
	JButton btnAdd, btnDel, btnUpdate; 
	
	// 생성자
	public SwingJdbcScore(String title) {
		super(title);
		cp = this.getContentPane();
		this.setBounds(700, 400, 400, 300); // 위치x,위치y,크기x,크기y
		cp.setBackground(new Color(255, 255, 200));
		
		initDesign();
		
		this.setVisible(true);

	}
	
	// 테이블에 출력하는 메서드
	public void tableWrite() {
		// 테이블 초기화
		model.setRowCount(0); // ==> 테이블행 하나도 없다 (0행)
		
		// db 연결
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null; // ResultSet: 조회/출력에서만 사용, db를 테이블형태로 가지고 오는것
		
		String sql="select * from stuinfo0130 order by num";
		
		conn=db.getOracle();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery(); 
			
			while(rs.next()) {
				Vector<String> data=new Vector<String>(); // 벡터: 배열은 고정형이므로 벡터/arraylist 같은 컬렉션 객체를 통해 데이터를 무한대로 추가 가능
				// 데이터화, 벡터에 꾸러미로 묶음
				data.add(rs.getString("num")); 
				data.add(rs.getString("name"));
				data.add(rs.getString("ban"));
				data.add(rs.getString("java"));
				data.add(rs.getString("jsp"));
				data.add(rs.getString("spring"));
				data.add(rs.getString("total"));
				data.add(rs.getString("average"));
				
				System.out.println("test");
				// 테이블에 추가
				model.addRow(data);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}
	
	// 디자인
	public void initDesign() {
		String [] title= {"번호","이름","반","Java","JSP","Spring","총점","평균"}; // 배열선언
		
		model=new DefaultTableModel(title, 0); // 0 데이터 없음이라는 뜻
		table=new JTable(model);
		this.add("Center", new JScrollPane(table)); // 스크롤팬 생성 후 스크롤팬에 테이블 넣기
		
		// 테이블에 db데이터 출력
		tableWrite(); // 호출
		
		
		// 버튼 3개 올릴 패널(공간)
		JPanel pTop=new JPanel();
		this.add("North",pTop);
		
		// 추가버튼
		btnAdd=new JButton("추가"); // 생성
		btnAdd.addActionListener(this);
		pTop.add(btnAdd);
		
		// 삭제버튼
		btnDel=new JButton("삭제");
		btnDel.addActionListener(this);
		pTop.add(btnDel);
		
		// 수정버튼
		btnUpdate=new JButton("수정");
		btnUpdate.addActionListener(this);
		pTop.add(btnUpdate);
				
	}
	
	
	// 미완의 메서드 추가
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		
		if(ob==btnAdd) {
			System.out.println("add"); // test
			// 실제 코드는 여기서........................................
			
		} else if(ob==btnDel) {
			System.out.println("del");
		} else if(ob==btnUpdate) {
			System.out.println("update");
		}
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingJdbcScore("학생 성적 관리 DB");
		
	}

}
