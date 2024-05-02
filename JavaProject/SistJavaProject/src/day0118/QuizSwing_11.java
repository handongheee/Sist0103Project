package day0118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

/*
 * 패널 위에 5개의 버튼을 생성한다
 * 각각의 버튼명은 미리 라벨 배열로 작성해놓는다
 * 색상 또한 배열처리해놓는다(Cplor.RED ..)
 * 버튼의 색상은 해당 색상의 글자색을 갖는다
 *
 * 프레임에 안녕하세요 라는 글자를 굵게 30으로 생성해놓고
 * 위의 5개 버튼을 누를때마다 안녕하세요 글자는 해당 색상으로 변경된다
 */


public class QuizSwing_11 extends JFrame implements ActionListener {
	
	Container cp;
	JButton [] btn = new JButton[6];
	JLabel result;
	String [] btnLabel = {"Red", "Orange", "Yellow", "Green", "Blue", "Gray"};
	Color [] btnColors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.gray};
	
	public QuizSwing_11() {
		// TODO Auto-generated constructor stub
		
		super("텍스트 필드 문제");
		
		cp = this.getContentPane();

		this.setBounds(600, 100, 500, 300);
		cp.setBackground(new Color(255, 255, 200));
		
		setDesign();
			
		this.setVisible(true);
		
	}
	
	public void setDesign() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.pink);
		this.add(panel, BorderLayout.NORTH);
		
		result = new JLabel("안녕하세요", JLabel.CENTER); 
		result.setFont(new FontUIResource("", Font.BOLD, 30));
		this.add("Center", result);
		
		for(int i=0; i<btn.length; i++) {
			// 버튼 6개 생성
			btn[i] = new JButton(btnLabel[i]);
			
			// 버튼 6개에 각각의 버튼 색상 변경 (btnColors)
			btn[i].setBackground(btnColors[i]);
			result.setForeground(btnColors[i]);
			
			// 버튼 6개에 이벤트 추가
			btn[i].addActionListener(this);
			
			// panel에 버튼 6개 추가
			panel.add(btn[i]);
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		
		for(int i=0; i<btn.length; i++) {
			if(ob==btn[i]) {
				result.setForeground(btnColors[i]);
			}		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QuizSwing_11();
	}



}
