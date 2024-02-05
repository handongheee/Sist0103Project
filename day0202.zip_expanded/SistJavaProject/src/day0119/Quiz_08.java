package day0119;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/*  day0119 02,03 참고
[0119 주말 과제물]

체크박스    남자    
라디오버튼:    색깔 3개를 배치한다  (타이블보더: 색상)
체크박스:     나라 4개국가 배치한다 (타이틀보더: 내가가본나라 )

아래부분에 메세지 결과 를 배치한후 출력한다

남자 체크를 누르면 결과창에
남자입니다…플면 여자입니다
색상을 누르면 현재결과창의 색상이 바뀝니다
체크박스 누르면
내가 가본나라는 [이탈리아] [미국] 입니다
아무것도 체크 안할시
내가 가본나라는 없습니다
 */

public class Quiz_08 extends JFrame implements ActionListener, ItemListener{

	Container cp;
	JCheckBox gender;
	JRadioButton [] rbColor = new JRadioButton[3];
	JCheckBox [] cbCountry = new JCheckBox[4];
	Color [] colors = {Color.red, Color.green, Color.blue};
	JLabel lblMessage;

	public Quiz_08(String title) {
		// TODO Auto-generated constructor stub
		super(title);

		cp = this.getContentPane();

		this.setBounds(500, 500, 500, 400);
		cp.setBackground(new Color(255, 255, 200));

		initDesign();

		this.setVisible(true);
	}

	public void initDesign() {
		// 성별
		gender = new JCheckBox("남자");
		gender.setBounds(20, 20, 100, 30);
		gender.setOpaque(false);
		gender.addItemListener(this); // ItemListener 이벤트 핸들러와 연결되는 객체임을 표시
		this.add(gender);

		// 색상 라디오 버튼
		String[] str1 = {"빨강", "초록", "파랑"};

		// 라디오버튼 하나만 선택되도록 하려면 그룹을 지어줘야한다.
		ButtonGroup bg = new ButtonGroup(); // 안해주면 다 선택됨

		for(int i=0; i<rbColor.length; i++) {
			rbColor[i] = new JRadioButton(str1[i]); // 라디오 버튼 생성(텍스트, 기본체크), i==1? true:false->디폴트 선택값 넣어주기
			rbColor[i].setBounds(20, 50, 30, 30); // 0122 뭔가 이상...
			this.add(rbColor[i]); // 탑 패널에 버튼추가
			bg.add(rbColor[i]); // 버튼그룹에 추가 안하면 모두 선택됨
			rbColor[i].addActionListener(this); // 액션 추가
		}





	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();

		// 라디오버튼 호출처리, 메세지 출력이 컬러별로 출력되도록
		for(int i=0; i<rbColor.length; i++) {
			if(ob==rbColor[i]) {
				lblMessage.setForeground(colors[i]);
				lblMessage.setFont(new Font("", Font.BOLD, 22));
			}		
		}	

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz_08("과제");
	}

}
