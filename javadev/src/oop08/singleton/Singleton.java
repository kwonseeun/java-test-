package oop08.singleton;

public class Singleton {
	private static Singleton singleton = null; // 자기 자신을 참조할 수 있는 변수를 선언한다. 객체의 메모리 주소값을 항상 유지 
	
	private Singleton() {} // class이름과 같고 반환이 없는 기본 생성자  private으로 하면 new 생성자 할 수 없음 
	
	public static Singleton getInstance() {
		if(singleton == null) { // 싱글톤이 없으면, 
			singleton = new Singleton(); // 객체를 만들어 할당 후 리턴 
		}
		return singleton;
	}
}
