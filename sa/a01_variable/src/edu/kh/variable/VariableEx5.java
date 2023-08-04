package edu.kh.variable;

import java.util.Scanner;

public class VariableEx5 {
	
	public static void main(String[] args) {
		
		// 상수 ( 항상 같은 수)
		// - 메모리에 값을 저장 할 수 있는 공간
		// - 변수와 다르게 한번만 값을 대입 할 수 있다.
		
		// 상수를 나타내는 예약어 : final
		
		// 상수 명명 규칙
		// - 모두 대문자
		// - 단어 사이는 _ (언더스코어)
		
		// CONSTANT: 상수 (일정한, 변하지않는)
		final int CONSTANT_NUMBER = 234;
		
		
		// 상수는 정말 값을 바꿀 수 없을까? (x)
		// CONSTANT_NUMBER = 100; 
		
		
		//상수 활용하기
		
		Scanner sc = new Scanner(System.in); //스캐너 생성
		
		final int INIT = 1000; // 초기값이 1000
		final int UP = 500; 
		final int DOWN = -500;
		
		int user1 = INIT;
		int user2 = INIT;
		
		System.out.println("1 입력시 user1 -> 500증가, user2-> 500감소   ");
		System.out.println("2 입력시 user1 -> 500감소, user2-> 500증가   ");
		
		System.out.print("숫자 입력 :");
		
		int input = sc.nextInt(); // 입력받은 정수 값을 이용해 input 초기화
		
		// = (대입연산자 : b를 a에 집어넣어라) 
		// == (비교연산자: a와 b는 같다면 true , 아니면 false)
		
		// if문 : () 내부의 결과가 *true* 이면 실행
		if(input == 1) {
			user1 = user1 + UP;
			// 1000 + 500= 1500을 user1에 대입
			user2 = user2 + DOWN;
			// 1000 +(-500) = 500을 user2에 대입
		
	}
		
		if(input == 2) { // 2 입력 시
			user1 = user1 + DOWN;
			// 1000 + 500= 1500을 user1에 대입
			user2 = user2 + UP;
			// 1000 +(-500) = 500을 user2에 대입
		
	}
		
		
		
		
		
		
		
		
		
		System.out.println("user1 :" + user1);
		System.out.println("user2:" + user2);
		
		
		
		
		
		
		
		
		
	}

}
