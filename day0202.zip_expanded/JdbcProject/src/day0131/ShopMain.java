package day0131;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import oracleDB.DbConnect;



public class ShopMain extends JFrame implements ActionListener {
	// 03
	JButton btnAdd, btnDel, btnUpdate, btnList;
	
	DbConnect db=new DbConnect();
	
	public ShopMain() {
		super("ShopMain");
		this.setBounds(200, 100, 400, 400);
		
		initDesign();
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		// 그리드 추가
		this.setLayout(new GridLayout(2, 2));
		
		// 버튼 추가
		btnAdd=new JButton("상품추가");
		btnDel=new JButton("상품삭제");
		btnUpdate=new JButton("상품수정");
		btnList=new JButton("상품목록");		
		this.add(btnAdd);
		this.add(btnDel);
		this.add(btnUpdate);
		this.add(btnList);
		
		// 이벤트 추가
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnList.addActionListener(this);
			
	}
	
	public void deleteShop(String num) {
		String sql="delete from sshop where num="+num;
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		
		if(ob==btnAdd) {
			//System.out.println("add");
			ShopAddForm addform=new ShopAddForm();
			
		}else if(ob==btnDel) {
			//System.out.println("del");
			String num=JOptionPane.showInputDialog("삭제할 시퀀스를 입력해주세요.");
			
			deleteShop(num);
			
		}else if(ob==btnUpdate) {
			System.out.println("update");
		}else if(ob==btnList){
			//System.out.println("list");
			ShopListForm listform=new ShopListForm();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		new ShopMain();

	}

}
