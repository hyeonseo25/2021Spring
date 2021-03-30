package kr.hs.study.beans;

public class DataBean1 {
	private int a;
	private int b;
	
	public DataBean1() {
		
	}
	
	public DataBean1(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void prData() {
		System.out.println("a : " + a);
		System.out.println("b : " +b);
	}
}
