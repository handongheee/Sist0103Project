package day0105;

import java.util.Scanner;

public class IfOper_12 {

	public static void main(String[] args) {
		// 삼항(조건)연산자
		// 형식조건식 ? 참:거짓
		Scanner sc = new Scanner(System.in);
		int  x, y, max;
		
		System.out.println("**두 개의 숫자를 입력하세요.**");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("입력한 두 수는 "+x+", "+y);
		
//		if(x>y)
//			max = x;
//		else
//			max = y;
		
		// 삼항연산자
		max = x>y? x:y;

		System.out.println("두 수 중에서 더 큰 값은 "+max+"입니다.");
		
		System.out.println("첫번째 수가 더 "+(x>y?"크다":"작다"));

	}

}
