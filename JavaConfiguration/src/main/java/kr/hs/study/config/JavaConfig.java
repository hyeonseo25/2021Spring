package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean2;

@Configuration
public class JavaConfig {
	// <bean id="obj1" class="kr.hs.study.TestBean1">
	@Bean(name="obj2")
	public TestBean2 java1() {
		TestBean2 t1 = new TestBean2();
		return t1;
	}
	
	@Bean
	@Lazy
	public TestBean2 obj3() {
		return new TestBean2();
	}
	
	@Bean(initMethod = "init")
	@Scope("prototype")
	public TestBean2 obj4() {
		return new TestBean2();
	}
}
