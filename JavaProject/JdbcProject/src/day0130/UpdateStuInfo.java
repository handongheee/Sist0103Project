package day0130;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpdateStuInfo extends JFrame{
	
	Container cp=new Container();
	JTextField tfName, tfJava, tfJsp, tfSpring;
	JComboBox<String> cbBan;
	JButton btnMod; // 데이터 수정 버튼 modify
	String num; // 수정할 번호
	
	public UpdateStuInfo(String title) {
		super(title);
		
		cp = this.getContentPane();
		this.setBounds(700, 400, 200, 250); 
		cp.setBackground(new Color(255, 204, 204));
		
		initDesign();
		
		//this.setVisible(true); // 이거를 막아야 메인창에서 자동으로 안뜸, addForm.setVisible(true); 기호출
	}
	
	// 디자인
	public void initDesign() {
		this.setLayout(null); // borderlayout 아니면 null
	
		// ------- 생성
		// 텍스트필드 제목
		JLabel lblTitle1=new JLabel("이름");
		JLabel lblTitle2=new JLabel("반");
		JLabel lblTitle3=new JLabel("JAVA");
		JLabel lblTitle4=new JLabel("JSP");
		JLabel lblTitle5=new JLabel("SPRING");
		
		// 텍스트필드 칸
		tfName=new JTextField(5); // 5만큼 크기
		tfJava=new JTextField();
		tfJsp=new JTextField();
		tfSpring=new JTextField();
		
		// 콤보박스
		String [] ban= {"aws반","front반","backend반","design반"};
		cbBan=new JComboBox<String>(ban);
		
		btnMod=new JButton("수정");
		
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
		
		// 텍스트필트 내용,콤보 추가 - 이름, 반, 자바, jsp, spring 순
		tfName.setBounds(80, 15, 70, 22);
		this.add(tfName);
		
		cbBan.setBounds(80, 45, 70, 22);
		this.add(cbBan);
		
		tfJava.setBounds(80, 75, 70, 22);
		this.add(tfJava);
		
		tfJsp.setBounds(80, 105, 70, 22);
		this.add(tfJsp);
		
		tfSpring.setBounds(80, 135, 70, 22);
		this.add(tfSpring);
		
		// 버튼 추가
		btnMod.setBounds(70, 170, 70, 30);
		this.add(btnMod);
		
	}
	
//	public static void main(String[] args) {
//		new UpdateStuInfo("학생 정보 수정창");
//	}

}
