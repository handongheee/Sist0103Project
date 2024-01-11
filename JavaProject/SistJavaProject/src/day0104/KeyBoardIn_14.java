package day0104;

import java.util.Scanner;

public class KeyBoardIn_14 {

	public static void main(String[] args) {
		// 키보드 입력에 필요한 Scanner 클래스를 import
		// 1. import
		Scanner sc = new Scanner(System.in);
		
		// 2. 변수 선언
		String name;
		int age;
		
		// 3. 입력
		System.out.print("이름을 입력해 보세요 ==>");
		name = sc.nextLine(); // 한 줄을 문자로 읽어옴(공백 사용 가능), String 값 반환
		
		System.out.print("나이를 입력해 보세요 ==>");
		// age = sc.nextInt(); // 숫자로 읽어옴, int값 반환
		// 숫자 입력 후 엔터 누르면 그 엔터가 키보드 버퍼로 저장되어 다음 문자열 읽을 때 먼저 읽어 버리는 현상 발생
		// 그래서 다음 문자열 읽기 전에 그 엔터 읽어 없애기 -> sc.nextLine()
		age = Integer.parseInt(sc.nextLine()); // 
		
		System.out.print("당신이 사는 지역은 ==>");
		String city = sc.nextLine(); 
		
		// 4. 최종 출력
		System.out.println(name+"님의 나이는 "+age+"세이고, "+city+"지역에 살아요.");
		

	}

}
