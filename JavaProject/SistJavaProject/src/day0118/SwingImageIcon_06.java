package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingImageIcon_06 extends JFrame implements ActionListener {
	
	Container cp;
	
	// 이미지 아이콘 가져오기
	ImageIcon icon1 = new ImageIcon("C:\\sist0103\\image\\swingimage\\LEFT.GIF");
	ImageIcon icon2 = new ImageIcon("C:\\sist0103\\image\\swingimage\\leftDown.gif");
	ImageIcon icon3 = new ImageIcon("C:\\sist0103\\image\\swingimage\\leftRollover.gif");
	ImageIcon icon4 = new ImageIcon("C:\\sist0103\\image\\swingimage\\img1.gif");
	ImageIcon icon5 = new ImageIcon("C:\\sist0103\\image\\swingimage\\img10.gif");
	
	JButton btn1, btn2, btn3, btn4;
	
	public SwingImageIcon_06(String title) {

		super(title);

		cp = this.getContentPane();

		this.setBounds(600, 100, 300, 300);
		cp.setBackground(new Color(255, 255, 200));
		
		initDasign();
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		this.setVisible(true);
	}
	
	
	public void initDasign() {
		// 2행 2열
		this.setLayout(new GridLayout(2, 2));
		btn1 = new JButton("hello", icon1); // 문구, 아이콘
		
		btn1.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가로방향 Horizontal 
		btn1.setVerticalTextPosition(JButton.BOTTOM); // 텍스트 세로방향 Vertical
		
		this.add(btn1);
		
		btn1.setRolloverIcon(icon2); // setRolloverIcon 마우스 올려둠
		btn1.setPressedIcon(icon3); // setPressedIcon 클릭함
		
		// 버튼2
		btn2 = new JButton(icon4); // 아이콘
		this.add(btn2);
		
		// 버튼3
		btn3 = new JButton("스윙 버튼"); // 문구
		this.add(btn3);
		
		// 버튼4
		btn4 = new JButton("안녕", icon5); // 문구, 아이콘
		this.add(btn4);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingImageIcon_06("이미지 버튼06");

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		if(ob==btn1) {
			JOptionPane.showMessageDialog(btn1, "첫번째 버튼");
		} else if(ob==btn2) {
			JOptionPane.showMessageDialog(btn2, "두번째 버튼");
		} else if(ob==btn3) {
			JOptionPane.showMessageDialog(btn3, "세번째 버튼");
		} else if(ob==btn4) {
			JOptionPane.showMessageDialog(btn4, "네번째 버튼");
		}
		
	}

}
