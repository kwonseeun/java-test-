package oop10.thread;

public class ThreadTest03 implements Runnable{
	
	public static void main(String[] args) {
		ThreadTest03 r = new ThreadTest03();
		Thread t = new Thread(r); // 인자로 ThreadTest03을 넘겨준다
		t.start(); // 호출 스택을 만들고 재정의한 run메소드를 실행하여 멀티스레드를 실행, 우선순위를 알 수는 없다.
		
		for (int i = 1; i <=5; i++) {
			System.out.println("main :" + i);
			
			try {
				Thread.sleep(1000); //1초 간격으로 한줄씩 출력 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
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