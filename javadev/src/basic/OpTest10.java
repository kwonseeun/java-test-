package basic;

public class OpTest10 {
	public static void main(String[] args) {
		
		System.out.println("4~15 정수 발생");
		System.out.println((int)(Math.random() * 12 )+ 4);
		System.out.println((int)(Math.random() * 12 )+ 4);
		System.out.println((int)(Math.random() * 12 )+ 4);		
		System.out.println((int)(Math.random() * 12 )+ 4);
		
		// 6 부터 23으로 생각 
		System.out.println("난수 발생");
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
	}
}