package day0108;

import java.util.Scanner;

public class QuizFor_12 {

	public static void main(String[] args) {
		// 1. 1 2 4 5 7 8 10 (continue 활용)
		for(int i=1; i<=10; i++) {
			if(i%3==0)
				continue;
			System.out.print(i+" ");
		}
		System.out.println();

		// 2. 홀수값:1 홀수값:3 홀수값:5 홀수값:7
		for(int a=1; a<=10; a++) {
			if(a%2==0)
				continue;
			System.out.print("홀수값:"+a+" ");
		}
		System.out.println();

		// 3. 점수 입력 후 합계를 구하는데, 0을 입력하면 빠져나와서 합계 출력 while(true) 
		Scanner sc = new Scanner(System.in);
		int score;
		int sum=0;

		while(true) 
		{
			System.out.print("점수를 입력하세요. ");
			score = sc.nextInt();

			if(score==0) 
				break;
			
			// 1~100
			if(score<0 || score>100) {
				System.out.println("다시 입력해주세요.(1~100)");
				continue;
			}
			
			sum+=score;
		}
		System.out.println("총 합계: "+sum);
		
	}

}
