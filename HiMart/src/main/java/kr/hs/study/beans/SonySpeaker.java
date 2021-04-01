package kr.hs.study.beans;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("소니스피커 볼륨 업");
	}

	@Override
	public void VolumeDown() {
		// TODO Auto-generated method stub
		System.out.println("소니스피커 볼륨 다운");
	}
	@Override
	public String toString() {
		return "Sony 스피커가 작동합니다.";
	}
}
