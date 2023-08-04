
package edu.kh.variable;

public class VariableEx2 {
	
// main method : 자바 프로그램 실행문 구문
	public static void main(String[] args) {
		
		/* 변수 : 메모리에 값을 저장하기 위한 공간
		 * 
		 * 변수 선언 : 메모리에 값을 저장할 공간을 생성 (할당)
		 * 
		 * 자료형 : 변수의 종류 (크기, 형식)
		 * 
		 * 자바의 기본 자료형 8가지
		 * - 논리형 : boolean ( 1byte) true /false 만 저장  
		 * - 정수형 
		 * 1. byte (1byte)
		 * 2. short (2byte)
		 * 3. int (4byte) -> 정수 기본형
		 * 4. long (8byte)
		 * 
		 * - 실수형 
		 * 1. float (4byte)
		 * 2. double (8byte) -> 실수 기본형
		 *
		 * - 문자형
		 * 1. char (2byte, 유니코드 (UTF-16))
		 */
		
		
		boolean isTrue; // 변수 선언
		// -> <논리형> 데이터 (true/false)를 저장할 공간
		// 1byte를 메모리에 할당하고 
		// 그 공간을 isTrue라고 부르겠다.
	}
	
	{
		
	{
	
		int number1;
		// -> <정수형> 데이터 를 저장할 공간
		// 4byte를 메모리에 할당하고 
		// 그 공간을 number1 이라고 부르겠다.
		
		double number2;
		// -> <실수형> 데이터를 저장할 공간
		// 8byte를 메모리에 할당하고 
		// 그 공간을 number2 이라고 부르겠다.
		
		int userAge; //카멜 표기법

		
		// 값 대입 :변수 (메모리 공간)에 값을 집어넣는다.
		// f(x) = x + 2
		// x = 0 -> f(0) = 0 + 2
		// x = 10 -> f(10) = 10 + 2 = 12
		
	
		boolean isTrue = true; // boolean형 변수에 true 대입
		// boolean 리터럴 표기법 : true/ false
		
		number1 = 12345; // int형 변수에 12345 대입
		// int 리터럴 표기법 :  -10 , 0, 1 (일반정수)
		
		number2 = 993.999; // double형 변수에 993.999 대입
		// double 리터럴 표기법 : -1.23, 0.0 ,1.0, 3.14 
		
	
		
		System.out.println("isTrue에 저장된 값 :" + isTrue);
		System.out.println("number1에 저장된 값 :" + number1);
		System.out.println("number2에 저장된 값 :" + number2);
		
		long number3 = 10000000000L; //100억
		// 10000000000 (int형 100억)
		// The literal 1000000000 of type int is out of range
		
	
		// 10000000000L (long형 100억)
		
		float number4 = (float) 3.14; // 실수형 4byte
		// 다른 방법=> float number4 = 3.14f; // 실수형 4byte
		// 3.14는 double 리터럴 표기법
		
		
		char ch1 = 'A'; // 문자형	
		// 문자형의 리터럴 표기법은 ' ' (홀따옴표)
		
		// 리터럴 표기법 L,f,''가 출력되는지 확인
		// -> 출력되지 않는다
		// ->  변수에 저장할 때 자료형에 맞게 인식하는 용도
		System.out.println("number3에 저장된 값 : " + number3);
		System.out.println("number3에 저장된 값 : " + number4);
		System.out.println("ch1에 저장된 값 : " + ch1);
			
		
		
		
	}	
		
}
	}

