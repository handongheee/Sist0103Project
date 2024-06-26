package day0110;

public class ArraySortString_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] data = {"김민선", "강호동", "홍수아", "이승미", "한땡땡", "이효리"};
		
		System.out.println("** 정렬 전 출력 **");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		System.out.println("** 오름차순 출력 **");
		//System.out.println("a".compareTo("b")); -1 출력
		// 같으면 0, i>j 양수, i<j 음수 int 반환
		for(int i=0; i<data.length-1; i++) {
			for(int j=i+1; j<data.length; j++) {
				// 문자열 비교
				if(data[i].compareTo(data[j])>0) {
					String tmp = data[i];
					data[i]=data[j];
					data[j]=tmp;
				}
			}
		}
		
		// 출력
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
	}

}
