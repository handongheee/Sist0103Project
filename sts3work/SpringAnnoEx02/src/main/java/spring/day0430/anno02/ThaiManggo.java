package spring.day0430.anno02;

import org.springframework.stereotype.Component;

@Component ("tManggo")
public class ThaiManggo implements Manggo {

	@Override
	public void writeMangName() {
		// TODO Auto-generated method stub
		
		System.out.println("���� �����ϴ� �±�����!");
	}

}
