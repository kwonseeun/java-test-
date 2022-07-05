package oop08.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance(); // 이미 만들어져있으면, 같은 주소값을 참조한다
		
		if (s1 == s2 ) {
			System.out.println("같은 singletone 객체 입니다.");
		} else {
			System.out.println("다른 singleton 객체 입니다.");
		}
	}
}
