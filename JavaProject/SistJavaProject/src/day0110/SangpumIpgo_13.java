package day0110;

class Ipgo{
	private String sangName;
	private int price;
	
	// set 메서드
	public void setName(String sangName) {
		this.sangName = sangName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// get 메서드
	public String getName() {
		return sangName;
	}
	
	public int getPrice() {
		return price;
	}
	
}

///////////////////////////////////////
public class SangpumIpgo_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipgo ip1 = new Ipgo();
		Ipgo ip2 = new Ipgo();
		
		ip1.setName("사과");
		ip1.setPrice(2500);
		
		ip2.setName("오렌지");
		ip2.setPrice(4400);
		
		String name1 = ip1.getName();
		int price1 = ip1.getPrice();
		
		String name2 = ip2.getName();
		int price2 = ip2.getPrice();
		
		System.out.println(name1+", "+price1);
		System.out.println(name2+", "+price2);
		
		

	}

}
