package day0104;

public class Parsenum_02 {

	public static void main(String[] args) {
		String su1 = "8";
		String su2 = "2";
		
		System.out.println("두 수 더하기: "+(su1+su2)); // 출력 82
		
		// 문자열 su1, su2를 정수 타입 int로 변환 후 계산해보기
		// Wrapper Class : 기본형과 클래스형 간의 변환을 위한 클래스 (Integer, double, long, float...)
		int s1 = Integer.parseInt(su1);
		int s2 = Integer.parseInt(su2);
		
		System.out.println("변환 후 두 수 더하기: "+(s1+s2)); // 출력 10
		System.out.println("변환 후 두 수 빼기: "+(s1-s2)); // 출력 6
		System.out.println("변환 후 두 수 곱하기: "+(s1*s2)); // 출력 16
		System.out.println("변환 후 두 수 나누기: "+(s1/s2)); // 출력 4
		// 정수형끼리 연산 시 결과도 정수형

	}

}
