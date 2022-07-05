package oop07.anony;

public class Anonymous {
	RemoteControl rc = new RemoteControl() { // 따로 자바파일 없이 만들 수 있다. 한번만 만들어두면 됨 (익명객체)
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	public void method1() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");			
			}
		};
		
		rc.turnOn(); 
	}
	
	
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
}