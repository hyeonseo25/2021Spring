package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.config.JavaConfig;
public class TVUser {

	public static void main(String[] args) {
		/* xml 설정 */
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		SamsungTV t1 = ctx1.getBean("sTV",SamsungTV.class);
		System.out.println(t1);
		t1.powerOff();
		t1.powerON();
		t1.getSpeaker().volumeUp();
		t1.getSpeaker().VolumeDown();
		
		LGTV t2 = ctx1.getBean("lTV",LGTV.class);
		System.out.println(t2);
		t2.powerOff();
		t2.powerON();
		t2.getSpeaker().volumeUp();
		t2.getSpeaker().VolumeDown();
		
		ctx1.close();
		
		System.out.println("===================================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		SamsungTV t3 = ctx2.getBean("sTV",SamsungTV.class);
		System.out.println(t3);
		t3.powerOff();
		t3.powerON();
		t3.getSpeaker().volumeUp();
		t3.getSpeaker().VolumeDown();
		
		LGTV t4 = ctx2.getBean("lTV",LGTV.class);
		System.out.println(t4);
		t4.powerOff();
		t4.powerON();
		t4.getSpeaker().volumeUp();
		t4.getSpeaker().VolumeDown();
		ctx2.close();
	}
}
