package day0110;

public class ObjectEx_07 {
	
	String name; // 인스턴스 멤버 변수 -> 반드시 생성 후 사용 가능
	static final String MESSAGE="Happy Day"; // static 멤버(클래스)변수, 주로 상수(대문자)로 선언
	// 객체 생성 없이 바로 클래스명으로 접근 가능

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static 멤버변수는 new 생성없이 호출 가능");
		System.out.println(MESSAGE); // 다른 클래스에서 클래스명.변수명 으로 가져와야 함 ObjectEx_07.MESSAGE
		// MESSAGE="Nice Day"; final이라 값변경 불가
		
		// 인스턴스 변수 (무조건) 객체 생성
		ObjectEx_07 ob7 = new ObjectEx_07();
		System.out.println(ob7.name); // class에서 변수는 자동 초기화(o, null, false..)
		ob7.name="홍길동";
		
		System.out.println(ob7.name);
		
		ObjectEx_07 ob8 = new ObjectEx_07();
		ob8.name="이효리";
		System.out.println(ob8.name);

	}

}
