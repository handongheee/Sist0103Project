package day0112;

public class SubObj_03 extends SuperObj_03 {
	
	String addr;
	
	public SubObj_03(String name, int age, String addr) {
		super(name, age); // 반드시 첫줄에(this), 부모 생성자 호출, 둘다 디폴트생성자면 굳이 생성 안해도 됨
		this.addr=addr; // 자식꺼
	}
	
	 // 부모한테 상속 받았지만 부모에 디폴트생성자가 없으면 오류남
	public SubObj_03() {

	}
	
	public void writeData() {
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("주소: "+this.addr);
	}

}
