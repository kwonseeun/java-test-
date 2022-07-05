package basic;

public class OpTest04 {

	public static void main(String[] args) {
		int a = 5;
		//++a; 	  // a를 1 증가 후 자기 자신에게 할당 a + 1 (prefix)
		//a++;    // a = a+1; (postfix)
		
		int b = ++a;  // 먼저 a를 1 증가 후 자기자신에게 할당 후, 증가된 값을 b에 할당
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}
}
