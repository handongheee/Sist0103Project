package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

// 2개의 텍스트필드에 숫자를 넣고 버튼을 만든 후 클릭하면 라벨에 2+3=5 <= 이렇게 출력하기


public class SwingTextF_10 extends JFrame {

	Container cp;
	JTextField tfNum1, tfNum2;
	JButton btnAdd, btnM, btnG, btnN;
	JLabel lblNum1, lblNum2, lblResult;

	public SwingTextF_10() {
		// TODO Auto-generated constructor stub
		super("텍스트 필드 문제");

		cp = this.getContentPane();

		this.setBounds(600, 100, 500, 300);
		cp.setBackground(new Color(255, 255, 200));

		setDesign();		

		this.setVisible(true);
	}

	public void setDesign() {
		this.setLayout(null);
		lblNum1 = new JLabel("숫자1");
		lblNum2 = new JLabel("숫자2");

		lblNum1.setBounds(20, 20, 50, 30);
		this.add(lblNum1);

		lblNum2.setBounds(20, 60, 50, 30);
		this.add(lblNum2);

		tfNum1 = new JTextField();
		tfNum1.setBounds(80, 20, 60, 30);
		this.add(tfNum1);

		tfNum2 = new JTextField();
		tfNum2.setBounds(80, 60, 60, 30);
		this.add(tfNum2);

		btnAdd = new JButton("+");
		btnAdd.setBounds(40, 110, 50, 50);
		this.add(btnAdd);

		btnM = new JButton("-");
		btnM.setBounds(100, 110, 50, 50);
		this.add(btnM);

		btnG = new JButton("*");
		btnG.setBounds(160, 110, 50, 50);
		this.add(btnG);

		btnN = new JButton("/");
		btnN.setBounds(220, 110, 50, 50);
		this.add(btnN);


		// 결과
		lblResult = new JLabel("결과 나오는 곳..");
		lblResult.setBounds(20, 170, 250, 60);
		lblResult.setBorder(new TitledBorder("결과 확인"));
		lblResult.setFont(new FontUIResource("", Font.BOLD, 25)); // 글꼴 변경
		this.add(lblResult);

		// 익명내부클래스
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(tfNum1.getText().trim()); // trim 앞 뒤 공백 제거 후 변환
				int num2=Integer.parseInt(tfNum2.getText().trim());	

				int sum=num1+num2;
				String s = num1+"+"+num2+"="+sum;
				lblResult.setText(s);

			}
		});

		btnM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num1=Integer.parseInt(tfNum1.getText().trim());
				int num2=Integer.parseInt(tfNum2.getText().trim());

				int sum=num1-num2;

				String s = num1+"-"+num2+"="+sum;

				lblResult.setText(s);

			}
		});

		btnG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(tfNum1.getText().trim());
				int num2=Integer.parseInt(tfNum2.getText().trim());

				int sum=num1*num2;

				String s = num1+"*"+num2+"="+sum;

				lblResult.setText(s);
			}
		});

		btnN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(tfNum1.getText().trim()); 
				int num2=Integer.parseInt(tfNum2.getText().trim());

				int sum=num1/num2;

				String s = num1+"/"+num2+"="+sum;

				lblResult.setText(s);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingTextF_10();
	}

}
