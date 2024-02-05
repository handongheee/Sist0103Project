package day0116;

import java.util.Scanner;

// 강제 예외 발생 throw
class UserException extends Exception {
	public UserException(String msg) {
		super(msg); // Exception 클래스 생성자 통해 정식 메시지로 등록
	}
}
////////////////////

public class ThrowException_03 {
	
	public static void process() throws UserException {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		// 나이가 10~59살이 아니면 UserException 강제발생
		System.out.println("나이를 입력해주세요. ");
		age = sc.nextInt();
		
		if(age<10 || age>=60) {
			throw new UserException("우리 모임의 나이는 10세부터 59세입니다.");
		} else {
			System.out.println("당신은 "+age+"세이므로 멤버로 등록이 가능합니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			process();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println("오류메세지: "+e.getMessage());
		}
		
		System.out.println("** 정상종료 **");

	}

}
