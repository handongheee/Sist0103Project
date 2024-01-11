package day0105;

import java.util.Scanner;

public class QuizOper_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, grade;
		int kor, eng, math, total, avg;
		
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		
		System.out.print("국어, 영어, 수학 성적을 입력하세요: ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		total = kor+eng+math;
		avg = total/3;
		
		System.out.println("====================");
		System.out.println("이름: "+name);
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
		
		if(avg>=90) {
			System.out.println("매우 잘함");
		} else if (avg>=80) {
			System.out.println("잘함");
		} else if (avg>=70) {
			System.out.println("보통");
		} else {
			System.out.println("꽝");
		}
		
//		switch(avg)
//		{
//		case 90:
//			System.out.println("매우 잘함");
//			break;
//		case 80:
//			System.out.println("잘함");
//			break;
//		case 70:
//			System.out.println("보통");
//			break;
//		default:
//			System.out.println("꽝");
//		}
		
		

	}

}
