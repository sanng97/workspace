package edu.kh.thread.ex1;

// 스레드 생성 방법 2 :Runnable 인터페이스 상속

//Rum + able

// 장점 : run() 메서드 오버라이딩이 강제된다
// 단점 : 해당 스레드를 생성시키는 구문이 조금더 길어진다

public class TestThread2 implements Runnable {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+ "실행");
		
		// 방법 2. Runnable 인터페이스 상속
		// new Thread (Runnable target) :
		// Runnable 인터페이스를 상속받은 객체를  매개변수에 추가
		Thread test2 = new Thread(new TestThread2());
		test2.start();
		
		
		
		
		for(int i = 0; i<10; i++) {
			System.out.println("1번 스레드" + i);
		
		}
		
		
		
		
	
	}


	
	
	
}
