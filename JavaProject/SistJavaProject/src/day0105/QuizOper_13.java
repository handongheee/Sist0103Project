package day0105;

import java.util.Scanner;

public class QuizOper_13 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력하여 가장 큰 값을 구하시오
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, max;
		
		System.out.println("세 개의 숫자를 입력하시오 ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		// if
		System.out.println("**if**");
		
		if (x>y && x>z) {
			max = x;
		} else if (y>x && y>z) {
			max = y;
		} else {
			max = z;
		}
		
		System.out.println("max = "+max);
		
		// 삼항 연산자
		System.out.println("**삼항연산자**");
		
		max = x>y&&x>z ? x:y>x&&y>z ? y:z;
		System.out.println("max = "+max);

	}

}
