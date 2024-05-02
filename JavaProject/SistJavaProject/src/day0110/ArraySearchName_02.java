package day0110;

import java.util.Scanner;

public class ArraySearchName_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"한동희", "유재석", "홍길동", "강호동", "박나래", "가나다", "김이박", "김재석"};
		boolean flag;

		Scanner sc = new Scanner(System.in);
		String name;

		while(true) {
			System.out.println("이름을 입력하세요. ");
			name=sc.nextLine();

			// 문자열 비교는 메서드로 equals 
			if(name.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			flag=false;

			for(int i=0; i<names.length; i++) {
				if(name.equals(names[i])) {
					flag=true;
					System.out.println((i+1)+"번째에서 검색");
				}			
			}
			
			if(!flag) {
				System.out.println(name+"님은 데이터에 없습니다.");
			}
			
		}

	}

}
