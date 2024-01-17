package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizFileException_15 {

	public static void fileRead() {
		String fName = "C:\\sist0103\\file\\fruitshop.txt";
		FileReader fr = null; // 메서드는 자동초기화가 안돼서 null 넣어줌
		BufferedReader br = null;
		int cnt=0;
		int tot=0;

		try {
			fr = new FileReader(fName);
			br = new BufferedReader(fr);

			System.out.println("** 과일 입고 목록 **");
			System.out.println("번호\t과일명\t수량\t단가\t총금액");
			System.out.println("-----------------------------------------");

			while(true) {
				String s = br.readLine();
				cnt++;

				if(s==null) {
					break;
				}
				
				// 분리방법 01 StringTokenizer
				StringTokenizer st = new StringTokenizer(s, ",");
				// 배열의 갯수만큼 반복해서 출력
				String sang = st.nextToken();
				int su=Integer.parseInt(st.nextToken().trim()); // trim 공백제거
				int dan=Integer.parseInt(st.nextToken().trim());
				int total=su*dan;
				
				System.out.println(cnt+"\t"+sang+"\t"+su+"\t"+dan+"\t"+total);

				// 분리방법 02 split
//				String [] data = s.split(",");				
//				tot = Integer.parseInt(data[1])*Integer.parseInt(data[2]);
//				System.out.println(cnt+"\t"+data[0]+"\t"+data[1]+"\t"+data[2]+"\t"+tot+"원");
							
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileRead();
	}

}