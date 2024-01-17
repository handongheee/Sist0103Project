package day0115;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet: 순서를 유지하지 않는 데이터 집합, 중복 허용 안 됨
// 구현클래스, 인덱스가 없음
// Set 인터페이스를 구현하려면 HashSet(생성) 사용
// <E> 제네릭: 타입을 명시하면 그 이외 타입을 넣으면 오류
public class HashSet_04 {

	public static void main(String[] args) {
		// 컬렉션은 가변적으로 배열의 고정형을 보완해준다.
		
		Set<String> set1 = new HashSet<String>();
		// set1안에 String만을 남겠다_Set은 인터페이스이므로 생성이 불가 그걸 구현한 클래스인 HashSet으로 생성

		set1.add("사과");
		set1.add("오렌지");
		set1.add("배");
		set1.add("사과"); // 갯수에 포함 안 됨(중복허용이 안돼서)
		set1.add("키위");
		set1.add("바나나");
		
		System.out.println("데이터의 갯수: "+set1.size());  // length 대신 size
		
		System.out.println("출력_#01");
		for(String s: set1) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("출력_#02");
		Iterator<String > iter = set1.iterator();
		
		//hasNext() 데이터가 더 이상 없으면 false 반환, 데이터가 없을 때까지 출력
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s); // 다음으로 이동함과 동시 데이터 반환
		}
		System.out.println();
		
		System.out.println("출력_#03");
		Object [] ob = set1.toArray();
		for(int i=0; i<ob.length; i++) { // 인덱스가 필요할 경우 for
			System.out.println(ob[i]);
		}
		
		// 모든 데이터 삭제
		set1.clear();
		
		// 확인
		if(set1.isEmpty()) {
			System.out.println("Set 타입 안에 데이터가 없다");
		} else {
			System.out.println("Set 타입 안에 데이터가 있다");
		}
		
		
		
	}

}