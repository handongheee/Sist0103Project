package day0109;

public class StringEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 객체에 대한 멤버 메서드 익혀보기");
		
		String str1 = "apple";
		String str2 = "Apple";
		String str3 = "Have a nice day";
		String str4 = "   Today now    ";
		
		System.out.println("str3의 길이: "+str3.length());
		System.out.println("str4의 길이: "+str4.length());
		
		// trim(): 앞뒤 공백만 제거, 가운데 공백은 불가
		System.out.println("앞뒤 공백 제거 후 str4의 길이: "+str4.trim().length());
		System.out.println("*"+str4+"*");
		System.out.println("*"+str4.trim()+"*");
		
		// charAt(): 문자 추출
		System.out.println("str3에서 0번 문자: "+str3.charAt(0));
		System.out.println("str3에서 7번 문자: "+str3.charAt(7));
		
		// indexOf(): 인덱스 추출
		System.out.println("str3의 H의 인덱스: "+str3.indexOf("H"));
		System.out.println("str3의 n의 인덱스: "+str3.indexOf("n"));
		
		// substring(): 문자열 추출
		System.out.println("str3에서 Have 추출: "+str3.substring(0, 4)); // index 시작번호, 끝번호+1
		System.out.println("str3에서 nice 추출: "+str3.substring(7, 11)); 
		System.out.println("str3에서 nice day 추출: "+str3.substring(7)); // index 번호부터 끝까지
		
		// equals 똑같으면 true, 아니면 false 반환
		System.out.println("문자열 비교 (equal): "+str1.equals(str2));
		// equalsIgnoreCase 대소문자 구분x
		System.out.println("문자열 비교 (ignore): "+str1.equalsIgnoreCase(str2));
		
		// a.compareTo(b): a와 b가 같으면 0
		// a가 작으면 -값(알파벳 차이만큼 마이너스값)
		// a가 크면 +값
		System.out.println(str1.compareTo(str2)); // ascii 97-65
		System.out.println(str1.compareTo(str1)); 
		System.out.println("computer".compareTo("command")); // p와 m 비교
		
		
	}

}