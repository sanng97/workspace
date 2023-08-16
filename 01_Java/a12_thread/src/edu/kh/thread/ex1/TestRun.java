package edu.kh.thread.ex1;

public class TestRun {
	
	public static void main(String[] args) {
		//main 메서드 실행 시
		// stack영역에  main Thread가 생성되며
		// 해당 스레드에  main() 메서드가 올라가게된다.
		// Thread.currentThread() :현재 실행중인 스레드
		//Thread.currentThread().getName() : 현재 실행 중인 스레드 이름반환
		System.out.println(Thread.currentThread().getName()+ "생성");
		
		// 추가 스레드 생성
		
		
		// 방법 1. Thread 클래스 상속
		TestThread1 test1 = new TestThread1(); // 객체생성
		
		test1.start(); // 스레드 실행
		
		for(int i = 0; i<10; i++) {
			
			System.out.println("main 스레드" + i);
		}
		
		
		
		
		
		
	}

}
