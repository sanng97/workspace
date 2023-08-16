package edu.kh.thread.ex2;

public class SleepThread1 {
	
public class SleepTherads1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		
		for ( int i = 1; i <=10; i++) {
			
			//Thread.sleep(long millis)
			// 현재 스레드를 지정된 시간 만큼 일시정지
			// - 시간은1/1000초 단위 (ms)로 지정
			// InterruptedException 예외처리 필요
			
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("초");
			
			
			
		}
		
		
		
		
		
	}
	
	
	
}
}
