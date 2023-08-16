package edu.kh.thread.ex2;

import java.util.Scanner;

public class StopWatchController {

	public void watchStart(){
		// 스톱워치 스레드 생성
		Thread stopWatch = new Thread (new StopWatch());
		
		stopWatch.start(); // 스톱워치 실햏ㅇ
		
		System.out.println("엔터입력시 종료");
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine(); // 엔터 입력 시 까지 무한 대기
		
		// 스톱워치 스레드 멈추게하기
		stopWatch.interrupt();
	}
	
	
	
	
	
	
	
}
