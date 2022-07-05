package basic;

/**
 * continue
 * 반복문 블럭의 마지막으로 혹은 증감식으로 이동 
 * */
public class ContinuteTest01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%3!=0) continue; // continue 이하의 반복문은 생략한다. 바로 증감식으로 이동 
			sum += i;
		}
		
		System.out.println("3의 배수중 1~10까지의 합계 " + sum);
	}
}
