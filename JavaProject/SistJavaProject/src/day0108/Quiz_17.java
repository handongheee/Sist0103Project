package day0108;

import java.util.Scanner;

public class Quiz_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//quiz_1();
		quiz_2();

	}

	public static void quiz_1() {
		// Q. 숫자를 반복해서 입력하여 양수의 갯수와 음수의 갯수를 구하시오 0 입력 시 종료 while(true)
		Scanner sc = new Scanner(System.in);

		int i;
		int m_cnt=0;
		int p_cnt=0;

		while(true) {
			System.out.print("숫자를 입력하세요: ");
			i = sc.nextInt();

			if(i>0) {
				p_cnt++;
			} else if(i<0) {
				m_cnt++;
			}

			if(i==0) {
				break;
			}
			
			/*
			 * if(i==0)
			 * 		break;
			 * if(i>0)
			 * 		p_cnt++:
			 * else
			 * 		m_cnt--;
			 */
		}
		System.out.println("양수의 갯수: "+p_cnt);
		System.out.println("음수의 갯수: "+m_cnt);
	}


	public static void quiz_2() {
		// 점수를 반복해서 입력하고 (1~100) 0을 입력 시 빠져나와 갯수, 합계와 평균을 구하시오 while(true)
		// 범위에 맞지 않는 점수는 횟수에서 제외
		Scanner sc = new Scanner(System.in);

		int score;
		int cnt=0;
		int sum=0;
		double avg;

		while(true) {
			System.out.print("점수를 입력하세요: ");
			score = sc.nextInt();

			if(score==0) {
				break;
			}

			if(score<1 || score>100) {
				System.out.println("1~100 내 숫자를 입력해주세요.");
				continue;
			}
			
			cnt++;
			sum+=score;
		}
		
		avg=sum/cnt;
		System.out.println("갯수: "+cnt);
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
	}

}
