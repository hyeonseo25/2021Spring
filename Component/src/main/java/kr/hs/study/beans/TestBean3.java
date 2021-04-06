package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj3")
@Lazy
@Scope("prototype")
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3 기본생성자입니다.");
	}
	@PostConstruct
	public void initmethod() {
		System.out.println("TestBean3 init메서드");
	}
	
	@PreDestroy
	public void destroymethod() {
		System.out.println("TestBean3 destroy메서드");
	}
}
