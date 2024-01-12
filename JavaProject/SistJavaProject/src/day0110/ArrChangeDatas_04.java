package day0110;

public class ArrChangeDatas_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6, 2, 5, 1, 65, 32, 78, 234, 54, 11};

		System.out.println("** 원 데이터 **");

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		System.out.println("** 거꾸로 데이터 **");

		for(int i=0; i<arr.length/2; i++) { // 첨과 끝이 서로 교환하는 식이므로 /2해서 절반만 돌림
			int tmp=arr[i];
			arr[i]=arr[arr.length-1-i]; // 10개일 때 0하고 9번하고 바꾸는 것
			arr[arr.length-1-i]=tmp;
		}

		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		System.out.println("** 오름차순 정렬 **");
		// 가장 작은 숫자 앞으로 보내기(선택정렬)
		// Arrays.sort(arr); -> 배열 arr 정렬한다.

		// 기준 데이터는 0부터 끝에서 두번째까지
		for(int i=0; i<arr.length-1; i++) {
			
			// 비교하는 데이터는 기준 다음 값부터 끝까지
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}

		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}