package day0111;

class Student1 {
	private String stuName;
	private String hp;
	private int score;

	// 생성자 3개짜리
	public Student1(String name, String hp, int score) {
		// TODO Auto-generated constructor stub
		this.stuName=name;
		this.hp=hp;
		this.score=score;
	}

	// 출력 메서드
	public void writeData() {
		System.out.println("이름: "+stuName);
		System.out.println("전화번호: "+hp);
		System.out.println("점수: "+score);
	}
}

public class ArrObTest_10 {

	public static void main(String[] args) {
		/*
		// 배열 변수 선언...초기화
		Student1 [] stu = new Student1[3];

		stu[0] = new Student1("이민호", "010-1234-1234", 88);
		stu[1] = new Student1("이영아", "010-1111-2222", 77);
		stu[2] = new Student1("김민정", "010-9999-8888", 98);
		 */

		// 생성과 동시에 초기화
		Student1 [] stu = {
				new Student1("이민호", "010-1234-1234", 88), 
				new Student1("이영아", "010-1111-2222", 77),
				new Student1("김민정", "010-9999-8888", 98)
		};
		
		// 방법#1. 배열 출력 
		for(int i=0; i<stu.length; i++) {
			/*
			Student1 s = stu[i];
			s.writeData();
			*/
			
			stu[i].writeData();
			System.out.println("------------------");
		}
		
		// 방법#2. 배열 출력
		System.out.println("================================");
		for(Student1 s1: stu) {
			s1.writeData();
			System.out.println("-------------------");
		}

	}

}