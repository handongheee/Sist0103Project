package day0112;

/*
 * **디폴트 생성자로 생성**
 * 회사명: 현대
 * 종류: 전기차 트럭
 * 자동차명: 아이오닉5
 * 색상: 블랙
 * 가격: 40000000
 * 
 * **명시적 생성자로 생성**
 * 회사명: 기아
 * 종류: 가솔린
 * 자동차명: 코나
 * 색상: 화이트
 * 가격: 35000000
 */

// 부모클래스
class Car{
	private String carCompany; // 제조회사
	private String carKind; // 종류
	
	// 디폴트 생성자
	public Car() {
		// TODO Auto-generated constructor stub
		carCompany="현대";
		carKind="전기차";
	}
	
	// 명시적 생성자
	public Car(String carcompany, String carkind) {
		this.carCompany=carcompany;
		this.carKind=carkind;
	}

	// setter getter
	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getCarKind() {
		return carKind;
	}

	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}
	
	// 출력메서드
	public void writeCar() {
		System.out.println("회사명: "+this.carCompany);
		System.out.println("종류: "+this.carKind);
	}
}

//////////////////////////////////////////
// 자식클래스
class MyCar extends Car {
	private String carName;
	private String carColor;
	private int carPrice;
	
	public MyCar() {
		// TODO Auto-generated constructor stub
		super(); // 생략된 것
		carName="아이오닉";
		
	}
	
	public MyCar(String carcompany, String carkind, String carname, String carcolor, int carprice) {
		super(carcompany, carkind);
		this.carName=carname;
		this.carColor=carcolor;
		this.carPrice=carprice;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	
	// 메서드 재정의
	@Override
	public void writeCar() {
		// TODO Auto-generated method stub
		super.writeCar();
		System.out.println("자동차명: "+this.carName);
		System.out.println("색상: "+this.carColor);
		System.out.println("가격: "+this.carPrice);
	}
	
	
}

public class Inherit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**디폴트 생성자로 생성**");
		MyCar c1 = new MyCar();
		//c1.setCarCompany("현대");	
		//c1.setCarKind("전기차");
		//c1.setCarName("아이오닉5");
		c1.setCarColor("블랙");
		c1.setCarPrice(35000000);
		
		c1.writeCar();

		System.out.println();
		
		System.out.println("**명시적 생성자로 생성**");
		MyCar c2 = new MyCar("기아", "가솔린", "코나", "화이트", 25000000);
		
		c2.writeCar();
		
		System.out.println();
		
		System.out.println("**부모메서드 출력**");
		Car car1 = new Car();
		car1.writeCar();
		
		
		
	}

}