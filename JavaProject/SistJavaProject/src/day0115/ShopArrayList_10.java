package day0115;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


class Shop {
	private String sangName;
	private int su;
	private int dan;

	public Shop() {
		// TODO Auto-generated constructor stub
	}

	public Shop(String sangName, int su, int dan) {
		// TODO Auto-generated constructor stub
		this.sangName=sangName;
		this.su=su;
		this.dan=dan;
	}

	public String getSangName() {
		return sangName;
	}

	public void setSangName(String sangName) {
		this.sangName = sangName;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	// 총액
	public int getTot() {
		int s = this.su*this.dan;
		return s;
	}

}


public class ShopArrayList_10 {

	List<Shop> list = new ArrayList<Shop>(); // 선언

	public void Ipgo() {
		Scanner sc = new Scanner(System.in);
		String sangName;
		int su, dan;

		System.out.println("상품명?");
		sangName = sc.nextLine();

		System.out.println("가격");
		su = Integer.parseInt(sc.nextLine());

		System.out.println("수량");
		dan = Integer.parseInt(sc.nextLine());

		Shop shop = new Shop(sangName, su, dan);
		// 디폴트 생성자일 경우
		//shop.setSangName(sangName);
		//shop.setSu(su);
		//shop.setDan(dan);

		list.add(shop);

		System.out.println(list.size()+"개의 상품을 입고했어요!!");
		System.out.println();

	}

	public void Jego() {
		System.out.println("** 상품 재고 현황 **");
		System.out.println("No.\t상품명\t가격\t수량\t총액");
		System.out.println("-----------------------------------------");
		for(int i=0; i<list.size(); i++) {
			Shop s = list.get(i);
			System.out.println((i+1)+"\t"+s.getSangName()+"\t"+s.getSu()+"\t"+s.getDan()+"\t"+s.getTot());		

		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopArrayList_10 sa = new ShopArrayList_10();
		Scanner sc = new Scanner(System.in);

		int n;

		while(true) {
			System.out.println("1.상품입고  2.상품재고  9.종료");
			n=Integer.parseInt(sc.nextLine());

			if(n==1) {
				sa.Ipgo();
			} else if(n==2) {
				sa.Jego();
				System.out.println();
			} else if(n==9) {
				System.out.println("종료");
				break;
			}
		}


	}

}
