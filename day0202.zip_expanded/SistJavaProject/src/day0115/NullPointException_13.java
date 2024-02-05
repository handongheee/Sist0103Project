package day0115;

import java.util.Date;

public class NullPointException_13 {

	Date date; // new Date 생성 안해서 생긴 오류
	
	public void write() {
		int y, m, d;
		
		try {
			// 오류가 발생할 법한 곳
			y=date.getYear()-1900;
			m=date.getMonth()+1;
			d=date.getDate();
			
			System.out.println(y+"년"+m+"월"+d+"일 입니다.");
		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println("객체 생성을 안했어요 "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointException_13 nullex = new NullPointException_13();
		nullex.write();
		System.out.println("프로그램 정상 종료");

	}

}
