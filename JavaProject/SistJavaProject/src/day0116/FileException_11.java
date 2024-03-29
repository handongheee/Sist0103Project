package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// BufferReader: 버퍼를 사용해서 파일 읽기
// FileReader: 경로에 있는 파일 로드 -> 반드시 exception 발생
public class FileException_11 {

	public static void read() {
		String fileName="C:\\sist0103\\file\\memo.txt";

		// 선언
		BufferedReader br = null;
		FileReader fr = null; // 문자단위

		// 생성 (읽기위해서 파일 열기)
		try {
			fr = new FileReader(fileName);
			System.out.println("파일을 열었어요");

			br = new BufferedReader(fr);

			// 여러 줄을 읽어야함으로 while문 읽는다
			while(true) {
				String s = br.readLine();

				// 마지막줄일 경우 null값을 읽는다, null 값일 경우 while문 종료
				if(s==null) {
					break;
				}
				System.out.println(s);				
			} 


			// 멀티 catch
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 없어요 "+e.getMessage());
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				br.close(); // 생성한 반대 순으로 받아준다. 자원반납은 try catch 별개
				fr.close();

				System.out.println("파일에 대한 자원을 모두 닫았어요!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();

		System.out.println("** 정상종료 **");

	}

}
