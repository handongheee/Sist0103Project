package day0110;

public class CardTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card.width = 10;
		Card.height = 20;
		
		// 클래스가 로딩될 때 변수명도 바로 로딩됨
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		// 인스턴스 변수 생성
		Card c1 = new Card();
		System.out.println(c1.kind); // null
		System.out.println(c1.num); // 0
		
		c1.kind = "Heart";
		c1.num = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.num = 6;
		
		System.out.println(c1.kind+", "+c1.num+", "+Card.width+", "+Card.height);
		System.out.println(c2.kind+", "+c2.num+", "+Card.width+", "+Card.height);
		
		// 카드 너비 높이 50 80
		Card.width=50;
		Card.height=80;
		
		System.out.println(c1.kind+", "+c1.num+", "+Card.width+", "+Card.height);
		System.out.println(c2.kind+", "+c2.num+", "+Card.width+", "+Card.height);
		
		
		
	}

}