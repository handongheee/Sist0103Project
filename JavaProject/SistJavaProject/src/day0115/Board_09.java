package day0115;

public class Board_09 {
	
	private String writer;
	private String subject;
	private String content;
	
	// 디폴트 생성자
	public Board_09() {
		// TODO Auto-generated constructor stub
	}
	
	// 명시적 생성자
	public Board_09(String writer, String subject, String content) {
		// TODO Auto-generated constructor stub
		this.writer=writer;
		this.subject=subject;
		this.content=content;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	

}
