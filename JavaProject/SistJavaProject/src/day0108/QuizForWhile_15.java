package day0108;

import java.util.Scanner;

public class QuizForWhile_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}

	public static void test1() {
		// 문제1: 1~100까지 3의 배수 갯수 구하기 while
		int n=0;
		int cnt=0;

		while(true) {
			n++;

			// 3의 배수면 cnt 변수 1 증가
			if(n%3==0)
				cnt++;

			// n이 100이 되면 while문 종료
			if(n==100) 
				break;
		}
		System.out.println("3의 배수 갯수: "+cnt+"개");


	}

	public static void test2() {
		// 1~100까지 짝수의 합 구하기 while
		int a=1;
		int sum=0;

		while(true) {
			a++;

			if(a%2==1)
				continue; // 홀수면 첫 줄로 이동
			sum+=a; // 짝수인 경우에만 합을 구한다

			if(a==100) 
				break;
		}
		System.out.println("1~100까지 짝수합: "+sum);

	}


	public static void test3() {
		// 1~100까지 홀수의 합 구하기 for
		int sum=0;

		for(int a=1; a<=100; a+=2) {
			sum+=a;
		}
		System.out.println("1~100까지 홀수합: "+sum);

	}

	public static void test4() {
		/* 1~100까지 입력 가능/ 총 5개의 점수를 입력받아 합계 구하기
		 * 1번 점수: 90
		 * 2번 점수: -70 
		 * 잘 못 입력했습니다.
		 * 2번 점수: 85
		 * 3번 점수: 120
		 * 잘 못 입력했습니다.
		 * 3번 점수: 88
		 * 4번 점수: 90
		 * 5번 점수: 75
		 * 총 점: ***점
		 */

		Scanner sc = new Scanner(System.in);
		int score;
		int sum=0;

		for(int a=1; a<=5; a++) {
			System.out.print(a+"번 점수: ");
			score = sc.nextInt();

			if(score<1 || score>100) {
				System.out.println("\t잘 못 입력했습니다.");
				a--; // 횟수 제외
				continue; // a++ 로 이동
			}

			sum+=score;
		}
		System.out.println("총 점: "+sum);

	}

}