package oop05.abstract02;

public class Tiger extends Animal{

	public void attack() {
		System.out.println("호랑이가 공격 합니다.");
	}

	@Override
	public void sleep() {
		System.out.println("호랑이가 눈뜨고 잠을 잡니다.");
	}
	
}
