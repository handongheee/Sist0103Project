package day0108;

public class SumTest_11 {

	public static void main(String[] args) {
		// 반복문 안에서 합계 구하기
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			// sum=sum+i;
			sum+=i; // 누적산
		}
		System.out.println("[for] 1~10까지의 합은 "+sum+"입니다.");
		
		// while
		int n=1;
		int tot=0;
		
		while(n<=10) {
			tot+=n; // 합계변수 tot에 n을 누적시킨다. tot=tot+n
			n++;
		}
		System.out.println("[while] 1~10까지의 합은 "+tot+"입니다.");
		
		System.out.println("for문으로 1~10까지 2씩 증가할 경우 합계");
		int total=0;
		
		for(int a=1; a<=10; a+=2) {
			total+=a;
		}
		System.out.println("1~10까지 2씩 증가할 경우 합은 "+total+"입니다.");
		
	}

}
