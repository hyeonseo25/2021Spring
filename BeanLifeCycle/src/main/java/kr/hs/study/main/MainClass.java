package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컨테이너의 config.xml파일을 읽어온다
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.println(t1);
		//t1.testBean_init();
		
		ctx.close();
	}

}
