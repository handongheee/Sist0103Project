package day0111;

class Artist{
	
	// 변수명
	private String group;
	private String song;
		
	static String company;
	static int cnt=0;
	
	// 명시적 생성자
	public void setArtist(String group, String song) {
		this.group=group;
		this.song=song;
	}
	
	// 출력메서드 한번에 만들기
	public void InfoArtist() {
		cnt++;
		System.out.println("**아티스트 정보_"+cnt+"**");
		System.out.println("소속 기획사: "+Artist.company);
		System.out.println("그룹명: "+group);
		System.out.println("대표곡: "+song);
		System.out.println("----------------------");		
	}
}

///////////////////////////////////
public class QuizInstance_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist.company="하이브";
		
		Artist art1 = new Artist();	
		// Artist art1 = new Artist("bts", "버터");
		art1.setArtist("bts", "버터");	
		art1.InfoArtist();
		
		Artist art2 = new Artist();	
		art2.setArtist("뉴진스", "어텐션");
		art2.InfoArtist();

	}

}