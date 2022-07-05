package basic;

import java.util.Scanner;

public class SwitchTest02 {

	// switch~case문을 이용한 1,3 입력시 남자 2,4 여자 출력 , 그 외에는 에러 출력  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int a = sc.nextInt();
		sc.close();
		
		switch (a) {
		case 1:
		case 3:	
			System.out.println("남자");
			break;

		case 2:
		case 4:
			System.out.println("여자");
			break;
			
		default:
			System.out.println("에러");
			break;
		}
		
	}

}
