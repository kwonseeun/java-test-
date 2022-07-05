package oop09.Exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
		throwExcetpion();
		
		System.out.println("종료");
	}

	private static void throwExcetpion() {
		System.out.println("throwExcetpion 메서드 수행 시작");
		
		try {
			throw new Exception("사용자가 강제로 예외 발생");
		} catch (Exception e) {		
			e.printStackTrace();
		} 
		
		System.out.println("throwExcetpion 메서드 수행 완료");		
	}
}
