package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriter_03 {
	
	public static void fileWrite() {
		FileWriter fw = null; // 선언
		String fileName="C:\\sist0103\\file\\test1.txt";
		
		try {
			fw = new FileWriter(fileName); // 파일 새로 생성(중복파일이 있어도 새로 생성)
			// 파일에 내용 추가하기
			fw.write("Have a nice day~!!~\n"); // \n 메모장에 줄 넘기기
			fw.write("오늘은 수요일\n");
			fw.write(new Date().toString()); // 문자열에 날짜가 들어가서 오류 발생 -> toString()으로 문자열화
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	// 추가모드
	public static void fileWrite2() {
		FileWriter fw = null;
		String fileName = "C:\\sist0103\\file\\test1.txt";
		
		try {
			fw = new FileWriter(fileName, true); // 추가모드 true
			fw.write("내이름은 한동희\n");
			fw.write("------------------");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileWrite();
		fileWrite2();
	}

}