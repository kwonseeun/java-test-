package oop07.anony;

public class AnonyTest {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.rc.turnOn();
		anony.method1();
		// 바로 익명객체를 집어 넣는다. 
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("smart TV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("smart TV를 끕니다.");
			}
		});
	}
}