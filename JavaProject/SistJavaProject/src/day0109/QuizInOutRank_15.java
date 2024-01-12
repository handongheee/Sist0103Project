package day0109;

public class QuizInOutRank_15 {

	public static void main(String[] args) {
		/*
		 * 각 학생들의 점수에 대한 총점 평균 등수를 구하여 출력하세요
		 * 
		 * 번호 이름 국어 영어 수학 총점 평균 등수
		 * =============================
		 */
		
		String [] name= {"가나다","김김김","이이이","박박박","한한한"};
		int [] kor = {54, 24, 76, 88, 56};
		int [] eng = {100, 43, 77, 92, 35};
		int [] mat = {43, 100, 99, 85, 100};
		int [] tot = new int[5];
		double [] avg = new double[5];
		int [] rank = new int[5];
		
				
		// 1. 총점 평균 (배열만큼)
		for(int i=0; i<name.length; i++) {
			tot[i] = (kor[i]+eng[i]+mat[i])	;
			avg[i] = tot[i]/3;
		}
		
		// 2. 등수
		for(int i=0; i<name.length; i++) {
			rank[i]=1;
			
			for(int j=0; j<name.length; j++) {
				if(avg[i]<avg[j]) {
					rank[i]++;
				}
			}
		}
		
		// 3. 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===========================================================");
		
		for(int i=0; i<name.length; i++) {
			System.out.println((i+1)+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]);
			
		}	

	}

}