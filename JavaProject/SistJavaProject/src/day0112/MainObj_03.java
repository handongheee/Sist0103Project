package day0112;


// 부모클래스의 멤버를 자식클래스가 선언없이 사용 가능하다 
// private은 같은 패키지여도 상속 못 받음
// 자바는 단일 상속만 가능 aaa extends bbb extends ccc (x)
// 상속 extends 라는 키워드로 표현
// class (자식클래스) extends (부모클래스) {}

public class MainObj_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubObj_03 sub = new SubObj_03("김선호", 27, "강남구");
		sub.writeData();
	}

}
