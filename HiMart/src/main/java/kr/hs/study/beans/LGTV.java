package kr.hs.study.beans;

public class LGTV implements TV {
	private String name;
	private int price;
	private AppleSpeaker speaker;
	
	public LGTV() {
	}
	
	public LGTV(String name, int price, AppleSpeaker speaker) {
		this.name = name;
		this.price = price;
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
		System.out.println(name+"의 전원을 끕니다.");
	}

	@Override
	public String toString() {
		return name+"의 가격은 "+price+"원 입니다."+speaker;
	}

	public AppleSpeaker getSpeaker() {
		// TODO Auto-generated method stub
		return speaker;
	}
	
	

}
