package kr.hs.study.beans;

public class SamsungTV implements TV {
	private String name;
	private int price;
	private SonySpeaker speaker;
	
	public SamsungTV() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void powerON() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 전원을 킵니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 전원을 킵니다.");
	}
	@Override
	public String toString() {
		return name+"의 가격은 "+price+"원 입니다."+speaker;
	}

}
