package oop10.thread;

public class ThreadTest04 extends Thread {
	public static void main(String[] args) {
		
		ThreadTest04 t = new ThreadTest04();
		t.setName("스레드의 이름 부여");
		t.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);		
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
			System.out.println(Thread.currentThread().getName() + ":" + i);			
			try {
				Thread.sleep(1000); //1초 간격으로 한줄씩 출력 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
