package spring.di.ex03;

public class Sawon {
	SawonData data;
	
	public Sawon(SawonData data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}
	
	public void writeData() {
		System.out.println("�����: "+data.getSawonname());
		System.out.println("�޿�: "+data.getPay());
		System.out.println("�Ի���: "+data.getIpsaday());
	}
}