package day0104;

public class Quiz {
	public static void main(String[] args) {
		// 실행단계에서 상품명, 수량, 단가를 입력한 후 다음과 같이 출력하세요
		// 1. 변수 선언
		String proName = args[0];
		int cnt = Integer.parseInt(args[1]);
		int price = Integer.parseInt(args[2]);

		// 2. 계산
		int tot = cnt*price;

		// 3. 출력
		System.out.println("상품명: "+proName);
		System.out.println("수량: "+cnt+"개");
		System.out.println("단가: "+price+"원");
		System.out.println("총 금액: "+tot+"원");

	}

}
