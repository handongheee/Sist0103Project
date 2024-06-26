package day0115;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListEx_07 {

	public static void main(String[] args) {
		// 1. 순차적으로 데이터 들어간다
		// 2. 중복데이터도 허용
		// 3. 처음 생성 시 일정한 개수로 생성되는데 그 이상의 데이터를 넣으면 자동으로 공간이 늘어난다(가변)

		// List<String> list = new Vector<String>();
		Vector<String> list = new Vector<String>();

		// 생성자가 디폴트인 경우 기본할당크기 10
		System.out.println("초기 데이터 개수: "+list.size()); // 0
		System.out.println("초기 할당 크기: "+list.capacity()); // 10

		list.add("장미");
		list.add("장미");
		list.add("수국");
		list.add("프리지아");
		list.add("안개꽃");
		list.add("장미");
		list.add("장미");
		list.add("장미");
		list.add("수국");
		list.add("프리지아");
		list.add("안개꽃");
		list.add("장미");

		System.out.println("데이터 개수: "+list.size()); 
		System.out.println("할당 크기: "+list.capacity()); 

		System.out.println("출력_#01");
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.print(s+" ");
		}
		System.out.println();

		// for~each
		System.out.println("출력_#02");
		for(String s:list) {
			System.out.print(s+" ");
		}
		System.out.println();

		// iterator
		System.out.println("출력_#03");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();

		// ob toArray
		System.out.println("출력_#04");
		Object [] ob = list.toArray();
		for(int i=0; i<ob.length; i++) {
			String s = (String)ob[i];
			System.out.print(s+" ");
		}


	}

}
