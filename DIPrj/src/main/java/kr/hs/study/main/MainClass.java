package kr.hs.study.main;

import javax.tools.JavaCompiler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUser;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		CarUser c1 = ctx.getBean("obj1",CarUser.class);
		System.out.println(c1.toString());
		ctx.close();
	}

}
