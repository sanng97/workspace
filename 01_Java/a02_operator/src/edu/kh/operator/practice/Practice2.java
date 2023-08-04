package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : "  );
		int input1 = sc.nextInt();

		String result = 
				input1 == 0 ? "0입니다" :
					(input1 > 0? "양수" : "양수아님");
		   System.out.println(result);
		
				
	}
	
	
	
	
	
}
