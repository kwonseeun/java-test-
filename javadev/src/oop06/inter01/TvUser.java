package oop06.inter01;

public class TvUser {
	public static void main(String[] args) {
		
		TV tv = new LgTV();
		
		tv.turnOn();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}
}
