package day0112;

public class Manager_04 extends Employee_04 {

	String depart;
	
	public Manager_04(String name, int sal, String de) {
		super(name, sal); // 부모생성자 호출
		depart = de; // 부서 초기화
	}
	
	// 재정의(오버라이드)된 메서드_하위(자식) 클래스에서 부모클래스의 메서드를 수정해서 사용하는 것
	// 상속이 전제, 메서드명이 동일해야 함, 메서드 리턴타입도 동일해야 함
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee()+", "+depart;
	}

}
