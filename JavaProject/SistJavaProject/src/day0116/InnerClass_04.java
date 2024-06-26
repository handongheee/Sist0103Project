package day0116;

class OuterObj{
	
	public void disp() {
		System.out.println("외부클래스의 disp 메서드");
		System.out.println("외부에서 내부클래스의 메서드 호출");
		
		innerObj inObj = new innerObj(); // 생성
		inObj.write(); // 호출
	
	}
	
	
	// OuterObj 클래스에서만 기능하는 클래스
	class innerObj{
		public void write() {
			System.out.println("내부클래스의 write 메서드");
			
		}	
	}
}

//////////////////////////////
public class InnerClass_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterObj outObj = new OuterObj();
		outObj.disp();
		System.out.println("-------------------------");
		
		// 내부클래스는 외부 통해서만 생성 가능
		//OuterObj.innerObj obj = new OuterObj().new innerObj();
		//obj.write();
		
		// outObj를 미리 생성했다면 이렇게 활용 가능
		OuterObj.innerObj obj2 = outObj.new innerObj(); 
		obj2.write();
		

	}

}
