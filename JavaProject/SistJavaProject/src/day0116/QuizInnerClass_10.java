package day0116;

import java.util.Scanner;

class SawonOuter{

	private String sawonName;
	private int gibonPay, familySu, timeSu;
	
	public void process() {
		// 데이터 입력
		InputInner ii = new InputInner();
		SudangInner si = new SudangInner();
		
		// 결과 출력
		ii.inputData();
		si.writeSawonData();
	}

	class InputInner{
		public void inputData() {
			Scanner sc = new Scanner(System.in);

			System.out.println("사원명 입력: ");
			sawonName = sc.nextLine();

			System.out.println("기본급?");
			gibonPay = sc.nextInt();

			System.out.println("초과시간은?");
			timeSu = sc.nextInt();

			System.out.println("가족 수는?");
			familySu = sc.nextInt();
		}
	}

	class SudangInner{
		public int getTimeSudang() {
			return timeSu*30000;
		}

		public int getFamilySudang() {
			if(familySu<=4) {
				return 200000;
			} else {
				return 300000;
			}
		}
		
		public int getTax() {
			return (int)(gibonPay*0.03);
		}
		
		public int getTotalPay() {
			return gibonPay+getFamilySudang()+getTimeSudang()-getTax();
		}
		
		public void writeSawonData() {
			System.out.println("사원명\t기본급\t초과근무시간 가족수\t시간수당\t가족수당\t세금\t총급여");
			System.out.println(sawonName+"\t"+gibonPay+"\t"+timeSu+"\t"+familySu+"\t"+getTimeSudang()+"\t"+getFamilySudang()+"\t"+getTax()+"\t"+getTotalPay());	
		}

	}

}


/////////////////////////////
public class QuizInnerClass_10 {

	public static void main(String[] args) {
		SawonOuter so = new SawonOuter();
		
		// 방법01. 내부클래스를 외부클래스 통해서 생성 후 메서드 호출
//		SawonOuter.InputInner input = so.new InputInner();
//		input.inputData();
//		SawonOuter.SudangInner output = so.new SudangInner();
//		output.writeSawonData();
		
		// 방법02. 외부 클래스의 멤버에서 내부클래스의 멤버(process)를 호출 후 메인에서는 외부클래스 생성-외부메서드 호출
		so.process();

	}

}
