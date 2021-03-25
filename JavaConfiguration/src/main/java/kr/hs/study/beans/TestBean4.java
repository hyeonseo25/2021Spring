package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean4 {
	
	private int data1;
	
	@Autowired // 변수를 선언할 때 DataBean 객체를 만들어서 넣어둔다.
	private DataBean4 data2;
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public DataBean4 getData2() {
		return data2;
	}
	public void setData2(DataBean4 data2) {
		this.data2 = data2;
	}
	public TestBean4() {
		super();
	}
	@Override
	public String toString() {
		return "TestBean4 [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
	
	
	
}
