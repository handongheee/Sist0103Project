package day0105;

import java.util.Scanner;

public class Equal_15 {

	public static void main(String[] args) {
		// 문자열 비교는 관계연산자로 안됨
		// equals() 메서드 이용
		
		Scanner sc = new Scanner(System.in);
		
		String word; // 입력할 단어
		
		System.out.println("영어단어를 입력해 보세요. ");
		System.out.println("ex) happy, rose, dragon, angel, music");
		
		word = sc.nextLine();
		
		System.out.println("입력한 단어: "+word);
		
		if(word.equals("angel")) {
			System.out.println("**천사**");
		} else if(word.equalsIgnoreCase("happy")) { // equalsIgnoreCase 대소문자 구분 안함
			System.out.println("**행복**");
		} else if(word.equalsIgnoreCase("rose")) {
			System.out.println("**장미**");
		} else if(word.equalsIgnoreCase("music")) {
			System.out.println("**음악**");
		} else if(word.equalsIgnoreCase("dragon")) {
			System.out.println("**용**");
		} else {
			System.out.println("단어가 등록되지 않았어요.");
		}

	}

}
