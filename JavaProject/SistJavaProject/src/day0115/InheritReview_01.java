package day0115;

interface InterAA{
	// 추상메서드, 상수
	public void paly();
}
//////////////////////////

interface InterBB{
	public void draw();
}
//////////////////////////

class InterImple_01 implements InterAA, InterBB{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("나는 그림을 그린다");
	}

	@Override
	public void paly() {
		// TODO Auto-generated method stub
		System.out.println("나는 게임을 한다");
	}
}

/////////////////////////////
public class InheritReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterImple_01 imp1 = new InterImple_01();
		imp1.draw();
		imp1.paly();
		
		// 다형성(부모가 하나, 자식이 셋~ 일때 사용)
		System.out.println("**다형성으로 출력**");
		InterAA aa = new InterImple_01();
		aa.paly();
		
		InterBB bb = new InterImple_01();
		bb.draw();

	}

}
