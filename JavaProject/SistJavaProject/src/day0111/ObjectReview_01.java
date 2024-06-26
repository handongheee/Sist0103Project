package day0111;

// 객체의 속성: 인스턴스 변수, 객체의 동작: 클래스의 메서드
// Object: 객체, 실제로 존재하는 사물(ex.핸드폰, 자동차..)
// class: 객체를 정의한 것, 객체를 생성하기 위해 존재(ex.설계도, 붕어빵틀..)
// Instance: 클래스에서 만들어진 객체를 그 클래스의 인스턴스라고 한다

class Person{
	// 인스턴스 변수
	private String name;
	private int age;
	private String hp;
	private String addr;
	
	// 디폴트 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}

	// 명시적 생성자 (디폴트 생성자 호출x)
	public Person(String name, int age, String hp, String addr) {
		this.name=name;
		this.age=age;
		this.hp=hp;
		this.addr=addr;
	}

	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}

///////////////////////////////////////////
public class ObjectReview_01 {
	public static void main(String[] args) {
		// 객체 생성
		Person p1 = new Person();
		
		// p1.name="홍길동"; private 인스턴스 변수는 생성해도 변수에 접근 불가 get set 필요
		p1.setName("김민지");
		p1.setAge(20);
		p1.setHp("010-1234-1234");
		p1.setAddr("강남구");
		
		// getter
		String name = p1.getName();
		int age = p1.getAge();
		String hp = p1.getHp();
		String addr = p1.getAddr();
		
		System.out.println("[개인 신상 정보]");
		System.out.println(name);
		System.out.println(age);
		System.out.println(hp);
		System.out.println(addr);
		
		Person p2 = new Person("김소미", 23, "010-3456-3456", "송파구");
		
		System.out.println("-----------------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getHp());
		System.out.println(p2.getAddr());
		
	}

}
