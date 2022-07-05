package oop09.Exception;

public class ExceptionTest03 {
	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

	// try ~catch문을 사용하지 않고 메소드 옆에 throws Exception을 사용하여 예외처리를 미룬다. throwException() 으로 
	private static void throwException() throws Exception {
		System.out.println("throwExcetpion 메서드 수행 시작");
		
		throw new Exception("사용자가 강제로 예외 발생");
	}
}
