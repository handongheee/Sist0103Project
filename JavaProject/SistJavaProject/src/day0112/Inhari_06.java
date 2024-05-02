package day0112;

class Emart{
	private String sangpum;
	private int su;
	
	// 디폴트 생성자
	public Emart() {
		//sangpum="딸기";
		//su=10; ↓↓ 같은 방법		
		this("딸기", 10);
	}
	
	// 명시적 생성자
	public Emart(String sangpum, int su) {
		this.sangpum=sangpum;
		this.su=su;
	}
	
	// 메서드
	public void writeMart() {
		System.out.println("상품명: "+sangpum);
		System.out.println("수량: "+su);
	}
		
}

//자식이마트
class GangnamEmart extends Emart{
	private int price;
	
	GangnamEmart() {
		price = 10000;
	}
	
	public GangnamEmart(String sangpum, int su, int price) {
		super(sangpum, su);
		this.price=price;
	}
	
	// writeMart 재정의(오버라이드)
	@Override
	public void writeMart() {
		// TODO Auto-generated method stub
		System.out.println("단가: "+price);
		super.writeMart(); 
	}
}

//////////////////////////////
public class Inhari_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GangnamEmart gang1 = new GangnamEmart();
		gang1.writeMart();
		
		System.out.println();
		
		// 인자값 있는거 불러오기
		GangnamEmart gang2 = new GangnamEmart("수박", 5, 25000);
		gang2.writeMart();

	}

}
