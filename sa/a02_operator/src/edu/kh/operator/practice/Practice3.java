package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : "  );
		int input1 = sc.nextInt();
		
	      String result = 
	              input1 == 0 ? "0" :
	                 (input1 > 0? "양수" : "음수");
	           System.out.println(result);
		
	   		System.out.println("정수 입력 : "  );
			int input2 = sc.nextInt();
			
		      String result2 = 
		              input2== 0 ? "0" :
		                 (input2 > 0? "양수" : "음수");
		           System.out.println(result2);
		           
		   		System.out.println("정수 입력 : "  );
				int input3 = sc.nextInt();
				
			      String result3 = 
			              input3 == 0 ? "0" :
			                 (input3 > 0? "양수" : "음수");
			           System.out.println(result3);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
