package day0109;

public class ArrInt_10 {

	public static void main(String[] args) {
		// 배열 선언과 동시에 초기값 지정할 수 있다.
		int [] arr = {1, 43, 54, 123, 65, 32, 22, 66};
		
		System.out.println("갯수: "+arr.length);
		
		System.out.println("출력1_for");
		for(int i=0; i<arr.length; i++) {		
			System.out.printf("%5d", arr[i]); //System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("출력2_for~each");
		for(int a:arr) {	
			System.out.printf("%5d", a); //System.out.print(a+" ");
		}

	}

}
