package kr.hs.study.beans;

public class SamsungTV implements TV{
	int volume=0;
	boolean power=false;
	public SamsungTV() {
		System.out.println("SamsungTV 생성자 실행");
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(volume+1>10) {
			System.out.println("SamsungTV:최대 음량입니다.");
		}else {
			volume++;
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(volume-1<0) {
			System.out.println("SamsungTV:최소 음량입니다.");
		}else {
			volume--;
		}
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if(power==true) {
			System.out.println("SamsungTV:이미 켜져있습니다.");
		}else {
			power=true;
		}
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		if(power==false) {
			System.out.println("SamsungTV:이미 꺼져있습니다.");
		}else {
			power=false;
		}
	}

	@Override
	public String toString() {
		if(power==true) {
			return "SamsungTV 볼륨 : " + volume + " 상태 : ON";
		}else {
			return "SamsungTV 볼륨 : " + volume + " 상태 : OFF";
		}
		
	}
	
}
