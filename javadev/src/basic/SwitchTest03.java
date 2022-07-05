package basic;

import java.util.Scanner;

public class SwitchTest03 {

	// 0~100 사이의 정수를 입력 받아 90점 이상이면 A, 80점 이상 90점 미만이면 B, 70점 이상 80점 미만이면 C, 60점 이상 70점 미만이면 D 그 외에는 F를 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~100 사이 점수를 입력하세요: ");
		int score = sc.nextInt();
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		sc.close();
		
	}

}
