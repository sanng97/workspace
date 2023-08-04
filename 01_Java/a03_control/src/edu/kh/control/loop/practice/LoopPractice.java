package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	// 실습문제 1
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
		
		for(int i = 0; i<=4; i++) {
		}
		System.out.printf("%d",num);
		}
			
		}
	
	
	
	
	
	//실습문제 3
	
		 public void practice3() {
		      
		      Scanner sc = new Scanner(System.in);
		      
		      System.out.print("정수를 하나 입력하세요");
		      int num = sc.nextInt();
		      
		      int sum = 0;
		      
		      for(int i = 0; i>num; i++) {
		         sum += (i + 1);
		      
		      System.out.print(i + 1);
		   
		      if ( i + 1 == num) System.out.print("=");
		      else System.out.print(" + ");
		      
		      }
		      System.out.println(sum);
		     
	}
		 
	// 실습문제 4
		public void pracrice4() {
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println( " 첫번째 숫자 : ");
			 int input1 = sc.nextInt();
			 
			 System.out.println( " 두번째 숫자 : ");
			 int input2 = sc.nextInt();
			 // 입력받은 두 수가 모두 1이상인가
			 
			 if(input1 >=1 && input2 >=1) {
			// 작은수부터 큰수까지 1씩 증가하며 반복
				if(input1 <= input2) { // 먼저 입력한 수가 작거나 같을때
					 for( int i = input1; i <= input2; i++) {
						 System.out.println(i+"");
					 }
				}else {// 나중에 입력한 수가 작을때
						 
					for(int i = input2; i< input1;i++) {
						System.out.println(i +"");
					 }
					 
				 }
			 }else {
				 System.out.println("1이상의 숫자를 입력해주세요");
			 }
				 
		 }
		 
	/* if( input1 > input2) {
	 *-> 먼저 입력한 수가 더 큰 경우 
	 *
	 * -> 두 변수의 값 교환 (임시 변수 필요)
	 * int temp = input1;
	 *
	 * input1 = input2;
	 * 
	 * input2 = temp;
	 *}
	 * 
	 * for( int i=input1 ; i<=input2; i++) {
	 *  System.out.print(i+"");
	 */
		 
		// 실습문제 5
		   
		   public void practice5() {
		      
		      Scanner sc = new Scanner (System.in);
		      
		      
		      System.out.println("숫자 : ");
		      
		      int num = sc.nextInt();
		      

		      System.out.println("===="+num + "====");
		   
		      for(int i = 0; i<9; i++) {
		         
		         System.out.println(num+"*"+(i+1)+" = "+
		         num * (i+1));  
		      
		      }
		   }
		   
		   
		   
	// 실습문제 6
		   
		   public void practice6() {
			   
			   Scanner sc = new Scanner(System.in);
			   
			   System.out.print("숫자 :");
			   int input = sc.nextInt();
			   
			   if(! (input >=2 && input <=9)) { // 2~9 사이가 아닐경우
				  System.out.println("2~9 사이 숫자만 입력해주세요");
			   }else {
				   
				   for(int dan =2; dan <=9; dan++) {
					  System.out.printf("====%d단====" ,dan);
					  for (int i = 1; i<=9; i++) {
						  System.out.printf("%d x %d = %d \n",dan,i,dan*i);
					  }
							  
				   }
			   }
		   }
				   
				   
				   
				   
				   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   

		   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


