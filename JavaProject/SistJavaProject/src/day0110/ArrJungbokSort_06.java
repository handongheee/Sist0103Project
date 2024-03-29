package day0110;

import java.util.Arrays;

public class ArrJungbokSort_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lotto = new int[6];
		
		// 임의의 수를 로또라는 변수에 발생시켜 넣어준다.
		for(int i=0; i<lotto.length; i++) { 
			// 1~45 까지의 랜덤 수 발생
			lotto[i] = (int)(Math.random()*45)+1;
			
			// 중복 처리
			for(int j=0; j<i; j++) { // j가 i보다 작은 이유는 2/01, 3/012, 4/0123
				if(lotto[i]==lotto[j]) {
					i--;
					break; // 현재의 반복문 빠져나가기 i++로 이동
				}
			}
		}
		
		// 오름차순 정렬
		// Arrays.sort(lotto);
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;		
				}				
			}
		}
		
		// 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%5d", lotto[i]);
		}
		

	}

}
