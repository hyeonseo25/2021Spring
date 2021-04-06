package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;
import kr.hs.study.config.JavaConfig;
public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		// TestBean1 가지고 와서 주소값 출력
		TestBean2 t2 = ctx1.getBean(TestBean2.class);
		System.out.println("t2:" + t2);
		
		TestBean3 t4 = ctx1.getBean(TestBean3.class);
		System.out.println("t4:" + t4);
		TestBean3 t5 = ctx1.getBean(TestBean3.class);
		System.out.println("t5:" + t5);
		
		System.out.println("===================================================");
		
		TestBean4 t6 = ctx1.getBean(TestBean4.class);
		System.out.println(t6.getData3()+" "+t6.getData4());
		
		System.out.println("===================================================");
		
		TestBean5 t7 = ctx1.getBean(TestBean5.class);
		System.out.println(t7.getA()+" "+t7.getB()+" "+t7.getC()+" "+t7.getD());
		
		System.out.println("===================================================");
		
		TestBean5 t8 = ctx1.getBean("testBean5", TestBean5.class);
		System.out.println(t8.getA()+" "+t8.getB()+" "+t8.getC()+" "+t8.getD());
		
		ctx1.close();
		
		System.out.println("===================================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
//		TestBean2 t3 = ctx2.getBean(TestBean2.class);
//		System.out.println("t3:" + t3);
		TestBean5 t9 = ctx2.getBean("java1", TestBean5.class);
		System.out.println(t9.getA()+" "+t9.getB()+" "+t9.getC()+" "+t9.getD());
		ctx2.close();
	}
}
