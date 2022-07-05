package basic;

import java.util.Scanner;

public class OpTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.println(a % 2 == 0 ? "짝수입니다." : "홀수입니다.");		
		sc.close();
	}
}
