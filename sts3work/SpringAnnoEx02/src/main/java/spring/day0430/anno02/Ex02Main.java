package spring.day0430.anno02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app=new ClassPathXmlApplicationContext("annoContext1.xml");
		
		//Manggo mg=(VietnamManggo)app.getBean("vietnamManggo");
		//mg.writeMangName();
		
		MyFruit mf=(MyFruit)app.getBean("myFruit");
		mf.writeManggo();
	}
}
