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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import oracleDB.DbConnect;

public class SwingJdbcScore extends JFrame implements ActionListener{
	// 1. 선언
	DbConnect db=new DbConnect();
	Container cp; 
	
	DefaultTableModel model; // 테이블에 대한 추가/삭제 시 DefaultTableModel, 불러오기만 하려면 jtable
	JTable table; 
	JButton btnAdd, btnDel, btnUpdate; 
	
	AddStuInfo addForm=new AddStuInfo("성적 추가");
	UpdateStuInfo updateForm=new UpdateStuInfo("데이터 수정");
	
	// 2. 생성자
	public SwingJdbcScore(String title) {
		super(title);
		cp = this.getContentPane();
		this.setBounds(700, 400, 400, 300); // 위치x,위치y,크기x,크기y
		cp.setBackground(new Color(255, 255, 200));
		
		initDesign();
		
		this.setVisible(true);
	}
	
	// 5. select - 테이블에 출력하는 메서드 
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
	
	// 6. insert
	public void insertData() {
		String name=addForm.tfName.getText(); // 이름 값 가져옴
		String java=addForm.tfJava.getText();
		String jsp=addForm.tfJsp.getText();
		String spring=addForm.tfSpring.getText();
		String ban=(String)addForm.cbBan.getSelectedItem(); // getSelectedItem: 콤보 값 가져옴
		
		// 총점
		int tot=Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		// 평균
		double avg=tot/3.0;
		
		String sql="insert into stuinfo0130 values (seq0.nextval, ?,?,?,?,?,?,?)";
		
		// db 연결, sql전송
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			// 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, ban);
			
			// 업데이트
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}		
	}
	
	// delete, 파라미터값 넘김
	public void deleteData(String num) {
		String sql="delete from stuinfo0130 where num="+num;
		
		// sql문 실행 후 해당 번호가 없으면 메세지, 삭제되면 tableWrite() 호출
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			int a=pstmt.executeUpdate();
			
			if (a==0) {
				JOptionPane.showMessageDialog(this, "없는 데이터 번호입니다.");
			} else {
				tableWrite();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}		
	}
	
	// update
	public void updateData() {
		String num=updateForm.num; // 수정할 번호 가져옴 (히든num)
		String name=updateForm.tfName.getText();
		String java=updateForm.tfJava.getText();
		String jsp=updateForm.tfJsp.getText();
		String spring=updateForm.tfSpring.getText();
		String ban=(String)updateForm.cbBan.getSelectedItem();
		
		// 총점
		int tot=Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		// 평균
		double avg=tot/3.0;
		
		// update는 순서 상관 없음
		String sql="update stuinfo0130 set name=?, java=?, jsp=?, spring=?, total="+tot+", average="+avg+", ban=? where num=?";
		System.out.println(sql);
		
		// db 연결
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			// 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setString(5, ban);
			pstmt.setString(6, num);
			
			// 업데이트
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}	
	
	// 3. 디자인
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
		// 추가폼에 있는 추가버튼에 액션 추가 AddStuInfo
		addForm.btnAdd.addActionListener(this);
		
		// 삭제버튼
		btnDel=new JButton("삭제");
		btnDel.addActionListener(this);
		pTop.add(btnDel);
		
		// 수정버튼
		btnUpdate=new JButton("수정");
		btnUpdate.addActionListener(this);
		pTop.add(btnUpdate);
		// 수정폼에 있는 수정버튼에 액션 추가
		updateForm.btnMod.addActionListener(this);
				
	}
	
	// 4. 미완의 메서드 추가
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		
		if(ob==btnAdd) {
			// System.out.println("add");
			addForm.setVisible(true); // 생성한 addForm 보여지게
			
		} else if(ob==addForm.btnAdd) { // 학생추가폼의 버튼 이벤트
			// 입력하는 데이터를 읽어서 db에 추가
			insertData(); // db에 들어간거 확인
			
			// 테이블 다시 출력
			tableWrite();
			
			// 추가창 초기화하면서 사라지게
			addForm.tfName.setText(""); // 텍스트필드 초기화
			addForm.tfJava.setText("");
			addForm.tfJsp.setText("");
			addForm.tfSpring.setText("");
			addForm.setVisible(false); // 창 닫기
			
		} else if(ob==btnDel) {
			//System.out.println("del");
			// 다이얼로그 입력창
			String num=JOptionPane.showInputDialog("삭제할 시퀀스를 입력해주세요.");
			
			// 삭제 메서드 호출
			deleteData(num);	
			
		} else if(ob==btnUpdate) {
			//System.out.println("update");
			String num=JOptionPane.showInputDialog("수정할 시퀀스를 입력해주세요."); 
			
			String sql="select * from stuinfo0130 where num="+num;
			
			Connection conn=db.getOracle();
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			
			try {
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				// 데이터 하나 조회 if
				if(rs.next()) {
					updateForm.num=num; // 수정할 번호(41)
					updateForm.tfName.setText(rs.getString("name"));
					updateForm.tfJava.setText(rs.getString("java"));
					updateForm.tfJsp.setText(rs.getString("jsp"));
					updateForm.tfSpring.setText(rs.getString("spring"));
					updateForm.cbBan.setSelectedItem(rs.getString("ban"));
					
					updateForm.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "해당 번호는 없는 번호입니다.");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				db.dbClose(rs, pstmt, conn);
			}	
			
		} else if(ob==updateForm.btnMod) { // 수정폼의 수정버튼
			updateData();
			tableWrite();
			updateForm.setVisible(false);
		}
	}

	//
	public static void main(String[] args) {
		new SwingJdbcScore("학생 성적 관리 DB");
		
	}
	
}
