package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LgTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.TV;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컨테이너의 config.xml파일을 읽어온다
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TV t1 = ctx.getBean("samsungTV",SamsungTV.class);
		TV t2 = ctx.getBean("lgTV",LgTV.class);
		
		t1.volumeUp();
		t1.powerOn();
		t1.toString();
		
		t2.volumeDown();
		t2.powerOff();
		t2.toString();
		
		ctx.close();
	}

}
