package day0104;

public class DataType_06 {

	// boolean flag
	public static void main(String[] args) {
		// 1. 기본자료형 8개
		boolean flag = false; // 논리형 true, false, boolean flag;(x)
		
		// 2. 문자형
		// 반드시 하나의 문자 16byte 유니코드 값 표현
		// 2byte 문자 하나
		// 기본적으로 정수형, 아스키코드로 변경 가능
		// ''로 표현
		char ch = '가';
		
		// 3. 정수형
		byte a = -128; // 1byte -128~127
		short b = 32000; // 16bit
		int c = 670000; // 32bit
		long d = 100L; // 64bit 뒤에 l/L을 붙여야 long인지 int인지 구분
		
		// 4. 실수
		float  f = 3.1234f; // 32bit, 뒤에 f를 안 붙이면 double 의미
		double dou = 2314.4321421; // 64bit, 소수점 가진 숫자 double이 기본
		
		
		System.out.println("flag = "+flag);
		System.out.println("문자형 ch = "+ch);
		System.out.println("정수 a = "+a);
		System.out.println("정수 b = "+b);
		System.out.println("정수 c = "+c);
		System.out.println("정수 d = "+d);
		System.out.println("실수형 f = "+f);
		System.out.println("실수형 dou = "+dou);

	}

}
