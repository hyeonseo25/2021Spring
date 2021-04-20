package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		// LoginDAO 가져오기
		LoginDAO dao = ctx.getBean(LoginDAO.class);
		
		// LoginDTO 가져오기 (id: bean1)
		LoginDTO bean1 = ctx.getBean(LoginDTO.class);
		
		// bean1에 kim, 1111 세팅
		bean1.setUserID("kim");
		bean1.setUserPass("1111");
		
		// dao의 메서드 호출
		dao.insert_data(bean1);
		
		ctx.close();
	}
}
