package day0119;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingLabelRandom_01 extends JFrame implements ActionListener {

	Container cp;
	JLabel [] lblLabel = new JLabel[9];
	String [] str = {"샌드위치", "햄버거", "콜라", "스프라이트", "요거트", "스파게티", "피자", "고르곤졸라", "리조또"};
	JButton btn; // 실행버튼

	public SwingLabelRandom_01(String title) {
		// TODO Auto-generated constructor stub

		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 500, 530);
		cp.setBackground(new Color(255, 255, 200));

		initDesign();

		this.setVisible(true);
	}

	public void initDesign() {
		// 패널을 프레임의 센터에 추가. flow 가 아닌 레이아웃은 무조건 생성(new) 해줘야됨
		Panel pCenter = new Panel(new GridLayout(3, 3));
		this.add(pCenter, BorderLayout.CENTER);

		// 라벨을 패널에 추가
		for(int i=0; i<lblLabel.length; i++) {

			lblLabel[i] = new JLabel(str[i], JLabel.CENTER); // JLabel.CENTER 가운데로 출력

			// <처음부터 랜덤색 출력하기> 
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			lblLabel[i].setBackground(new Color(r, g, b));

			// 패널에 라벨 추가
			pCenter.add(lblLabel[i]);

			// 패널 글꼴 변경
			lblLabel[i].setFont(new Font("궁서체", Font.BOLD, 15));

			// 투명도
			lblLabel[i].setOpaque(true);

		}

		// 프레임의 하단에 버튼 생성 후 추가
		btn = new JButton("라벨색상 변경");

		// 버튼에 이벤트 추가, 하단에 위치
		btn.addActionListener(this);

		this.add(btn, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0; i<lblLabel.length; i++) {
			// rgb 컬러는 0~255 사이의 색 R, G, B값
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			lblLabel[i].setBackground(new Color(r, g, b));

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingLabelRandom_01("랜덤 컬러 생성_01");

	}

}
