package day0111;

import java.util.Scanner;

class Emp{
	private String sName;
	private int gPay; // 기본급
	private int fSu; // 가족 수
	private int tSu; // 오버타임 수

	// +(0112) 명시적 생성자
	public Emp(String name, int pay, int fs, int ts) {
		this.sName=name;
		this.gPay=pay;
		this.fSu=fs;
		this.tSu=ts;
	}
	
	
	public String getsName() {
		return sName;
	}
	public void setName(String sName) {
		this.sName = sName;
	}
	public int getgPay() {
		return gPay;
	}
	public void setgPay(int gPay) {
		this.gPay = gPay;
	}
	public int getfSu() {
		return fSu;
	}
	public void setfSu(int fSu) {
		this.fSu = fSu;
	}
	public int gettSu() {
		return tSu;
	}
	public void settSu(int tSu) {
		this.tSu = tSu;
	}

	// 가족수당
	public int getFamilySudang() {
		int n=0;

		if(fSu>=2) {
			n=100000;
		} else {
			n=fSu*50000;
		}

		return n;
	}

	// 시간수당
	public int getTimeSudang() {
		int n=0;
		if(tSu>=10) {
			n=300000;
		} else {
			n=tSu*3000;
		}

		return n;
	}

	// 총급여
	public int getTotalPay() {
		int n=gPay+this.getFamilySudang()+this.getTimeSudang();
		return n;
	}

	// 제목
	public static void showTitle() {
		System.out.println("** 쌍용 01월 직원 급여 현황 **");
		System.out.println();
		System.out.println("사원명\t기본급\t자녀수\t초과근무시간\t가족수당\t시간수당\t총급여");
		System.out.println("================================================");

	}	
}


public class SawonInstanceScanner_15 {

	public static void writeEmp(Emp[] emp) {
		// 제목부터 출력
		Emp.showTitle(); // static이므로 Emp.~
		for(Emp e: emp) {
			System.out.println(e.getsName()+"\t"+e.getgPay()+"\t"+e.getfSu()+"\t"+e.gettSu()+"\t"+e.getFamilySudang()+"\t"+e.getTimeSudang()+"\t"+e.getTotalPay());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int inwon;
		Emp [] emp;

		System.out.println("입력할 직원 수는?");
		inwon = Integer.parseInt(sc.nextLine());

		// 배열 할당
		emp = new Emp[inwon];

		// 인원수만큼 데이터를 입력
		for(int i=0; i<inwon; i++) {
			// emp[i] = new Emp(); // 디폴트 생성자 호출 +(0112) 명시적 생성자 만들면 오류남

			System.out.println("이름");
			String name = sc.nextLine();

			System.out.println("기본급?");
			int pay = Integer.parseInt(sc.nextLine());

			System.out.println("자녀수 입력");
			int fs = Integer.parseInt(sc.nextLine());

			System.out.println("초과근무 시간?");
			int ts=Integer.parseInt(sc.nextLine());
			
			// +(0112) 명시적 만들어서 한번에 setter
			emp[i] = new Emp(name, pay, fs, ts); 

			// +(0112) 명시적 만들어서 필요 없어짐 그치만 두 방법 다 할 줄 알아야 함
			// setter로 emp 클래스에 데이터 넣기(수정/초기화) 
//			emp[i].setName(name);
//			emp[i].setgPay(pay);
//			emp[i].setfSu(fs);
//			emp[i].settSu(ts);

			System.out.println();

		}

		// 출력
		writeEmp(emp);
	}

}
