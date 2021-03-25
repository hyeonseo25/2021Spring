package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1",TestBean1.class);
		System.out.println(t1);
		TestBean1 t2 = ctx.getBean("obj2",TestBean1.class);
		System.out.println(t2);
		
		TestBean1 t4 = ctx.getBean("obj4",TestBean1.class);
		System.out.println("t4.d1 = " + t4.getD1());
		
		TestBean1 t5 = ctx.getBean("obj5",TestBean1.class);
		System.out.println("t5.d1 = " + t5.getD1());
		
		TestBean1 t6 = ctx.getBean("obj5",TestBean1.class);
		System.out.println("t6.d1 = " + t6.getD1());
		
		ctx.close();
	}

}
