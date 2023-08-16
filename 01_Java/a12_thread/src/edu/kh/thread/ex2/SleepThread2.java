package edu.kh.thread.ex2;

public class SleepThread2 implements Runnable {

	@Override
	public void run() {
	
		int count = 0;
		
		
		// 현재 스레드의 interrupted 필드 값 반환
		// ->  수행중이면 false, 멈춰야 되면 true
		// interrupted 필드 갑이 false이면 반복
		// true이면 멈춰라
		while(!Thread.currentThread().isInterrupted()) {
			
			try {
				Thread.sleep(500);  //0.5
				
				System.out.println(++count);
			} catch (InterruptedException e) {
				
				//e.printStackTrace();
				System.out.println("==인터럽트에 의해서 종료됨===");
				
				// sleep() 중 interrupt() 메서드가 호출되면
				//InterruptedException 이 발생하고
				// interrupted 필드값이 true로 변하지 못하게된다.
				// -> catch문에서 interrupt 필드 값은 true 변경
				
				Thread.currentThread().interrupt();//false - > true 변경
				
			}
			
		
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
