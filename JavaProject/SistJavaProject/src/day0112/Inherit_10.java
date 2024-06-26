package day0112;

// 부모
class Work{
	
	public void goodmorning() {
		System.out.println("안녕하세요~!!");
	}
	
	public void process() {
		System.out.println("아무 것도 안하고 있음");
	}
}
////////////////////

// 자식
class Food1 extends Work {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("*** 음식 담당 ***");
	}
}
////////////////////

class Clean extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("*** 청소 담당 ***");
	}
}
////////////////////

class Sing extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("*** 노래 담당 ***");
	}
}

public class Inherit_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성: 부모클래스로 선언하고 자식클래스로 생성하는 경우(부모 하나에 자식클래스가 여러개 일 때) -> 하나의 변수로 작업해야 될 때 유용
		Work work=null; // 선언, 메서드에선 초기화가 안되므로 초기값 줘야됨
		
		work = new Food1();
		work.goodmorning();
		work.process();
		System.out.println();
		
		work = new Clean();
		work.goodmorning();
		work.process();
		System.out.println();
		
		work = new Sing();
		work.goodmorning();
		work.process();
		
	}

}
