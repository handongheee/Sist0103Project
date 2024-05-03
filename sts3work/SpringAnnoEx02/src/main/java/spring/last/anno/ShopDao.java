package spring.last.anno;

import org.springframework.stereotype.Component;

@Component // bean에 등록
public class ShopDao implements ShopDaoInter {

	@Override
	public void insertShop(String sangpum, int price, String color) {
		// TODO Auto-generated method stub
		System.out.println("sangpum"+": "+price+": "+color);
	}

	@Override
	public void deleteShop(String num) {
		// TODO Auto-generated method stub
		System.out.println(num+"번 삭제!");
	}

	@Override
	public void selectShop(String sangpum, int price, String color) {
		// TODO Auto-generated method stub
		System.out.println("** 상품 관리 **");
		System.out.println("상품명: "+sangpum);
		System.out.println("가격: "+price);
		System.out.println("색상: "+color);
	}

}
