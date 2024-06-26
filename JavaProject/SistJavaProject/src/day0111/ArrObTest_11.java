package day0111;

class Shop{
	private String sangpum;
	private int price;
	private String sangpumColor;
	
	public Shop(String sangpum, int price, String sangpumColor) {
		this.sangpum=sangpum;
		this.price=price;
		this.sangpumColor=sangpumColor;
		
	}
	
	// 제목
	public static void shopTitle() {
		System.out.println("상품명\t가격\t색상");
		System.out.println("=======================");
	}
	
	// 출력 메서드(생성한 개수만큼 출력)
	public void showShop() {
		System.out.println(sangpum+"\t"+price+"\t"+sangpumColor);	
	}
	
}


public class ArrObTest_11 {

	public static void main(String[] args) {
		// 4개 생성해서 출력할 것
		Shop [] sh = {	 
				new Shop("아이폰", 1000000, "화이트"),
				new Shop("가방", 50000, "블랙"),
				new Shop("컴퓨터", 5000000, "실버"),
				new Shop("키보드", 1000, "그린")
		};
		
		Shop.shopTitle(); // static이므로 바로 불러오기 가능
		
		for(int i=0; i<sh.length; i++) {
			sh[i].showShop();
			System.out.println("----------------------");
		}

	}

}
