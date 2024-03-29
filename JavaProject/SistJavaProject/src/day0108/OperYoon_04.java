package day0108;

import java.util.Scanner;

public class OperYoon_04 {

	public static void main(String[] args) {
		// 윤년 공식: year%4==0 && year%100!=0 || year%400==0
		// 연도를 입력해서 그 해가 윤년인지 평년인지 출력하고 해당 달이 며칠까지 있는지 출력

		Scanner sc = new Scanner(System.in);

		int year, month, days;
		boolean flag; // 윤년 유무 구분

		System.out.println("연도와 월 입력: ");
		year = sc.nextInt();
		month = sc.nextInt();

		// 월 잘 못 입력 시 프로그램 종료
		if (month<1 || month>12) {
			System.out.println("월을 잘 못 입력했어요!");
			return; // 메인 메서드 종료
		} 

		// 윤년 구하기
		flag = year%4==0 && year%100!=0 || year%400==0;

		// if(flag==true) = if(flag) true는 생략 가능, false는 if(!flag)
		if(flag) {
			System.out.println(year+"년도는 윤년입니다.");
		} else {
			System.out.println(year+"년도는 평년입니다.");
		}

		// 해당 년도의 월이 며칠까지 있는지 구하기
		if(month==4 || month==6 || month==9 || month==11) {
			days=30;
		} else if(month==2) {
			if(flag) {
				days=29; // 윤년일 경우 29일까지
			} else {
				days=28; 
			}
		} else {
			days=31;
		}

		System.out.println(year+"년 "+month+"월은 "+days+"일까지 있습니다.");
	}

}
