package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

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
	
	@Bean
	public TestBean3 obj5() {
		TestBean3 t3 = new TestBean3(300, "spring3", new DataBean3());
		return t3;
	}
	
	@Bean
	public TestBean3 obj6() {
		TestBean3 t4 = new TestBean3();
		t4.setA(400);
		t4.setB("spring4");
		t4.setC(new DataBean3());
		return t4;
	}
	
	@Bean
	public TestBean4 obj7() {
		TestBean4 t5 = new TestBean4();
		return t5;
	}
	
	@Bean
	public DataBean4 data2() {
		return new DataBean4();
	}
}
