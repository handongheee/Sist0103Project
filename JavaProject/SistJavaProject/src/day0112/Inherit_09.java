package day0112;

// 부모클래스
class Color{
	public void hello() {
		System.out.println("안녕하세요~!");
	}
}
///////////////////////////////////

// 자식
class Red extends Color{
	public void process() {
		System.out.println("나의 차는 빨간색이야");
	}
	
}
///////////////

class Green extends Color{
	public void process() {
		System.out.println("나의 차는 초록색이야");
	}
	
}
//////////////

class Blue extends Color{
	public void process() {
		System.out.println("나의 차는 파란색이야");
	}
	
}
//////////////

class Pink extends Color{
	public void process() {
		System.out.println("나의 차는 핑크색이야");
	}
	
}
////////////////


/////////////////////////////////////////
public class Inherit_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자식클래스 extends 부모클래스 {}
		// 자식클래스로 선언
		System.out.println("1. Red로 선언하고 Red로 생성한 경우");
		Red red = new Red();
		red.hello();
		red.process();
		
		System.out.println("2. Green으로 선언하고 Green으로 생성한 경우");
		Green green = new Green();
		green.hello();
		green.process();
		
		System.out.println("3. Blue로 선언하고 Blue로 생성한 경우");
		Blue blue = new Blue();
		blue.hello();
		blue.process();
		
		System.out.println("4. Pink로 선언하고 Pink로 생성한 경우");
		Pink pink = new Pink();
		pink.hello();
		pink.process();
		
		// (자식이 여러개면) 부모로 선언하고 자식클래스로 생성
		// 부모가 가지고 있는 메서드 호출 ok
		// 메서드가 오버라이드된 경우 호출 ok
		// 부모한테는 없고 자식만 메서드를 갖고 있는 경우, 메서드 호출 안 됨!!
		Color color; 
		color = new Red();
		color.hello();
		// color.process(); 호출 안 됨, 자식만 갖고 있기 때문
	}

}
