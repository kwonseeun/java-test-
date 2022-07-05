package oop10.thread;

public class ThreadTest01 {
	public static void main(String[] args) {
		
		run();
		
		for (int i = 1; i <=5; i++) {
			System.out.println("main :" + i);
			
			try {
				Thread.sleep(1000); //1초 간격으로 한줄씩 출력 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("run :" + i);
			
			try {
				Thread.sleep(1000); //1초 간격으로 한줄씩 출력 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
