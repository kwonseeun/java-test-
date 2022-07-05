package basic;

public class BreakTest01 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i=1;
		while(true) {
			sum += i;
			if(sum >= 100 ) break; // 단독사용은 드물고 조건문과 사용한다.
			i++;
		}
		System.out.println("1부터 "+ i + "까지 정수의 합계는: "+ sum);
	}
}
