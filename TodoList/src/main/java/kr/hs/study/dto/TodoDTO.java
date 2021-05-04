package kr.hs.study.dto;

import java.sql.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import oracle.sql.DATE;

// bean 으로 등록하고, 매번 객체를 생성해야 하기 때문에 prototype 속성 줌
@Component
@Scope("prototype")
public class TodoDTO {
	private String content;
	private String period;
	private String type;
	private Date deadline;
	private String done;
	
	public TodoDTO() {
		super();
	}

	public TodoDTO(String content, String period, String type, Date deadline, String done) {
		super();
		this.content = content;
		this.period = period;
		this.type = type;
		this.deadline = deadline;
		this.done = done;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPeriod() {
		return period;
	}
	
	public void setPeriod(int period) {
		switch (period) {
		case 1: case 7:
			this.period = "오늘";
			break;
		case 2:
			this.period = "내일";
			break;
		case 3:
			this.period = "이번주";
			break;
		case 4:
			this.period = "이번달";
		case 5:
			this.period = "올해";
		case 6:
			this.period = "기한없음";
			break;

		default:
			break;
		}
		
	}
	
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date date) {
		this.deadline = date;
	}

	public String getDone() {
		return done;
	}

	public void setDone(String done) {
		this.done = done;
	}
}