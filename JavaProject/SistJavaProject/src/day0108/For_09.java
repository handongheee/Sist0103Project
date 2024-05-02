package day0108;

public class For_09 {

	public static void main(String[] args) {
		// 가로로 1~10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
			
		// 가로로 10~1까지 출력
		for(int i=10; i>=1; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		// 5씩 증가
		for(int i=0; i<=50; i+=5) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		// continue
		for(int i=1; i<=20; i++) {
			// 5의 배수 제외하고 출력
			if(i%5==0) 
				continue; // i++ 로 이동, continue 아래 문장은 수행 안함
			System.out.print(i+" ");
			
		}
		
	}

}
