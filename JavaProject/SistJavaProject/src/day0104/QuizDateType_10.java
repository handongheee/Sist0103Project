package day0104;

public class QuizDateType_10 {

	public static void main(String[] args) {
		String name = args[0];
		String area = args[1];
		int age = Integer.parseInt(args[2]); // String age = args[2];
		int java = Integer.parseInt(args[3]);
		int oracle = Integer.parseInt(args[4]);
		
		int tot = java+oracle;
		
		System.out.printf("학생명: %s\n", name);
		System.out.printf("지역: %s\n", area);
		System.out.printf("나이: %d\n", age);
		System.out.println("======================");
		System.out.printf("%s님의 java 점수는 %d, oracle 점수 %d, 총 %d입니다.", name, java, oracle, tot);
		// System.out.println(name+"님의 자바 점수는 "+java+"점 오라클 점수는 "+oracle+"점 총 "+tot+"입니다.");
		
	
	}

}