package day0105;

import java.util.Calendar;
import java.util.Scanner;

public class QuizMyAgeInOut_02 {

	public static void main(String[] args) {
		// 이름, 생년, 지역
		// import
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		// 변수
		String name, area;
		int birth, year, age;
		year = cal.get(cal.YEAR); // 2024
		
		// 입력
		System.out.print("당신의 이름은? ==> ");
		name = sc.nextLine();
		
		System.out.print("당신이 태어난 연도는? ==> ");
		birth = Integer.parseInt(sc.nextLine()); // sc.nextLine()? 키보드에 버퍼/엔터를 먼저 읽어서 없애줌
		
		System.out.print("당신이 사는 지역은? ==> ");
		area = sc.nextLine();
		
		// 계산
		age = year-birth;
		
		// 출력
		System.out.println("======================");
		System.out.println("["+name+" 님의 개인 정보]");
		System.out.println("======================");
		System.out.println("이름: "+name);
		System.out.println("태어난 연도: "+birth);
		System.out.println("나이: "+age+"세");
		System.out.println("지역: "+area);
		
		
		

	}

}
