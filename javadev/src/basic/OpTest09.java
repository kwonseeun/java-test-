package basic;

public class OpTest09 {
	public static void main(String[] args) {
		double d = 10; // 자동 형변환 
		// System.out.println(d);
		
		int i = (int) 3.141592; // 강제 형변환 (데이터가 날아간다) 
		// System.out.println(i);
		
		System.out.println((int) (Math.random() * 6) + 1 ); // Math = 0.0 이상 , 1.0 미만의 양의 실수를 임의로 return 해준다. 
		System.out.println((int) (Math.random() * 6) + 1 );
		System.out.println((int) (Math.random() * 6) + 1 );
		System.out.println((int) (Math.random() * 6) + 1 );
		System.out.println((int) (Math.random() * 6) + 1 );
		System.out.println((int) (Math.random() * 6) + 1 );
		
	}
}