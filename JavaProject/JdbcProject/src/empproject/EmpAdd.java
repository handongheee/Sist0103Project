package empproject;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmpAdd extends JFrame{

	Container cp=new Container();
	JTextField tfName, tfBirth, tfHire, tfPosition, tfSalary, tfEmail, tfPhone;
	JComboBox<String> cbDeptName;
	JButton btnInsert; // 데이터 추가 버튼 

	public EmpAdd(String title) {
		super(title);

		cp = this.getContentPane();
		this.setBounds(700, 400, 300, 300); 
		cp.setBackground(new Color(255, 255, 200));

		initDesign();
		
		//this.setVisible(true); 
	}

	public void initDesign() {
		this.setLayout(null); // borderlayout 아니면 null
		// ------- 생성
		// 텍스트필드 제목
		JLabel lblTitle1=new JLabel("이름");
		
		JLabel lblTitle2=new JLabel("생일");
		JLabel lblTitle3=new JLabel("입사일");
		JLabel lblTitle4=new JLabel("부서");
		JLabel lblTitle5=new JLabel("직급");
		JLabel lblTitle6=new JLabel("월급");
		JLabel lblTitle7=new JLabel("이메일");
		JLabel lblTitle8=new JLabel("핸드폰");
		
		// 텍스트필드 칸
		tfName=new JTextField(5); // 5만큼 크기
		tfBirth=new JTextField();
		tfHire=new JTextField();
		tfPosition=new JTextField();
		tfSalary=new JTextField();
		tfEmail=new JTextField();
		tfPhone=new JTextField();
		
		// 콤보박스
		String [] dept= {"101","102","103","104"};
		cbDeptName=new JComboBox<String>(dept);
		
		btnInsert=new JButton("추가");
		
		// ------- 추가
		// 텍스트필드 제목 추가 - 라벨 5개 
		lblTitle1.setBounds(30, 10, 60, 30); //x,y,너비,높이
		this.add(lblTitle1);
		
		lblTitle2.setBounds(30, 40, 60, 30); //x,y,너비,높이
		this.add(lblTitle2);
		
		lblTitle3.setBounds(30, 70, 60, 30); //x,y,너비,높이
		this.add(lblTitle3);
		
		lblTitle4.setBounds(30, 100, 60, 30); //x,y,너비,높이
		this.add(lblTitle4);
		
		lblTitle5.setBounds(30, 130, 60, 30); //x,y,너비,높이
		this.add(lblTitle5);
		
		lblTitle6.setBounds(30, 160, 60, 30); //x,y,너비,높이
		this.add(lblTitle6);
		
		lblTitle7.setBounds(30, 190, 60, 30); //x,y,너비,높이
		this.add(lblTitle7);
		
		lblTitle8.setBounds(30, 220, 60, 30); //x,y,너비,높이
		this.add(lblTitle8);
		

		tfName.setBounds(80, 15, 70, 22);
		this.add(tfName);
		
		
		
		tfBirth.setBounds(80, 45, 70, 22);
		this.add(tfBirth);
		
		tfHire.setBounds(80, 75, 70, 22);
		this.add(tfHire);
		
		cbDeptName.setBounds(80, 105, 70, 22);
		this.add(cbDeptName);
		
		tfPosition.setBounds(80, 135, 70, 22);
		this.add(tfPosition);
		
		tfSalary.setBounds(80, 165, 70, 22);
		this.add(tfSalary);
		
		tfEmail.setBounds(80, 195, 70, 22);
		this.add(tfEmail);
		
		tfPhone.setBounds(80, 225, 70, 22);
		this.add(tfPhone);
		
		// 버튼 추가
		btnInsert.setBounds(70, 250, 70, 30);
		this.add(btnInsert);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new EmpAdd("사원 추가");
//	}

}
