package spring.day0430.anno02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 자동 bean 등록
public class MyFruit {
	
	//=>@Autowired 인터페이스를 구현한 클래스가 1개일 경우에는 자동주입이 되는데, 구현한 클래스가 2개 이상이면 자동주입에 문제가 생긴다
	//=>@Resource: 정확하게 bean의 이름으로 주입하려면
	//@Resource (name="tManggo")
	@Resource (name="vietnamManggo")
	Manggo mg;
	
	public void writeManggo() {
		System.out.println("*** 내가 좋아하는 망고는 ***");
		mg.writeMangName();
	}
}
