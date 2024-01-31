package empproject;

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

import day0130.AddStuInfo;
import day0130.UpdateStuInfo;
import oracleDB.DbConnect;

public class EmpMain extends JFrame implements ActionListener{

	DbConnect db=new DbConnect();
	Container cp; 

	DefaultTableModel model; // 테이블에 대한 추가/삭제 시 DefaultTableModel, 불러오기만 하려면 jtable
	JTable table; 
	JButton btnAdd, btnDel, btnUpdate; 

	EmpAdd addForm=new EmpAdd("사원추가");
	//UpdateStuInfo updateForm=new UpdateStuInfo("데이터 수정");

	public EmpMain(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp = this.getContentPane();
		this.setBounds(700, 400, 400, 300); // 위치x,위치y,크기x,크기y
		cp.setBackground(new Color(255, 255, 200));

		initDesign();

		this.setVisible(true);

	}
	/*
	public void tableWrite() {
		// 테이블 초기화
		model.setRowCount(0); // ==> 테이블행 하나도 없다 (0행)
		
		// db 연결
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null; // ResultSet: 조회/출력에서만 사용, db를 테이블형태로 가지고 오는것
		
		String sql="select * from emp order by emp_id";
		
		conn=db.getOracle();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery(); 
			
			while(rs.next()) {
				Vector<String> data=new Vector<String>(); // 벡터: 배열은 고정형이므로 벡터/arraylist 같은 컬렉션 객체를 통해 데이터를 무한대로 추가 가능
				// 데이터화, 벡터에 꾸러미로 묶음
				// emp_id, emp_name, birth_date, hire_date, dept_id, position, salary, email, phone_number
				data.add(rs.getString("emp_id")); 
				data.add(rs.getString("emp_name"));
				data.add(rs.getString("birth_date"));
				data.add(rs.getString("hire_date"));
				data.add(rs.getString("dept_id"));
				data.add(rs.getString("position"));
				data.add(rs.getString("salary"));
				data.add(rs.getString("email"));
				data.add(rs.getString("phone_number"));

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
		// //tfName, tfBirth, tfHire, tfPosition, tfSalary, tfEmail, tfPhone
		String name=addForm.tfName.getText(); // 이름 값 가져옴
		String birth=addForm.tfBirth.getText();
		String hire=addForm.tfHire.getText();
		String position=addForm.tfPosition.getText();
		String salary=addForm.tfSalary.getText();
		String email=addForm.tfEmail.getText();
		String phone=addForm.tfPhone.getText();
		String dept=(String)addForm.cbDeptName.getSelectedItem(); // getSelectedItem: 콤보 값 가져옴
		

		
		String sql="insert into emp values (seq_emp.nextval, ?,?,?,?,?,?,?,?)";
		
		// db 연결, sql전송
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			// 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, birth);
			pstmt.setString(3, hire);
			pstmt.setString(4, dept);
			pstmt.setString(5, position);
			pstmt.setString(6, salary);
			pstmt.setString(7, email);
			pstmt.setString(8, phone);
			
			
			// 업데이트
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}		
	}
	

*/
	public void initDesign() {

		String [] title= {"번호","이름","생일","입사일","부서","직급","월급",	"이메일","전화번호"}; // 배열선언

		model=new DefaultTableModel(title, 0); // 0 데이터 없음이라는 뜻
		table=new JTable(model);
		this.add("Center", new JScrollPane(table)); // 스크롤팬 생성 후 스크롤팬에 테이블 넣기

		// 테이블에 db데이터 출력
		//tableWrite(); // 호출

		// 버튼 3개 올릴 패널(공간)
		JPanel pTop=new JPanel();
		this.add("North",pTop);

		// 추가버튼
		btnAdd=new JButton("추가"); // 생성
		//btnAdd.addActionListener(this);
		pTop.add(btnAdd);
		// 추가폼에 있는 추가버튼에 액션 추가 AddStuInfo
		//addForm.btnInsert.addActionListener(this);

		// 삭제버튼
		btnDel=new JButton("삭제");
		//btnDel.addActionListener(this);
		pTop.add(btnDel);

		// 수정버튼
		btnUpdate=new JButton("수정");
		//btnUpdate.addActionListener(this);
		pTop.add(btnUpdate);
		// 수정폼에 있는 수정버튼에 액션 추가
		//updateForm.btnMod.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
/*
		if(ob==btnAdd) {
			// System.out.println("add");
			addForm.setVisible(true); // 생성한 addForm 보여지게

		} else if(ob==addForm.btnInsert) { // 학생추가폼의 버튼 이벤트
			// 입력하는 데이터를 읽어서 db에 추가
			insertData(); // db에 들어간거 확인

			// 테이블 다시 출력
			tableWrite();

			// 추가창 초기화하면서 사라지게 
			//tfName, tfBirth, tfHire, tfPosition, tfSalary, tfEmail, tfPhone
			addForm.tfName.setText(""); // 텍스트필드 초기화
			addForm.tfBirth.setText("");
			addForm.tfHire.setText("");
			addForm.tfPosition.setText("");
			addForm.tfSalary.setText("");
			addForm.tfEmail.setText("");
			addForm.tfPhone.setText("");

			addForm.setVisible(false); // 창 닫기

		}
*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpAdd("사원관리");
	}

}
