package kr.hs.study.beans;

public class TestBean {
	public TestBean() {
		System.out.println("TestBean의 기본 생성자");
	}
	public void testBean_init() {
		System.out.println("TestBean의 init메서드");
	}
	public void testBean_destroy() {
		System.out.println("TestBean의 destroy메서드");
	}
}
