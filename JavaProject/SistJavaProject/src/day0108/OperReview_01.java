package day0108;

import java.util.Scanner;

public class OperReview_01 {
	public static void main (String[] args) {
		// import, 선언, 입력, 계산, 출력
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math;
		
		System.out.println("이름? ");
		name = sc.nextLine();
		
		System.out.println("국어 영어 수학 점수? ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		double avg = (kor+eng+math)/3.0;
		
		/*
		System.out.println("3과목의 점수: "+kor+", "+eng+", "+math);
		System.out.printf("평균: %.2f \n", avg); 
		
		System.out.println("**합격 조건: 평균이 60점 이상, 각 과목 모두 40점 이상이면 합격**");
		System.out.println("======================");
		
		// if 조건문
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println(name+"님은 합격입니다.");
		} else {
			System.out.println(name+"님은 불합격입니다.");
		}
		*/
		
		// 삼항연산자 복습
		System.out.printf("평균: %5.1f \n", avg);
		System.out.println("**평가: 80점 이상 (매우잘함), 70점 이상(좀더노력), 70점 미만(불합격)**");
		System.out.println("평가: "+(avg>=80? "매우 잘함":avg>=70? "좀 더 노력":"불합격"));
	}

}
