package kr.hs.study.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// bean 으로 등록하고, 매번 객체를 생성해야 하기 때문에 prototype 속성 줌
@Component
@Scope("prototype")
public class BookDTO {
	private String title;
	private String author;
	private int price;
	private String email;
	
	public BookDTO() {
		super();
	}
	public BookDTO(String title, String author, int price, String email) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}