package day0108;

public class For_07 {
	public static void main(String[] args) {
		// while문과 for문 비교
		System.out.println("*** while문으로 10~0 출력 ***");
		int i=10;

		while(i>=0) {
			System.out.print(i--+" ");
		}
		System.out.println();

		System.out.println("*** for문으로 10~0 출력 ***");
		for(int a=10; a>=0; a--) {
			System.out.print(a+" ");
		}
		System.out.println();

		System.out.println("*** for문 1~10 종료 ***");
		for(int a=1; a<=10; a++) 
			System.out.print(a+" ");
		System.out.println("종료");
		
		System.out.println("*** while문 1~10 종료 ***");
		int n=1;
		while(true) {
			System.out.print(n++ +" ");
			if(n>10)
				break;
		}
		System.out.println("종료");
		
		System.out.println("*** for문 1, 4, 7, 10 ***");
		for(int b=1; b<=10; b+=3) {
			System.out.print(b+" ");
		}
		System.out.println(" ");
		
		System.out.println("*** for문 5, 4, 3, 2, 1 ***");
		for(int x=5; x>=1; x--) {
			System.out.print(x+" ");
		}
		System.out.println(" ");
	
		System.out.println("*** while 문 5, 4, 3, 2, 1 ***");
		int y=5;
		while(y>0) {
			System.out.print(y-- +" ");
		}
		System.out.println(" ");
		
		System.out.println("*** for 문 helloJava 반복 ***");
		int s;
		for(s=1; s<=5; s++) {
			System.out.println(s+" helloJava");
		}
	}

}
