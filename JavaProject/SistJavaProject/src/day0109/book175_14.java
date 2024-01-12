package day0109;

import java.util.Scanner;

public class book175_14 {

	public static void main(String[] args) {

		//book_1();
		quiz_1();

	}

	public static void book_1() {
		int [] scores = {54, 76, 87};

		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("총합: "+sum);

		double avg = (double)sum/scores.length;

		System.out.println("평균: "+avg);

	}

	public static void quiz_1() {
		// 학생명과 점수 입력_몇 명인지 입력한 만큼 
		// 등수 구하기
		// 입력해준 데이터로 등수 출력하고 합계, 평균 구하기
		
		int inwon;
		String [] name;
		int [] score;
		int [] rank; // 등수
		
		int tot=0;
		double avg=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수를 입력하시오 ");
		inwon = Integer.parseInt(sc.nextLine());
		
		// 인원수만큼 배열로 할당
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		// 인원수만큼 데이터 입력
		for(int i=0; i<inwon; i++) {
			System.out.println(i+"번지 이름: ");
			name[i] = sc.nextLine();
			
			System.out.println(i+"번지 점수: ");
			score[i]=Integer.parseInt(sc.nextLine());
			
			// 총점
			tot+=score[i];
		}
		
		// 등수 구하기(다중 for)
		for(int i=0; i<inwon; i++) {
			rank[i]=1;
			
			for(int j=0; j<inwon; j++) {
				// 비교되는 대상이 점수가 더 높으면 i번지의 등수를 1증가
				if(score[i]<score[j]) {
					rank[i]++;
				}
			}
		}
		
		// 계산
		avg = (double)tot/inwon;
		
		// 출력
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("===========================");
		
		for(int i=0; i<inwon; i++) {
			System.out.println((i+1)+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		
		System.out.println("---------------------------");
		System.out.println("총점: "+tot);
		System.out.println("평균: "+avg);

	}

}