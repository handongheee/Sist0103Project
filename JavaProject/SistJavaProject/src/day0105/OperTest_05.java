package day0105;

public class OperTest_05 {

	public static void main(String[] args) {
		// 비교연산자(관계연산자) >, <, >=, <=, !=, ==
		// 논리연산자 &&(and), ||(or), !(not)
		
		int a = 5, b = 3, c = 5;
		
		// 결과 값은 true, false
		System.out.println(a>b); // true
		System.out.println(a==b); // false
		System.out.println(!(a==b)); // true
		System.out.println(a!=b); // true
		System.out.println(a>b && b>c); // false
		System.out.println(a>b || b>c);  // true
		
		boolean bool = false;
		
		System.out.println("a= "+bool); // false
		System.out.println("b= "+!bool); // true
		
		boolean bool2 = 5>3;
		
		System.out.println("c= "+bool2); // true
		System.out.println("d= "+!bool2); // false
		System.out.println("e= "+!(5>3)); // false

	}

}
