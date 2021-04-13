package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		t1.method3();
		t1.method2();
		t1.func1();
		t1.func3();
		TestBean2 t2 = ctx.getBean("obj2", TestBean2.class);
		t2.method4();
		System.out.println(t1.func4());
		ctx.close();
	}

}
