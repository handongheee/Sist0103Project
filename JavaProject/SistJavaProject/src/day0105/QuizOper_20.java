package day0105;

import java.util.Scanner;

public class QuizOper_20 {

	public static void main(String[] args) {
		/* (상품을 5개 이상 구매 시 10% 할인하여 계산) 0.09
		 * 상품명: 키보드
		 * 수량: 3
		 * 가격: 20000
		 * 
		 * ==============
		 * 5개 이상 구매 시 10% 할인
		 * 키보드 5개는 총 90000원입니다.
		 * 할인된 금액: 10000
		 */
		Scanner sc = new Scanner(System.in);
		
		String proName;
		int cnt;
		double total, price, disPrice;
		
		System.out.print("상품명: ");
		proName = sc.nextLine();
		
		System.out.print("수량: ");
		cnt = sc.nextInt();
		
		System.out.print("가격: ");
		price = sc.nextInt();
		
		
		total = cnt*price;
		
		if(cnt>=5) {
			total = total*0.9;	
			disPrice = (cnt*price)-total;
		} else {
			total = total;
			disPrice = (cnt*price)-total;
		}
		
		
		System.out.println("====================");
		System.out.println("5개 이상 구매 시 10% 할인");
		System.out.println(proName+" "+cnt+"개는 총 "+total+"원 입니다.");
		System.out.println("할인된 금액: "+disPrice);
		
		
		
		

	}

}
