package oop11.api;

// 
public class ObjectTest02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		if (a == b ) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		String str1 = "안녕하세요"; //배열과 string new 쓰지않고 객체생성 가능
		String str2 = "안녕하세요";
		
		if ( str1 == str2 ) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
	}
}
