package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class JTable_05 extends JFrame {
	
	Container cp;
	JTable tb1, tb2, tb3;
	JTextArea area;
	
	public JTable_05(String title) {
		// TODO Auto-generated constructor stub
		super(title);

		cp = this.getContentPane();

		this.setBounds(1000, 500, 400, 300);
		cp.setBackground(new Color(255, 255, 200));
		
		initDesign();

		this.setVisible(true);
	}
	
	public void initDesign() {
		// 2행 2열의 Grid 레이아웃
		this.setLayout(new GridLayout(2, 2, 5, 5));
		
		// 1. tb은 행, 열만 지정
		tb1 = new JTable(5, 4);
		this.add(new JScrollPane(tb1));
		
		// 2. tb 생성할 때 데이터 넣기
		String[] title1= {"이름", "나이", "주소"};
		String [][] data1= {{"기안", "22", "경기"}, {"덱스", "21", "서울"}, {"빠니", "25", "대구"}};
		
		tb2=new JTable(data1, title1);
		this.add(new JScrollPane(tb2)); // JScrollPane에 넣어서 추가해야 제목, 스크롤바가 나타남
			
		// 3. DefaultTableModel을 이용해서 생성(나중에 추가, 삭제 가능) > 실제 사용
		DefaultTableModel model1 = new DefaultTableModel(data1, title1);
		tb3 = new JTable(model1);
		this.add(new JScrollPane(tb3));
		
		// 추가 가능?
		String [] addData1 = {"현무", "44", "서울"};
		model1.addRow(addData1);
		
		// 이번엔 벡터 생성 후 추가
		Vector<String> addData2 = new Vector<String>();
		addData2.add("유재석");
		addData2.add("33");
		addData2.add("제주");
		model1.addRow(addData2);
		
		
		// area
		area = new JTextArea();
		this.add(new JScrollPane(area));
		
		// JTable과 model 메서드 확인
		int rowCount = tb3.getRowCount();
		area.append("tb3의 행갯수: "+rowCount+"\n");
		
		int rowCount2= model1.getRowCount();
		area.append("tb3의 행갯수: "+rowCount2+"\n");
		
		int columnCount = tb3.getColumnCount();
		area.append("tb3의 행갯수: "+columnCount+"\n");
		
		area.append("1행 1열의 값: "+tb3.getValueAt(1, 1)+"\n");
		area.append("3행 2열의 값: "+tb3.getValueAt(3, 2)+"\n");
		
		// tb3에 마우스 클릭 이벤트 추가해서 area에 출력
		tb3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				// 클릭한 행번호 얻기
				int row=tb3.getSelectedRow();
				// 클릭한 열번호 얻기
				int col=tb3.getSelectedColumn();
				
				// 해당 행, 열에 있는 데이터 얻어서 area에 출력
				area.append(row+","+col+"==>"+tb3.getValueAt(row, col)+"\n");
			}
		});
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTable_05("스윙 테이블05");
		

	}

}
