package day0111;

class Apple{
	public Apple() { // 굳이 선언 안해도 존재함, 출력하기 위해 따로 작성
		System.out.println("Apple_디폴트 생성자"); 
	}
}

///////////////////////////////////
class Banana{
	public Banana(String str) { // 인자값이 있어서 banana 디폴트 생성자 호출 불가
		System.out.println("생성자 호출: "+str);
	}
}

///////////////////////////////////
class Orange{

	// 생성자 오버로딩
	public Orange() {
		System.out.println("Orange의 디폴트 생성자 호출");
	}
	public Orange(String str) {
		System.out.println("Orange의 2번째 생성자: "+str);
	}
	public Orange(int n) {
		this(); // 기본 생성자 호출, 반드시 첫줄에 작성
		System.out.println("Orange의 3번째 생성자: "+n);
	}
}


///////////////////////////////////
public class ConstTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		Banana banana = new Banana("바나나");
		Orange or1 = new Orange();
		Orange or2 = new Orange("오렌지");
		Orange or3 = new Orange(22);

	}

}