package oop11.api;

public class ObjectTest03 {
	public static void main(String[] args) {
		
		// new 라는 연산자를 쓰게되면, 안에 문자열이 같은 객체가 있더라도 공간을 새로 만든다. 서로 다른객체를 참조  
		String str1 = new String("실수란 신이 용서하는 인간의 행위이다.");
		String str2 = new String("실수란 신이 용서하는 인간의 행위이다.");
		
		if (str1 == str2) {
			System.out.println("1 같다.");
		} else {
			System.out.println("1 다르다.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("2 같다");
		} else {
			System.out.println("2 다르다.");
		}
	}
}
