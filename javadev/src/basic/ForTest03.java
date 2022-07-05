package basic;

public class ForTest03 {

	// 1~1000 까지 정수 중 3의 배수의 합계를 구하시오 
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <=1000; i++) {
			if(i%3==0) sum += i; 
		}
		System.out.println("1~1000의 합은:" + sum);
	}

}
