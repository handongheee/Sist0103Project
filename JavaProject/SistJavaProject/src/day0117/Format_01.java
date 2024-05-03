package day0117;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date(); // util
		System.out.println(date);
		
		// 날짜, 시간을 원하는 양식에 맞춰 출력하기
		// HH는 24시간 표시, MM월, mm분
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		System.out.println(sdf1.format(date)); // Date 선언 안했을 경우 출력에서 new로 출력 가능 - sdf1.format(new date)
		
		// a: 오전/오후, hh:12시간 표시
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		System.out.println(sdf2.format(date));
		
		// EEE:요일 짧게, EEEE:요일 길게
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		System.out.println(sdf4.format(date));
		
		// NumberFormat: 숫자를 문자열로 변환하여 출력(컴마나 소수점자리수 지정)
		int money = 4525435;
		double num = 54.3423;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(); // getCurrencyInstance(): 화폐단위와 컴마 제공
		System.out.println(nf1.format(money));
		
		NumberFormat nf2 = NumberFormat.getInstance(); // getInstance(): 컴마만 제공
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));
		
		
		

	}

}
