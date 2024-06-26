package day0116;

abstract class AbstObj{
	abstract public void dataIn();
	abstract public void dataOut();
}
////////////////////////

class SubAbst extends AbstObj{

	@Override
	public void dataIn() {
		// TODO Auto-generated method stub
		System.out.println("상속_데이터 입력");
	}

	@Override
	public void dataOut() {
		// TODO Auto-generated method stub
		System.out.println("상속_데이터 출력");
	}
}

public class Anonymous_09 {
	
	// 익명 내부클래스
	AbstObj ab1 = new AbstObj() {
		
		@Override
		public void dataOut() {
			// TODO Auto-generated method stub
			System.out.println("익명내부클래스_데이터 출력");
			
		}
		
		@Override
		public void dataIn() {
			// TODO Auto-generated method stub
			System.out.println("익명내부클래스_데이터 입력");
		}
	};
	
	//SubAbst sub = new SubAbst();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 익명 내부클래스
		Anonymous_09 ano = new Anonymous_09();
		ano.ab1.dataIn();
		ano.ab1.dataOut();
		
		// 상속
		SubAbst sub = new SubAbst();
		sub.dataIn();
		sub.dataOut();
		
		//ano.sub.dataIn();
		//ano.sub.dataOut();
	}

}
