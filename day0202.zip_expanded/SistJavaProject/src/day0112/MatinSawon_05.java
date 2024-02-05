package day0112;

import day0112_1.Sawon_05;

class My extends Sawon_05 {
	// super 내포
	int age;
	
	public My(String name, String buseo, int age) {
		this.name=name; // 부모클래스가 패키지가 다를 경우 protected는 접근 가능, private는 불가능
		this.buseo=buseo;
		this.age=age;
	}
	
	public void writeMy() {
		System.out.println("*** My에서 만든 메서드 ***");
		System.out.println("사원명: "+this.name);
		System.out.println("부서명: "+this.buseo);
		System.out.println("나이: "+this.age);
	}
	
	// 오버라이드 구현
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("나이==>"+this.age);
		System.out.println("*** 자식이 오버라이드한 메서드 ***");
	}
	
}


public class MatinSawon_05 {
	public static void main(String[] args) {
		My my1 = new My("이영자", "마케팅", 27);
		my1.writeMy();
		System.out.println();
		System.out.println("오버라이드 통해 만든 메서드 호출");
		my1.display();
	}

}
