package day0111;

import java.util.Scanner;

/* 연습
 * 회사이름
 * 쌍용
 * 총사원수 입력
 * 2
 * 사원명
 * 손흥민
 * 월급여
 * 2500000
 * 월수당
 * 500000(일괄)
 * 
 * ['쌍용'_1월 급여내역] > final
 * 사원명 기본급 수당 실수령액(메서드) 
 * ======================
 * 손흥민 250- 50- 270- (세금10퍼)
 * 황희찬 150- 50- 180-
 * 
 */

class Sawon{
	private String coName; // 회사이름
	private int saCnt; // 사원수
	private String name; // 사원명
	private int mPay; // 월급여
	private int mMoney; // 월수당
	
	public static final String COMNAME="쌍용";

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public int getSaCnt() {
		return saCnt;
	}

	public void setSaCnt(int saCnt) {
		this.saCnt = saCnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getmPay() {
		return mPay;
	}

	public void setmPay(int mPay) {
		this.mPay = mPay;
	}

	public int getmMoney() {
		return mMoney;
	}

	public void setmMoney(int mMoney) {
		this.mMoney = mMoney;
	}

	public static String getComname() {
		return COMNAME;
	}

	// 실수령액
	public double settotMoney() {
		double n=(this.mPay+this.mMoney)*0.9;
		return n;
	}
	
	public static void showTitle() {
		System.out.println(Sawon.COMNAME+" 1월 급여 내역");
		System.out.println("사원명\t기본급\t수당\t실수령액");
		System.out.println("====================================");
	}
	
	
}

public class QuizEmpSawon_16 {
	public static void writeSawon(Sawon [] sawon) {
		Sawon.showTitle();
		for(Sawon s: sawon) {
			System.out.println(s.getName()+"\t"+s.getmPay()+"\t"+s.getmMoney()+"\t"+s.settotMoney());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
	}

}
