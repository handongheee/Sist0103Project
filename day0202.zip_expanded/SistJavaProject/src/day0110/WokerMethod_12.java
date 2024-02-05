package day0110;

class Info{

	private String stuName;
	private int stuAge;

	// setter 메서드
	// 1. 데이터를 수정할 목적 - set변수명
	// 2. 저장용도이므로 결과값(return값) 없다
	// 3. 리턴값이 없으므로 void라고 지정해야 한다.
	public void setName(String stuName) {
		this.stuName=stuName; // 이름이 다를 경우엔 this 생략 가능
	}

	public void setAge(int stuAge) {
		this.stuAge=stuAge;
	}
	
	// getter 메서드
	// 1. 데이터를 조회할 목적 - get변수명
	// 2. 데이터를 얻는 목적이므로 인자값 없다.
	// 3. 실행의 결과값을 돌려줌으로 'return 결과값' 으로 지정
	public String getName() {
		return stuName;
	}
	
	public int getAge() {
		return stuAge;
	}
	
	
	
}

////////////////////////////////
public class WokerMethod_12 {

	public static void main(String[] args) {

		Info in1 = new Info();
		// in1.stuName="홍길동"; 인스턴스 변수에 private이 붙으면 변수 접근 불가(생성 해도)
		// in1.stuAge=18;
		
		// setter 메서드를 이용해서 값 수정
		in1.setName("한동희");
		in1.setAge(20);
		
		// getter 메서드를 이용해서 값 얻기
		String name = in1.getName();
		int age = in1.getAge();
		
		System.out.println(name+", "+age);
		

	}

}
