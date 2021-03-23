package kr.hs.study.beans;

public class LgTV implements TV{
	int volume=0;
	boolean power=false;
	public LgTV() {
		System.out.println("LgTV 생성자 실행");
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(volume+1>10) {
			System.out.println("LgTV:최대 음량입니다.");
		}else {
			volume++;
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(volume-1<0) {
			System.out.println("LgTV:최소 음량입니다.");
		}else {
			volume--;
		}
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if(power==true) {
			System.out.println("LgTV:이미 켜져있습니다.");
		}else {
			power=true;
		}
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		if(power==false) {
			System.out.println("LgTV:이미 꺼져있습니다.");
		}else {
			power=false;
		}
	}

	@Override
	public String toString() {
		if(power==true) {
			return "LgTV 볼륨 : " + volume + " 상태 : ON";
		}else {
			return "LgTV 볼륨 : " + volume + " 상태 : OFF";
		}
		
	}

}
