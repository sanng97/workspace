package edu.kh.control.condition.ex;

import java.util.Scanner;

// 기능용 클래스
public class SwitchEx {
	
	/* switch문
	 * 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * ->  식 결과에 맞는 case 구문이 수행됨
	 * 
	 * < 작성법>
	 * 
	 * switch(식) { // 식의 결과는 정수 또는 문자열
	 * 
	 * case 결과 1 : 결과1의 수행코드 ; break;
	 * case 결과 2 : 결과1의 수행코드 ; break;
	 * case 결과 3 : 결과1의 수행코드 ; break;
	 * 
	 * default : 모든 case가 만족하지 못할 때 수행할 코드
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	
	public void ex1() {
		Scanner sc = new Scanner (System.in);
		
		
		
		//키보드로 정수를 입력 받아
		// 1. : RED
		// 2. : ORANGE
		// 3  : YELLOW
		// 4. GREEN
		// 5. BLUE
		// 6. BLACK
		
		
		System.out.println("정수 입력:");
		int input = sc.nextInt();
		
		
		String result ; //결과 저장용 변수
		/*
		if(input == 1 ) {
			result = "RED";	
		}
		else if (input == 2) {
			result = "ORANGE";
		}
		else if (input == 2) {
			result = "YELLOW";
		}
		else if (input == 2) {
			result = "GREEN";
		}
		else if (input == 2) {
			result = " BLUE";
		}
		else {
			result = "BLACK";
		}
		*/
		
		// switch 버전
		switch(input) {
		case 1: result = "RED"; break;
		
		case 2: result = "ORANGE"; break;
		case 3: result = "YELLOW"; break;
		case 4: result = "GREEN"; break;
		case 5: result = "BLUE"; break;
		
		
		default: result = "BLACK"; break;
	
	
		}
	}
	
		// switch 예제 2
		public void ex2() {
		// 점심 결정 프로그램
		// 난수 (Math.random() ). switch문
		
			
		//Math.random() : 0.0 <= x <1.0
		
		//Math.random() * 5 : 0.0 <= x * 5 < 5.0
		//Math.random() * 5 + 1 : 1.0 <= x * 5 + 1 < 6.0
		//(int)Math.random() * 5 + 1 : 1 <= (int) (x * 5 + 1) < 6

		//1~5 난수 생성
		int randomNumber = (int)(Math.random()*5 + 1);
		
		String menu = null; //null : 참조하는 것이 없다 
		
		switch(randomNumber) {
		case 1 : menu = "제육볶음"; break;
		case 2 : menu = "서브웨이"; break;
		case 3 : menu = "국밥"; break;
		case 4 : menu = "파스타"; break;
		case 5 : menu = "초밥"; break;
		}
		
		System.out.printf("오늘의 점심 메뉴는 [%s] 입니다.", menu);
		}
	
		// switch 예제 3
		public void ex3() {
			
			// 문자열로 메뉴를 입력 받앙서
			// 해당 메뉴의 가격을 출력
			
			// [ 실행화면 ]
			// 메뉴를 선택해주세요 ( 김밥, 라면, 떡볶이) : 김밥
			// 김밥의 가격은 3000원 입니다.
			
			// 메뉴를 선택해주세요 ( 김밥, 라면, 떡볶이) : 샌드위치
			// 존재하지 않는 메뉴입니다.
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" 메뉴를 선택해주세요 ( 김밥, 라면, 떡볶이) : ");
			
			String menu = sc.next(); // 단어 (음절) 입력
			
			
			int price; // 가격 저장용 변수 선언
			
			switch(menu) {
			case "김밥"      : price = 3000 ; break;
			case "라면"      : price = 2500 ; break;
			case "떡볶이"    : price = 4000; break;
			default          : price = -1; // 잘못 입력되었다는 신호 (중요)
			}
			
			// *값의 의미를 부여해서 조건식에 사용 *
			
			if (price != -1) { //정상 입력한 경우
				System.out.printf("%s의 가격은 %d입니다",menu,price);
			}
			else { //잘못입력한경우
				System.out.println("존재하지않는 메뉴입니다.");
			}

			System.out.printf("%s의 가격은 %d 입니다.",menu,price);
		}

			
			// switch 예제 4
			
			// 산술 연산 계산기
			
			// - 두 정수와 1개의 연산자( +-*/)
			
			// [ 실행화면]
			// 정수1 입력 : 5
			// 연산자 : +
			// 정수2 입력 : 4
			// 5+4 =9
			
			// 정수1 입력 : 5
			// 연산자 : /
			// 정수2 입력 : 4
			// 5 / 4 = 1
			
			// 정수1 입력 : 2
			// 연산자 : @
			// 정수2 입력 : 10
			// 존재하지 않는 연산자입니다.
			
			public void ex4() {
			
			Scanner sc = new Scanner(System.in);
			 
			System.out.print("정수 1 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("연산자 : ");
			String op = sc.next(); // 한글자만 입력해도 string
			
			System.out.print("정수2 입력 : ");
			int num2 = sc.nextInt();

			
			//switch(op) {
			//case "+" : System.out.printf("%d %s %d = %d", num1,op,num2, num1+num2); break;
			//case "-" : System.out.printf("%d %s %d = %d", num1,op,num2, num1-num2); break;
			//case "*" : System.out.printf("%d %s %d = %d", num1,op,num2, num1*num2); break;
			//case "/" : System.out.printf("%d %s %d = %d", num1,op,num2, num1/num2); break;
			//default  : System.out.println("존재하지않는 연산자입니다.");
			//}
		
			int result= 0;
			
			boolean flag = false; // 신호용 변수( 상태를 기록하고 조건문에 사용할 변수)
			// false 일때 : 연산자를 정상적으로 입력
			// true 일 때 :  연산자를 잘못입력
			
			
			switch(op) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			case "%" : result = num1 % num2; break;
			default : flag = true; // 연산자를 잘못입력 -> flag를 true로 변경
			}
			// flag == false 와 !flag는 같은 결과
			if (!flag ) { // 정상입력 == flag가 false
				System.out.printf("%d %s %d = %d", num1,op,num2,result);
			}
			else {
				System.out.println("존재하지 않는 연산자 입니다");
			}
			}
			
			
			
			// switch 예제 5 -break의 역할
			public void ex5() {
				// switch문을 이용한 계절 판별기
				Scanner sc = new Scanner (System.in);
				
				System.out.print("달(월) 입력 :");
				int month = sc.nextInt();
				
				// break : 멈추다
				// *break 가 없는 경우*
				// -> break를 만나거나 switch가 끝날때까지
				//    다음case를 연달아 실행
				
				
				String season; //결과저장
				switch (month) {
				case 1 : case 2 : case 12 : season = "겨울";break;
				
				case 3 : case 4 : case 5 : season = "봄";break;
				
				case 6 : case 7 : case 8 : season = "여름"; break;
				
				case 9 : case 10 : case 11 : season = "가을"; break;
				
				default : season = " 잘못입력";
				}
				System.out.println(season);
				
				}
			}
			

			

			
			
			
			
			
			
			
			
			
			
			
		 	
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

