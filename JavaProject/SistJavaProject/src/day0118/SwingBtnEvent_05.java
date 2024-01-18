package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBtnEvent_05 extends JFrame implements ActionListener{
	
	Container cp;
	JButton btn1, btn2;
	
	public SwingBtnEvent_05(String title) {
		// TODO Auto-generated constructor stub
		super(title);

		cp = this.getContentPane();

		this.setBounds(600, 100, 300, 300);
		cp.setBackground(new Color(255, 255, 200));
		
		initDesign();
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("◀");
		btn2 = new JButton("▶");
		
		// 버튼 색상
		btn1.setBackground(Color.pink);
		btn2.setBackground(Color.gray);
		
		// 글자 색상
		btn1.setForeground(Color.blue);
		btn2.setForeground(Color.orange);
		
		// 이벤트 객체 핸들러와 연결
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		this.add(btn1);
		this.add(btn2);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingBtnEvent_05("버튼 이벤트05");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		
		if(ob==btn1) {
			JOptionPane.showMessageDialog(btn1, "왼쪽 출력");
 		} else if(ob==btn2) {
 			JOptionPane.showMessageDialog(btn2, "오른쪽 출력");
 		}	
		
	}

}
