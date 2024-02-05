package day0115;

import java.io.IOException;
import java.io.InputStream;

// Stream: 바이트 단위로 처리(원시데이터)
// writer, reader: 대부분 문자단위로 처리
// BufferReader: 해당 클래스는 스트림으로부터 데이터르르 읽어올 때 한줄 씩 읽을 수 있는 readline() 
// BufferWriter: flush() 메서드를 호출해서 버퍼의 내용을 전송하는 작업이 추가로 필요함


public class IOExcep_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = System.in; // 콘솔에서 입력받기 위한 노드스트림
		int a=0;
		
		System.out.println("한글자 입력");
		try {
			a=is.read(); // 1바이트 읽는것, 리턴값은 아스키코드..한글 못 읽음(1바이트이므로 한글은 2바이트)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("오류: "+e.getMessage());
		}
		
		System.out.println("*** 3초 뒤에 출력합니다. ***");
		
		try {
			Thread.sleep(3000); // 3초, Thread는 try~catch 필수
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("입력값: "+(char)a); // 그냥 a는 아스키코드로 나옴
		
		
	}

}
