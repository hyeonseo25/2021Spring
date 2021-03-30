package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;

@Configuration
public class JavaConfig {
	@Bean
	public TestBean1 java1() {
		/*TestBean1 t1 = new TestBean1();
		t1.setData1(11);
		t1.setData2(11.11);
		t1.setData3(new DataBean1());
		return t1;*/
		
		return new TestBean1(new DataBean1(),new DataBean1());
	}
	
//	@Bean(name="obj1")
//	public DataBean1 d1() {
//		return new DataBean1();
//	}
	
}
