package day0112;

/*
[메뉴_1]
음식명: 마르게리타 피자
가격: 12000원
-----------------------------
[메뉴_2]
음식명: 까르보나라 스파게티
가격: 10000원
-----------------------------
[메뉴_3]
음식명: 리코타 샐러드
가격: 9000원
 */

class Food{
	private String foodName;
	private int fPrice;

	static int no; // 초기화 안하면 값 자체가 0

	
	// 명시적 생성자(2개)
	public Food (String name, int price) {
		this.foodName=name;
		this.fPrice=price;
	}
	
	// 출력문
	public void getFood() {
		no++;
		System.out.println("[메뉴_"+no+"]");
		System.out.println("음식명: "+foodName);
		System.out.println("가격: "+fPrice);
		System.out.println("---------------------------");
	}
}

///////////////////////////////////
public class ArrReview_01 {

	public static void main(String[] args) {
		/* 일반
		Food food1 = new Food("마르게리따 피자", 15000);
		food1.getFood();
		
		Food food2 = new Food("까르보나라", 12000);
		food2.getFood();
		
		Food food3 = new Food(리코타 샐러드", 8000);
		food3.getFood();
		*/
		
		// 배열로
		Food [] food = new Food[3];
		
//		food[0]=new Food("마르게리타 피자", 15000);
//		food[1]=new Food("까르보나라", 12000);
//		food[2]=new Food("리코타 샐러드", 8000);
		food[0]=new Food("마르게리타 피자", 15000);
		food[1]=new Food("까르보나라 스파게티", 12000);
		food[2]=new Food("리코타 샐러드", 9000);
		
		for(int i=0; i<food.length; i++) {
			/* 변수화
			Food f = food[i];
			f.getFood();
			*/	
			food[i].getFood();
		}
		
		// for each문
		for(Food f: food) {
			f.getFood();
		}
		

	}

}
