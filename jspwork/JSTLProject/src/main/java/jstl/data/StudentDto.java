package jstl.data;

public class StudentDto {
	private String name;
	private String addr;
	private int score;
	
	// 명시적 생성자
	public StudentDto(String name, String addr, int score) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.addr=addr;
		this.score=score;
	}
	
	// 디폴트 생성자
	public StudentDto() {
		// TODO Auto-generated constructor stub
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
