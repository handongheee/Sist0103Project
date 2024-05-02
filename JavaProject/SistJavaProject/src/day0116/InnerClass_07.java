package day0116;

class OuterObject {
	int a=10;
	static int b = 20;
	
	class InnerObject{
		int c = 30;
		
		public void write() {
			System.out.println("외부 인스턴스 변수 a= "+a);
			System.out.println("외부 정적 변수 b= "+b);
			System.out.println("내부변수 c= "+c);
		}
	}
	
	static class InnerObject02{
		// 내부클래스에서 멤버를 static으로 선언하고 싶으면 내부클래스 타입을 static으로 주면 된다.
		int d=40;
		static int e=50;
		
		public void write02() {
			// System.out.println("외부 인스턴스 변수 a= "+a); static하면 외부 일반 변수 접근 안 됨
			System.out.println("외부 정적변수 b= "+b);
			System.out.println("내부 일반변수 d= "+d);
			System.out.println("내부 정적변수 e= "+e);
		}
		
	}
}
///////////////////////



public class InnerClass_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterObject.InnerObject oin = new OuterObject().new InnerObject();
		OuterObject.InnerObject02 oin2 = new OuterObject.InnerObject02();
		
		oin.write();
		oin2.write02();
	}

}
