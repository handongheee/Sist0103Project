package spring.day0430.anno02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // �ڵ� bean ���
public class MyFruit {
	
	//=>@Autowired �������̽��� ������ Ŭ������ 1���� ��쿡�� �ڵ������� �Ǵµ�, ������ Ŭ������ 2�� �̻��̸� �ڵ����Կ� ������ �����
	//=>@Resource: ��Ȯ�ϰ� bean�� �̸����� �����Ϸ���
	//@Resource (name="tManggo")
	@Resource (name="vietnamManggo")
	Manggo mg;
	
	public void writeManggo() {
		System.out.println("*** ���� �����ϴ� ����� ***");
		mg.writeMangName();
	}
}
