package day0112;
/*
 * [쌍용매장 입고상품]
 * 번호	상품명	가격	색상	
 * ========================
 * 1	요가매트 25000원 핑크
 * 2	아령	3000원	블랙
 * 3	레깅스 45000원	베이지
 * 4	나시	22000원	화이트 
 */

class Shop{
	private String proName;
	private int proPrice;
	private String proColor;

	static int no;
	static String shopName="쌍용";

	// 명시적 생성자
	public Shop(String name, int price, String color) {
		this.proName=name;
		this.proPrice=price;
		this.proColor=color;
	}

	// 제목 (처럼 의미 없는건 static)
	public static void showTitle() {
		System.out.println("["+Shop.shopName+" 매장 입고 상품]");
		System.out.println("번호\t상품명\t가격\t색상");
		System.out.println("===========================");
	}

	// 출력
	public void showShop() {
		no++;
		System.out.println(no+"\t"+proName+"\t"+proPrice+"\t"+proColor);		
	}	
}

////////////////////////////////
public class ArrReview_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop [] shop = {
				new Shop("요가매트", 25000, "핑크"),
				new Shop("아령", 30000, "블랙"),
				new Shop("레깅스", 50000, "베이지"),
				new Shop("나시", 22000, "화이트")	
		};

		Shop.showTitle();

		for(Shop s: shop) {
			s.showShop();
		}
		
		for(int i=0; i<shop.length; i++) {
			shop[i].showShop();
		}

	}

}