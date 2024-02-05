package day0105;

import java.util.Scanner;

public class SwitchMonth_18 {

	public static void main(String[] args) {
		// 월을 입력받아 2월은 28,29일까지, 4,6,9,11 30일까지, 1,3,5,7,8,10,12 31일까지
		// 없는 달은 존재하지 않음
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.println("현재 월을 입력하세요");
		month = sc.nextInt();
		
		switch(month)
		{
		case 2:
			System.out.println("28 or 29일 까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 존재합니다.");
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일까지 존재합니다.");
			break;
		default: 
			System.out.println("존재하지 않는 달입니다.");
		
		}
		

	}

}
