package kr.hs.study.beans;

public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("애플스피커 볼륨 업");
	}

	@Override
	public void VolumeDown() {
		// TODO Auto-generated method stub
		System.out.println("애플스피커 볼륨 다운");
	}
	@Override
	public String toString() {
		return "Apple 스피커가 작동합니다.";
	}
	
}
