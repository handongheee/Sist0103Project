package day0109;

import java.util.Scanner;

public class QuizFor_16 {

	public static void main(String[] args) {
		//quiz1();
		//quiz2();
		quiz3();

	}

	public static void quiz1() {
		/* 팩토리얼 구할 숫자를 입력하여해당 숫자에 대한 팩토리얼 구하기
			팩토리얼 구할 숫자 입력
			5
			5!=120
		 */
		Scanner sc = new Scanner(System.in);

		int su;
		int result=1;

		System.out.println("팩토리얼 구할 숫자를 입력하세요.");
		su = sc.nextInt();

		for(int i=1; i<=su; i++) {
			result*=i;
		}
		System.out.println(su+"!="+result);

	}


	public static void quiz2() {
		/*
		  두 수 x, y를 입력 후 x의 y승 for문을 이용하여 구하기 (x를 y횟수 만큼 곱하는것)
		  두수 입력
		  3 3
		  3의 3승은 27입니다
		 */
		Scanner sc = new Scanner(System.in);

		int x, y, result=1;

		System.out.println("두 수를 입력하세요.");
		x = sc.nextInt();
		y = sc.nextInt();

		for(int i=1; i<=y; i++) {
			result*=x;
		}
		System.out.println(x+"의 "+y+"승은 "+result+"입니다.");
	}


	public static void quiz3() {
		// 1~100까지의 숫자 중 짝수의 합과 홀수의 합을 나눠서 출력 for

		int esum=0; // 짝수를 구할 변수
		int osum=0; // 홀수를 구할 변수

		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				esum+=i;
			} else {
				osum+=i;
			}
		}

		System.out.println("짝수의 합: "+esum);
		System.out.println("홀수의 합: "+osum);
	}

}
