package basic;

import java.util.Scanner;

public class IfTest02 {

	// 0~100 사이의 정수를 입력 받아 90점 이상이면 A, 80점 이상 90점 미만이면 B, 70점 이상 80점 미만이면 C, 60점 이상 70점 미만이면 D 그 외에는 F를 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~100 사이 점수를 입력하세요: ");
		int s = sc.nextInt();
		
		if (s >= 90) {
			System.out.println("A");
		} else if (s >= 80) {
			System.out.println("B");
		} else if (s >= 70) {
			System.out.println("C");
		} else if (s >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		sc.close();
		
	}

}
