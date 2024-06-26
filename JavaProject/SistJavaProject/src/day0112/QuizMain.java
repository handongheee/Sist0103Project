package day0112;

import java.util.Scanner;

class Quiz{
	private String Name;
	private int Java;
	private int Oracle;
	private int Html;
	
	public Quiz(String name, int java, int oracle, int html) {
		this.Name=name;
		this.Java=java;
		this.Oracle=oracle;
		this.Html=html;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getJava() {
		return Java;
	}

	public void setJava(int java) {
		Java = java;
	}

	public int getOracle() {
		return Oracle;
	}

	public void setOracle(int oracle) {
		Oracle = oracle;
	}

	public int getHtml() {
		return Html;
	}

	public void setHtml(int html) {
		Html = html;
	}
	
	
	public int getTotal() {
		int t = this.Java+this.Oracle+this.Html;
		return t;
	}
	
	public int getAverge() {
		int av = getTotal()/3;
		return av;
	}
	
	public String getPyungga() {
		int a = getAverge();
		
		if(a>=90) {
			return "장학생";
		} else if(a>=80) {
			return "합격";
		} else {
			return "불합격";
		}

	}
	
	public static void showTitle() {
		System.out.println("이름\tJAVA\tORACLE\tHTML\t총점\t평균\t평가");
		System.out.println("======================================================");	
	}
	
}

public class QuizMain {
	
	public static void writeQuiz(Quiz [] quiz){
		Quiz.showTitle();
		for(Quiz q: quiz) {
			System.out.println(q.getName()+"\t"+q.getJava()+"\t"+q.getOracle()+"\t"+q.getHtml()+"\t"+q.getTotal()+"\t"+q.getAverge()+"\t"+q.getPyungga());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Quiz [] quiz;
		
		int inwon;
		String schoolName;	
		
		System.out.print("학교명: ");
		schoolName = sc.nextLine();
		
		System.out.println("인원수를 입력하세요.");
		inwon = Integer.parseInt(sc.nextLine());
		
		quiz = new Quiz[inwon];
		
		for(int i=0; i<inwon; i++) {
			System.out.println("이름은? ");
			String name=sc.nextLine();
			
			System.out.println("Java 성적은? ");
			int java = Integer.parseInt(sc.nextLine());
			
			System.out.println("Oracle 성적은? ");
			int oracle = Integer.parseInt(sc.nextLine());
			
			System.out.println("Html 성적은? ");
			int html = Integer.parseInt(sc.nextLine());
			
			quiz[i] = new Quiz(name, java, oracle, html);
			
			System.out.println();
		}
		
		
		
		// 출력
		System.out.println("학교명: "+schoolName);
		writeQuiz(quiz);
		

	}

}
