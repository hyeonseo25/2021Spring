package kr.hs.study.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// bean 으로 등록하고, 매번 객체를 생성해야 하기 때문에 prototype 속성 줌
@Component
@Scope("prototype")
public class LoginDTO {
	private String userID;
	private int userPass;
	
	
	public LoginDTO() {
		super();
	}
	public LoginDTO(String userID, int userPass) {
		super();
		this.userID = userID;
		this.userPass = userPass;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getUserPass() {
		return userPass;
	}
	public void setUserPass(int userPass) {
		this.userPass = userPass;
	}
	
	
}