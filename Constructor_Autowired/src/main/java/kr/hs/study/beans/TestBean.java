package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean {
	private DataBean data3;
	private DataBean data4;
	
	
	public TestBean() {
	}
	@Autowired
	public TestBean(DataBean data3, DataBean data4) {
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public DataBean getData3() {
		return data3;
	}
	public void setData3(DataBean data3) {
		this.data3 = data3;
	}
	
	public DataBean getData4() {
		return data4;
	}
	public void setData4(DataBean data4) {
		this.data4 = data4;
	}
	
}