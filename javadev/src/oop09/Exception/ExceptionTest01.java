package oop09.Exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.toString()); // 예외 객체를 생성해서 catch 블럭으로 넘겨준다. 
		} catch (NullPointerException e) { // Exception의 하위는 다 받을 수 있음			
			e.printStackTrace(); //throwable로 부터 상속받은 메소드 : 예외가 발생해서 전달되는 과정을 콘솔에 출력해준다.  
		} catch (Exception e) {		
			e.printStackTrace(); 
		} finally { // 예외가 발생하던 발생하지 않던 무조건 실행되는 블럭 
			System.out.println("finally 블럭");
		}
		
		System.out.println("종료");
	}
}
