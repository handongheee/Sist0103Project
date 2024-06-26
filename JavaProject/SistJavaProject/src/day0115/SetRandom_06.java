package day0115;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetRandom_06 {

	public static void main(String[] args) {
		// Set, Random 이용해서 1~45의 서로 다른 난수 6개
		Random r = new Random();
		Set<Integer> set = new HashSet<Integer>();
		
		while(true) {
			int n = r.nextInt(45)+1;
			set.add(n); // 랜덤값 담기
			
			if(set.size()==6) {
				break;
			}
		}
		
		// 출력
		System.out.println("출력_#01");
		for(int n: set) {
			System.out.printf("%5d", n);
		}
		System.out.println();
		
		System.out.println("출력_#02");
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			System.out.printf("%5d", i.next());
		}
		System.out.println();
	
		System.out.println("출력_#03");
		Object [] ob = set.toArray();
		Arrays.sort(ob); // 배열값 오름차순
		for(int a=0; a<ob.length; a++) {
			System.out.printf("%5d", ob[a]);
		}
		
		
	}

}
