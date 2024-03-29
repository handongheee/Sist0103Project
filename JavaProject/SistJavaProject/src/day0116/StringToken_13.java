package day0116;

import java.util.StringTokenizer;

public class StringToken_13 {

	public static void main(String[] args) {
		// 문자열을 특정 기호로 분리하는 방법 split, StringTokenizer
		String str = "red, yellow, blue, gray, pink";
		
		System.out.println("String 객체의 split을 이용한 분리");
		String [] arrColors = str.split(",");
		
		System.out.println("총 "+arrColors.length+"개");
		
		for(int i=0; i<arrColors.length; i++) {
			System.out.print(arrColors[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("String 객체의 StringTokenizer을 이용한 분리");
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("총 토큰수: "+st.countTokens());
		
		// hasMoreTokens() 다음 토큰이 있으면 true, 없으면 false
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()); // 다음 토큰 얻기
		}
		
	}

}
