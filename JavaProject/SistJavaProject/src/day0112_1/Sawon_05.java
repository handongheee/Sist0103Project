package day0112_1;

public class Sawon_05 {
	protected String name;
	protected String buseo; // private면 this로 접근 안 됨
	
	// 메서드
	public void display() {
		System.out.println("** 부모 변수 출력 **");
		System.out.println("이름: "+this.name);
		System.out.println("부서: "+this.buseo);
	}
	
	

}