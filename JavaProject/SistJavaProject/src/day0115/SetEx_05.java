package day0115;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(5);
		set1.add(54);
		set1.add(65);
		set1.add(233);
		set1.add(25);
		
		System.out.println("개수: "+set1.size());
		
		System.out.println("출력_#01");
		for(int n: set1) {
			System.out.printf("%5d", n);
		}
		System.out.println();
		
		// Iterator
		System.out.println("출력_#02");
		Iterator<Integer> iter = set1.iterator();	
		while(iter.hasNext()) { // false 반환까지
			System.out.printf("%5d", iter.next());
		}
		System.out.println();
		
		// 배열형태
		System.out.println("출력_#03");
		Object [] ob = set1.toArray();
		for(int i=0; i<ob.length; i++) {
			System.out.printf("%5d", ob[i]);
		}

	}

}
