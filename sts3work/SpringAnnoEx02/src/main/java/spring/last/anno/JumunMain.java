package spring.last.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JumunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("annoContext1.xml");
		
		OrderController con=(OrderController)app.getBean("orderController");
		con.jumunInsert("스키틀즈", 3000, "초록");
		con.jumunDelete("53");
		con.jumunSelect("이클립스", 1800, "노랑");
		
	}

}
