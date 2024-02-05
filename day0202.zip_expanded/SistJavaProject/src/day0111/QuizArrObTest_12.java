package day0111;

class MyInfo{
	private String name;
	private String mbti;
	private int age;
	
	public void setMyInfo(String name, String mbti, int age) {
		this.name=name;
		this.mbti=mbti;
		this.age=age;
	}
	
	public static void InfoTitle() {
		System.out.println("이름\tMBTI\t나이");
		System.out.println("======================");
	}

	public void showInfo() {
		System.out.println(name+"\t"+mbti+"\t"+age+"세");
	}
	
}

/////////////////////////
public class QuizArrObTest_12 {

	public static void main(String[] args) {
		MyInfo mi1 = new MyInfo();
		mi1.setMyInfo("이효리", "ESFJ", 26);
		
		MyInfo mi2 = new MyInfo();
		mi2.setMyInfo("홍길동", "INFP", 34);
		
		MyInfo mi3 = new MyInfo();
		mi3.setMyInfo("유재석", "ENTJ", 23);
				
		MyInfo.InfoTitle();
				
		mi1.showInfo();
		mi2.showInfo();
		mi3.showInfo();
	
//		MyInfo [] myInfo = {
//				new MyInfo("이효리", "ESFJ", 26),
//				new MyInfo("홍길동", "INFP", 34),
//				new MyInfo("유재석", "ENTJ", 23)
//		};
		
//		for(MyInfo info: myInfo) {
//			info.showInfo();
//		}

	}

}
