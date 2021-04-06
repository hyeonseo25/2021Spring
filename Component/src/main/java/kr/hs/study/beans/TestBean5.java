package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean5 {
	private int a;
	private double b;
	private DataBean4 c;
	private DataBean5 d;
	
	
	public TestBean5() {
	}
	public TestBean5(DataBean4 c, DataBean5 d) {
		this.c = c;
		this.d = d;
	}
	@Autowired
	public TestBean5(@Value("100")int a, @Value("33.33")double b, DataBean4 c, DataBean5 d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public DataBean4 getC() {
		return c;
	}
	public void setC(DataBean4 c) {
		this.c = c;
	}
	public DataBean5 getD() {
		return d;
	}
	public void setD(DataBean5 d) {
		this.d = d;
	}
}
