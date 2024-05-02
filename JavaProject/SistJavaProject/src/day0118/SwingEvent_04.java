package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingEvent_04 extends JFrame implements ActionListener{

	Container cp;
	JButton btn1, btn2, btn3;

	public SwingEvent_04(String title) {
		// TODO Auto-generated constructor stub
		super(title);

		cp = this.getContentPane();

		this.setBounds(600, 100, 300, 300);
		cp.setBackground(new Color(255, 255, 200));
		
		initDesign();
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		// 레이아웃 변경
		this.setLayout(new FlowLayout());
		
		// 버튼 3개 생성
		btn1 = new JButton("버튼 #01");
		btn2 = new JButton("버튼 #02");
		btn3 = new JButton("버튼 #03");
		
		// 버튼 색상 변경
		btn1.setBackground(Color.pink);
		btn2.setBackground(Color.green);
		btn3.setBackground(Color.orange);
		
		// 버튼에 이벤트 발생 -> 이벤틀핸들러와 이벤트 발생 객체(버튼) 연결
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		// 프레임에 추가
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource(); // 버튼의 어떤 메서드 호출인지 명확히 지정해줘야함
		
		// 메세지를 다이얼로그형태로 보여준다
		//JOptionPane.showMessageDialog(this, "버튼클릭");
		
		// 버튼마다 다른 메세지 출력하기 ob
		if(ob==btn1) {
			JOptionPane.showMessageDialog(this, "1번째 버튼 클릭");
		} else if(ob==btn2) {
			JOptionPane.showMessageDialog(this, "2번쨰 버튼 클릭");
		} else if(ob==btn3) {
			JOptionPane.showMessageDialog(this, "3번째 버튼 클릭");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEvent_04("버튼 이벤트");

	}

	

}
