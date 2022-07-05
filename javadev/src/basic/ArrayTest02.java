package basic;

public class ArrayTest02 {
	public static void main(String[] args) {
		// int[] arr = new int[] {100, 200, 300}; // 배열 객체를 만들어짐과 동시에 초기화 된다.
		int[] arr = {100, 200, 300};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
