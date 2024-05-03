package spring.di.ex02;

public class Person {
	String schoolName;
	MyInfo info; // 레퍼런스(멤버로) 주입
	
	// 명시적 생성자
	public Person(MyInfo info) {
		// TODO Auto-generated constructor stub
		super();
		this.info=info;	
	}

	// setter
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	// 출력
	public void writeData() {
		System.out.println("** 학생 정보 출력 **");
		
		System.out.println("학교명 : "+schoolName);
		System.out.println("이름 : "+info.name);
		System.out.println("나이 : "+info.age);
		System.out.println("주소 : "+info.addr);
		
	}
	

}
