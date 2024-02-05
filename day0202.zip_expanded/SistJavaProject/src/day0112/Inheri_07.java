package day0112;

// 부모
class School{
	public static final String SCHOOLNAME="쌍용고등학교"; 
	private String schoolAddr; // get set값 없으면 노란줄 
	private int countStu;
	private int countTeacher;

	// 디폴트
	public School() {
		this("강남구 역삼동", 120, 10); // 명시적 생성자 호출 -> 초기화를 위해
	}

	// 명시적
	public School(String saddr, int cntstu, int cntteacher) {
		this.schoolAddr=saddr;
		this.countStu=cntstu;
		this.countTeacher=cntteacher;
	}

	// setter&getter
	public String getSchoolAddr() {
		return schoolAddr;
	}

	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}

	public int getCountStu() {
		return countStu;
	}

	public void setCountStu(int countStu) {
		this.countStu = countStu;
	}

	public int getCountTeacher() {
		return countTeacher;
	}

	public void setCountTeacher(int countTeacher) {
		this.countTeacher = countTeacher;
	}

	public static String getSchoolname() {
		return SCHOOLNAME;
	}

	// 메서드
	public void writeData() {
		System.out.println("학교 주소: "+this.schoolAddr);
		System.out.println("학생 수: "+this.countStu+", 선생님 수: "+this.countTeacher);

	}

}

////////////////////////////////
// 자식
class Student extends School {
	private String stuName;
	private int grade;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String sAddr, int cntStu, int cntTea, String stuname, int gra) {
		super(sAddr, cntStu, cntTea);
		this.stuName=stuname;
		this.grade=gra;
	}

	// 각각의 setter&getter
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// 재정의 메서드
	@Override
	public void writeData() {
		System.out.println("학교명: "+SCHOOLNAME); //상속해서 클래스명 생략해도 된다. School.SHOOLNAME 
		
		super.writeData();
		System.out.println("학생명: "+stuName);
		System.out.println("학년: "+grade+"학년");
	}
	
}


////////////////////////////////
public class Inheri_07 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.writeData();
		System.out.println();
		
		Student s2 = new Student("송파구", 150, 20, "김가나", 5);
		s2.writeData();
		
		System.out.println();
		System.out.println("1번째 학생 학생명과 학년 변경 후 출력하기 **");
		s1.setStuName("이영자");
		s1.setGrade(3);
		s1.writeData();

	}

}
