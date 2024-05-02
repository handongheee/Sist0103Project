package day0112;

// interface는 상수와 추상메서드만 가질 수 있다.
// class가 class를 : extends
// class가 interface를 : implements
// interface가 interface를 : extends
interface FoodShop{
	String SHOPNAME="남소관"; // 상수? final 생략
	
	public void order(); // 추상메서드이므로 abstract 생략
	public void baedal();
	
}
////////////////////
//extends 불가 > implements
class Food2 implements FoodShop {

	@Override
	public void order() {
		// TODO Auto-generated method stub
		// SHOPNAME="왕돈까스"; // 상수이므로 수정 불가
		System.out.println("음식을 주문합니다.");
	}

	@Override
	public void baedal() {
		// TODO Auto-generated method stub
		System.out.println("음식을 배달합니다.");
	} 
		
}
/////////////////////

class Food3 implements FoodShop{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("키오스크 주문");
		
	}

	@Override
	public void baedal() {
		// TODO Auto-generated method stub
		System.out.println("쿠팡이츠 배달");
	}
	
}

////////////////////////////
public class Implement_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodShop fs;
		
		fs = new Food2();
		fs.order();
		fs.baedal();
		
		fs = new Food3();
		fs.order();
		fs.baedal();
	}

}
