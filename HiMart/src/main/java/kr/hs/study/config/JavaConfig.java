package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.SonySpeaker;

@Configuration
public class JavaConfig {
	@Bean
	public SamsungTV sTV(){
		SamsungTV s1 = new SamsungTV();
		s1.setName("SamsungTV");
		s1.setPrice(2000000);
		s1.setSpeaker(new SonySpeaker());
		return s1;
	}
	@Bean
	public LGTV lTV(){
		return new LGTV("LGTV", 3000000, new AppleSpeaker());
	}
}
