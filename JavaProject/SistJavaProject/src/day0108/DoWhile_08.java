package day0108;

public class DoWhile_08 {

	public static void main(String[] args) {
		// 선조건 후조건 차이
		int n=1;
		
		System.out.println("*** While문 결과 ***");
		while(n<5) { // 조건이 맞지 않으면 출력 안 됨
			//System.out.println(n++); 출력 후 증가
			System.out.println(n);
			n++;
		}
		
		System.out.println("*** While문 결과 ***");
		
		n=1;
		do {
			System.out.println(n++);
		}while(n>=5); // 조건이 맞지 않아도 do 부분 먼저 실행되므로 한번은 수행한다.

	}

}
