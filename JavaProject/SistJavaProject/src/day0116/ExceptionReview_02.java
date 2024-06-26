package day0116;

public class ExceptionReview_02 {

	public static void process() {
		int [] arr = {1, 4, 65, 23};

		for(int i=0; i<=arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println("오류메세지 01: "+e.getMessage());
			}
		}
	}
	
	// exception은 부모격
	// throws: 던지다, throw: 오류 강제발생
	// exception 처리를 직접하지 않고 호출하는 곳으로 해당 exception을 던진다
	public static void process02() throws NumberFormatException {
		String a = "12a"; 
		String b = "30";
		int sum = 0;
		
		sum=Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println("두수의 합은 "+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		try {
			process02();
		} catch (NumberFormatException e) {
			System.out.println("예외처리를 메인에서 했어요 "+e.getMessage());
		}
		
		System.out.println("*** 정상 종료 ***");
		
	}

}
