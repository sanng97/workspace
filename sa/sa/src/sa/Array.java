package sa;

import java.util.Scanner;

public class Array {

	public void ex1() {

		int a; 

	    int[]arr;

		a = 10;

		arr = new int[3];
		
		System.out.println("arr : "+ arr);
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : "  +arr[1]);
	}
	
	//---------------------------------------------------
	public void ex2() {
		
		
		int []numbers = new int [4];// 선언 및 할당

			numbers[0] = 10;
			numbers[1] = 100;
			numbers[2] = 1000;
			numbers[3] = 10000;

			System.out.println(numbers[0]);
			System.out.println(numbers[1]);
			System.out.println(numbers[2]);
			System.out.println(numbers[3]);
			

			for ( int i = 0; i<=3; i++) {
				System.out.printf("number[%d] * %d\n", i , numbers[i]);
			}
			
			System.out.println("=====================");
	
			numbers[0] = 10000;
			numbers[1] = 1000;
			numbers[2] = 100;
			numbers[3] = 10;
			
			
			System.out.println(numbers[0]);
			System.out.println(numbers[1]);
			System.out.println(numbers[2]);
			System.out.println(numbers[3]);
			
			for(int i = 0; i<=3; i--) {
				System.out.printf("number[%d] * %d\n", i , numbers[i]);
			}
			
	}
		// --------------------------------------------------------------------
			
			public void ex3() {
				Scanner sc = new Scanner(System.in);
				
			double[] heightArray = new double[3];
				
			for(int i = 0; i<3; i++) {
					System.out.print(i+ "번 키 입력 : ");
					heightArray[i]= sc.nextDouble();
			}	
				System.out.println("=================");
				
				
				double sum = 0.0;
				
				
				for (int i =0; i<heightArray.length; i++) {
					System.out.printf("[%d번째의 키] = %.1f",i,heightArray[i]);
					
					sum +=heightArray[i]; // 합계
				}
				System.out.println("평균 : " + sum / 3.0);
				
			}
			
			
		
			public void ex4() {
			

				String[] menuArray = {"햄버거" , "돈까스" , "제육볶음",
						"샐러드", "닭갈비", "순대국밥" ," 평양냉면" , " 삼각김밥 + 컵라면"};
			
			
				int index = (int)(Math.random() * menuArray.length);
				
						
				System.out.println("오늘의 메뉴 : +menuArray[index]");
			}
				
		//-----------------------------------------------------------------------------
				public void ex5() {
					
				
					String[] menus = {"원조김밥","참치김밥", "치즈김밥","떡볶이","라면"};
					
					int[] prices = {3000,4000,4000,3500, 5000};
					
					Scanner sc = new Scanner(System.in);
					
					String orderMenu = ""; // 주문한 메뉴를 저장할 변수
					
					int sum = 0; // 주문한 메뉴의 가격을 저장할 변수
					
					while(true) {
						
						System.out.println("----메뉴-----");
						
						for(int i =0; i<menus.length;i++) {
							
						System.out.printf("%d) %s (%d원) \n", menus[i], prices[i]);
							
						System.out.println("9 )  주문완료");	
						System.out.println("메뉴 선택 >");	
						int input = sc.nextInt();
						
					
						
						if (input == 9) {
							
							break;
						}
						
					
		
						else if(input < 0|| input >= menus.length) {
							System.out.println(" 잘못 입력 ");
						}
						
						else { // 정상 입력 -> 누적
							orderMenu += menus[input] + " ";
							sum += prices[input];
							
						}
						
						} // while 종료
						
						System.out.println("주문한 메뉴 : "+ orderMenu);
						System.out.println("합계 " + sum + "원");
					}
			
				}
					
					
					
	
				public void ex6() {
					
				
				Scanner sc = new Scanner(System.in);
				System.out.println(" 입력 받을 인원 수 : ");
				int num = sc.nextInt();
				int sum = 0;
				int[] scores = new int[num]; 
				// == num
				for (int i = 0; i<scores.length; i++) {
					
					System.out.print( (i+1) + " 번 점수 입력 : ");
					
	
					scores[i] = sc.nextInt(); // 입력 받은 정수를 배열요소 저장
					
					
					sum += scores[i]; // 합계 누적
				}
				System.out.print("합계 : " + sum + "점");
				System.out.print("평균 : " + sum/scores.length + "점");

				}
//--------------------------------------------------------------------------------------
					
				public void ex7() {
					
					Scanner sc = new Scanner(System.in);
					System.out.print(" 생성할 배열의 길이 : ");
					int num = sc.nextInt();

					// 입력 받은 input 만큼 길이를 가지는 배열 생성
					int[] arr = new int[num];
					
					// 생성된 배열의 모든 요소에 입력 값을 대입
					for (int i = 0; i<arr.length; i++) {
						System.out.print( i + " 번 인덱스요소 : ");					
						arr[i] = sc.nextInt();
					}
					
				while(true) { //  무한 반복
						
					
					System.out.print("저장된 값을 확인하려는 인덱스");
					int input = sc.nextInt();	
					
				
						if (input == -1) {
							System.out.println("프로그램 종료");
								break; // 반복종료
						}
				
						

						 if(input < 0|| input >= arr.length) {
							System.out.println(" 존재하지않는 인덱스 번호 입니다 ");
							continue; // 다음 반복으로 이동 (반복문 처음으로 이동 )
						}
						 

						
		System.out.printf("%d번 인덱스 : %d \n" , input, arr[input]);
						}
						}

}
