package day0105;

import java.util.Scanner;

public class QuizOper_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, grade;
		int java;
		
		System.out.printf("이름을 입력해 주세요. ");
		name = sc.nextLine();
		
		System.out.printf("자바 시험 점수를 입력해 주세요. ");
		java = sc.nextInt();
		
		// if문
//		if (java >= 90) {
//			grade = "매우 잘함";
//		} else if (java >= 80) {
//			grade ="잘함";
//		} else if (java >= 70) {
//			grade ="좀 더 노력할 것";
//		} else {
//			grade ="꽝!";
//		}
		
		// 삼항연산자
		grade = java>=90?"매우 잘함":java>=80?"잘함":java>=70?"좀 더 노력할 것":"꽝!";
		
		System.out.println("==========================");
		System.out.println(name+"님의 시험 평가는 "+grade+" 입니다.");
		System.out.println("==========================");
		

	}

}
