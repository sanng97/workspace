package edu.kh.variable;

public class VariableEx1 {
	
	// main method : 자바프로그램을 실행시키기 위해 반드시 필요
	
	public static void main (String[] args ) {
		
		System.out.println("[변수 사용 X]");
		
		// - 값의 의미 알 수 없음
		// - 같은 값을 반복해서 작성 ( 체력, 메모리 소비)
		// - 가독성이 떨어짐
		// - 유지보수가 불편함
		
		System.out.println(2 * 3.14159265489793 * 5);
		System.out.println(3.14159265489793 * 5 * 5);
		System.out.println(3.14159265489793 * 5 * 5 * 20);
		System.out.println(3.14159265489793 * 5 * 5);
		
		System.out.println("-----------------");
		
		System.out.println("[변수 사용 O]");
		
		// 변수 선언 및 초기화
		double pi = 3.14159265489793;
		int r = 10;
		int h = 20; 
		
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
		
		// 변수란?
		// - 메모리 (ram) 에 값을 기록하는 공간
		// - 공간에 기록되는 값이 변할 수 있어서 변수라고 한다.
		
		
		// 변수 장점
		
		// - 값의 의미 알 수 있다
		// - 같은 값을 한 번만 작성 -> 재사용성의 증가
		// - 가독성 증가 ( 읽기 편하다 ) 
		// - 유지보수 용이함 (수정이 쉽다) 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
