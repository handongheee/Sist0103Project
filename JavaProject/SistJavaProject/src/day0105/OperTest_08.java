package day0105;

import java.util.Scanner;

public class OperTest_08 {

	public static void main(String[] args) {
		// 이름과 키, 몸무게 입력하면 표준 몸무게를 출력 (키-100)*0.9 소수점 한자리로 출력
		Scanner sc = new Scanner(System.in);
		
		String name;
		double height, weight, sw;
		// double sw;
		
		System.out.printf("당신의 이름? ");
		name = sc.nextLine();
		
		System.out.printf("키? ");	
		height = sc.nextDouble(); //height = Double.parseDouble(sc.nextLine());
		
		System.out.printf("몸무게? ");
		weight = sc.nextDouble(); // weight = Double.parseDouble(sc.nextLine());
		
		sw = (height-100)*0.9;
		
		System.out.println("===========================");
		System.out.printf("%s님의 권장 표준 몸무게는 %.1f kg 입니다.", name, sw);

	}

}
