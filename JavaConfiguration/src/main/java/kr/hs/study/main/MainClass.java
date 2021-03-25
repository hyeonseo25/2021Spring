package kr.hs.study.main;

import javax.tools.JavaCompiler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean2 t1 = ctx1.getBean("obj5", TestBean2.class);
		t1.pr();
		
		TestBean2 t4 = ctx1.getBean("obj6", TestBean2.class);
		System.out.println(t1);
		System.out.println(t4);
		
		ctx1.close();
		
		System.out.println("=================================");
		
		// 설정이 있는 자바 파일 등록
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean2 t2 = ctx2.getBean("obj2", TestBean2.class);
		t2.pr();

		TestBean2 t3 = ctx2.getBean("obj4", TestBean2.class);
		t3.pr();
		ctx2.close();
	}

}
