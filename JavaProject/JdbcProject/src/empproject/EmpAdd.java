package empproject;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmpAdd extends JFrame implements ActionListener{
	Container cp;
	JTextField tfName, tfBirth, tfHire, tfPosition, tfSalary, tfEmail, tfPhone;
	JComboBox<String> cbDeptName;
	JButton btnInsert,btnImage;
	String imageName;

	// 내부클래스
	PhotoDraw photoDraw = new PhotoDraw();

	public EmpAdd(String title) {
		super(title);	

		cp = this.getContentPane();
		this.setBounds(200,100,400,400);
		cp.setBackground(new Color(234,234,234));
		initDesign();
	}

	public void initDesign() {
		this.setLayout(null);

		JLabel lblTitle1 = new JLabel("이름");
		JLabel lblTitle2 = new JLabel("부서");
		JLabel lblTitle3 = new JLabel("생년월일");
		JLabel lblTitle4 = new JLabel("입사일");
		JLabel lblTitle5 = new JLabel("직급");
		JLabel lblTitle6 = new JLabel("임금");
		JLabel lblTitle7 = new JLabel("이메일");
		JLabel lblTitle8 = new JLabel("휴대폰번호");

		tfName = new JTextField(10);
		tfBirth = new JTextField(10);
		tfHire = new JTextField(10);
		tfPosition = new JTextField(10);
		tfSalary = new JTextField(10);
		tfEmail = new JTextField(10);
		tfPhone = new JTextField(10);

		// 부서이름, 콤보박스
		String [] dept = {"개발팀","인사팀","재무팀","마케팅팀"};

		cbDeptName = new JComboBox<String>(dept);

		btnInsert = new JButton("데이터 추가");

		// 라벨 5개 위치선정
		lblTitle1.setBounds(30,20,60,30);
		this.add(lblTitle1);
		lblTitle2.setBounds(30,50,60,30);
		this.add(lblTitle2);
		lblTitle3.setBounds(30,80,60,30);
		this.add(lblTitle3);
		lblTitle4.setBounds(30,110,60,30);
		this.add(lblTitle4);
		lblTitle5.setBounds(30,140,60,30);
		this.add(lblTitle5);
		lblTitle6.setBounds(30,170,60,30);
		this.add(lblTitle6);
		lblTitle7.setBounds(30,200,60,30);
		this.add(lblTitle7);
		lblTitle8.setBounds(30,230,60,30);
		this.add(lblTitle8);

		// 이름,부서,생일,입사일,직급,월급,이메일,핸드폰
		tfName.setBounds(100,25,70,22);	
		this.add(tfName);

		cbDeptName.setBounds(100,55,70,22);	
		this.add(cbDeptName);

		tfBirth.setBounds(100,85,70,22);	
		this.add(tfBirth);

		tfHire.setBounds(100,115,70,22);	
		this.add(tfHire);

		tfPosition.setBounds(100,145,70,22);	
		this.add(tfPosition);

		tfSalary.setBounds(100,175,70,22);	
		this.add(tfSalary);

		tfEmail.setBounds(100,205,70,22);	
		this.add(tfEmail);

		tfPhone.setBounds(100,235,70,22);	
		this.add(tfPhone);

		//"데이터 추가" 버튼
		btnInsert.setBounds(140, 290, 110, 30);
		this.add(btnInsert);
		//this.setPhoto(rs.getString("photo"));

		// 이미지
		btnImage = new JButton("사진선택");
		btnImage.setBounds(225,15,100,30);
		this.add(btnImage);
		btnImage.addActionListener(this);

		//이미지 추가
		photoDraw.setBounds(170,10,300,400);
		this.add(photoDraw);
	}

	// 내부클래스
	class PhotoDraw extends Canvas{
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);

			if(imageName != null) {
				Image image = new ImageIcon(imageName).getImage();
				g.drawImage(image, 30, 50, 150,200, this);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if(ob == btnImage) {
			FileDialog dlg=new FileDialog(this, "이미지 가져오기", FileDialog.LOAD);
			dlg.setVisible(true);

			//취소누르면 메서드 종료
			if(dlg.getDirectory() == null) {
				return;
			}

			//이미지명 얻기
			imageName = dlg.getDirectory() + dlg.getFile();

			//this.setPhoto(imageName);
			
			//이미지 출력
			photoDraw.repaint();

		}
	}

	//	public static void main(String[] args) {
	//		
	//		new EmpAdd("사원정보 추가프레임");
	//		
	//	}
	
}