package oop06.inter01;

public class LgTV implements TV {
	
	private Speaker speaker = new InkelSpeaker();
	
	public void turnOn() {
		System.out.println("Lg TV: 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("Lg TV: 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("Lg TV: 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("Lg TV: 채널을 내립니다.");
	}
	public void soundUp() {
		speaker.soundUp();
//		System.out.println("Lg TV: 소리를 키웁니다.");
	}
	public void soundDown() {
		speaker.soundDown();
//		System.out.println("Lg TV: 소리를 줄입니다.");
	}
}
