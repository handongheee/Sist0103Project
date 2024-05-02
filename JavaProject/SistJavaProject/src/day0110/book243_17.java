package day0110;

class Car{
	String model;
	int speed;
	
	// 생성자 선언
	Car(String model){
		this.model=model;
	}
	
	// 메소드 선언
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model+"가 달립니다.(시속: "+ this.speed+"km/h)");
	}	
}

////////////////////////////////
public class book243_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("아우디");
		
		myCar.run();
		yourCar.run();

	}

}
