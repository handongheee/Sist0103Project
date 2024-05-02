package day0110;

class Mart{
	private String sangpum;
	int su; // 수량
	int dan; // 단품가격

	static String SHOPNAME="롯데마트";

	// sangpum은 메서드가 아니면 다른 클래스에서 접근 불가		
	public void setSangpum(String sangpum) {
		this.sangpum=sangpum;
	}
	//	public void setSu(int su) {
	//		this.su=su;
	//	}
	//	public void setDan(int dan) {
	//		this.dan=dan;
	//	}

	public String getSangpum() {
		return sangpum;
	}
	//	public int getSu() {
	//		return su;
	//	}
	//	public int getDan() {
	//		return dan;
	//	}
	
	
	// su, dan은 private이 아니므로 다른 클래스에서 생성 시 변수접근 가능
	// static은 다른 클래스에서 접근 시 클래스명.변수명 으로 접근 가능

	
}

//////////////////////////
public class QuizClass_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart mt1 = new Mart();
		mt1.setSangpum("초코파이");
		mt1.su=10; // mt1.setSu(10);
		mt1.dan=4500; // mt1.setDan(4500);
		
		Mart mt2 = new Mart();
		mt2.setSangpum("엄마손파이");
		mt2.su=4; // mt2.setSu(4);
		mt2.dan=2500; // mt2.setDan(2500);
		
		// * getter
		// String sangpum1 = mt1.getSangpum();
		// int su1 = mt1.getSu();
		// int dan1 = mt1.getDan();		
		// String sangpum2 = mt2.getSangpum();
		// int su2 = mt2.getSu();
		// int dan2 = mt2.getDan();

		System.out.println("*** "+Mart.SHOPNAME+" 입고물품 ***");
		System.out.println("======================");	
		System.out.println("상품명: "+mt1.getSangpum()); // System.out.println("상품명: "+sangpum1);		
		System.out.println("수량: "+mt1.su+"개"); // System.out.println("수량: "+su1+"개");
		System.out.println("가격: "+mt1.dan+"원"); // System.out.println("가격: "+dan1+"원");
		System.out.println("----------------------");	
		System.out.println("상품명: "+mt2.getSangpum()); // System.out.println("상품명: "+sangpum1);	
		System.out.println("수량: "+mt2.su+"개"); // System.out.println("수량: "+su1+"개");
		System.out.println("가격: "+mt2.dan+"원"); // System.out.println("가격: "+dan1+"원");

	}

}
