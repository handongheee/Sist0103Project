package spring.last.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JumunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("annoContext1.xml");
		
		OrderController con=(OrderController)app.getBean("orderController");
		con.jumunInsert("��ŰƲ��", 3000, "�ʷ�");
		con.jumunDelete("53");
		con.jumunSelect("��Ŭ����", 1800, "���");
		
	}

}
