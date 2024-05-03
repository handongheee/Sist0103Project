package day0103;

public class EscapeSeq_04 {

	public static void main(String[] args) {
		// 문자열 내에서 특별한 의미로 해석되는 문자들은 가르켜 이스케이프 시퀀스라고 한다
		// 이스케이프 시퀀스는 모두 \로 시작.
		// \t : 다음 탭 위치로 이동
		// \n : 줄 바꿈
		// \' : ' 따옴표
		// \" : " 쌍따옴표
		// \\ : 백슬래시 
		System.out.println("Apple\tOrange\tBanana");
		System.out.println("Apple\'");
		System.out.println("Apple\"");
		System.out.println("C:\\");
		System.out.println("\"Hello\"");
		System.out.println("\"pizza\", \"spagetti\", \"hamburger\"");

	}

}
