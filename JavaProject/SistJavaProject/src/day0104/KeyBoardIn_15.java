package day0104;

import java.util.Scanner;

public class KeyBoardIn_15 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 입력하고 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 변수는 미리 선언하거나 입력할 때 줘도 됨
		String stuName;
		int kor, eng, math;
		int tot;
		double avg;
		
		// 입력
		System.out.println("학생명?");
		stuName = sc.nextLine();
		System.out.println("국어 영어 수학 점수를 입력하시오.");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		// 계산
		tot = kor+eng+math;
		avg = tot/3.0; // 실수 값 나오게 3.0
		
		// 최종 출력
		System.out.println("===================");
		System.out.println("학생명: "+stuName);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		System.out.println("합계: "+tot);
		System.out.println("평균: "+avg);
		

	}

}
