package day0105;

import java.util.Scanner;

public class KeyBoardIn_01 {

	public static void main(String[] args) {
		// 이름, 전화번호, 주소 입력 후 출력하기 
		// 1. import
		Scanner sc = new Scanner(System.in);
		
		// 2. 변수 선언
		String name, hp, addr;
		
		// 3. 입력
		System.out.println("이름을 입력하세요: ");
		name = sc.nextLine();
		
		System.out.println("전화번호는? ");
		hp = sc.nextLine();
		
		System.out.println("주소는? ");
		addr = sc.nextLine();
		
		// 4. 최종 출력
		System.out.println("========================");
		System.out.println("\t[입력 결과]");
		System.out.println("이름: "+name+"님");
		System.out.println("핸드폰: "+hp);
		System.out.println("주소: "+addr);
		
	}

}