package day0109;

public class ArraysString_09 {

	public static void main(String[] args) {
		// 배열 선언
		String [] str;
		str = new String[4];
		
		// 초기화
		str[0] = "김가나";
		str[1] = "이가나";
		str[2] = "박가나";
		str[3] = "정가나";
		
		// 출력
		System.out.println("출력1_for문");
		for(int i=0; i<str.length; i++) {
			System.out.println(i+": "+str[i]);
		}
		System.out.println();
		
		System.out.println("출력2_for~each문");
		for(String s:str) {
			System.out.println(s);
		}
				

	}

}
