package day0104;

import java.util.Scanner;

public class QuizKeyBoardIn_16 {

	public static void main(String[] args) {
		// 상품명, 가격, 수량, 총가격
		Scanner sc = new Scanner(System.in);
		
		String proName;
		int price, cnt;
		
		System.out.print("상품명을 입력하세요 ==>");
		proName = sc.nextLine();
		System.out.print("가격은 얼마입니까 ==>");
		price = sc.nextInt();
		System.out.print("수량은 몇 개입니까 ==>");
		cnt = sc.nextInt();
		
		int tot = price*cnt;
		
		System.out.println();
		System.out.println("상품입고");
		System.out.println("=======================");
		System.out.println("입고 상품명: "+proName);
		System.out.println("수량: "+cnt+"개");
		System.out.println("가격: "+price+"원");
		System.out.println("=======================");
		System.out.println("총 가격: "+tot+"원");

	}

}
