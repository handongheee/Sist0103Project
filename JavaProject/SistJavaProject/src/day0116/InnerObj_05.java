package day0116;

import day0116.Outer.Inner01;

class Outer{
	String name = "한동희";
	int age=22;
	
	// member 내부클래스 01
	class Inner01{
		// 내부클래스에서는 외부클래스의 멤버변수 사용이 가능하다
		public void disp() {
			System.out.println("** Inner01 내부클래스 **");
			System.out.println("이름: "+name+" 나이: "+age+"세");
		}
	}
	
	// member 내부클래스 02
	class Inner02{
		public void disp02() {
			System.out.println("** Inner02 내부클래스 **");
			System.out.println("이름: "+name+" 나이: "+age+"세");
		}
	}
	
	// 외부클래스의 메서드
	public void write() {
		// 외부메서드에서 내부클래스 선언
		Inner01 in01 = new Inner01();
		in01.disp();
		
		Inner02 in02 =  new Inner02();
		in02.disp02();
	}

}

public class InnerObj_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 외부 생성
		Outer out = new Outer();
		out.write();
		
		System.out.println("--------------------------");
		// 직접 생성
		Outer.Inner01 inn01 = new Outer().new Inner01();
		inn01.disp();
		Outer.Inner02 inn02 = out.new Inner02();
		inn02.disp02();

	}

}
