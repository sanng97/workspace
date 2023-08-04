package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("국어 :");
		int input1 = sc.nextInt();
		
		System.out.println("영어 :");
		int input2 = sc.nextInt();
		
		System.out.println("수학 :");
		int input3 = sc.nextInt();
		
	
		int sum  = 0;
		sum = (input1 + input2 + input3);
		
		
		
		
		double input5 = 0.0;
		input5 = sum/3.0;
	
		System.out.printf("합계 : %d", sum );
		System.out.println();
		System.out.printf("평균 : %.1f", input5);
		
		   String result =      
			         input1 < 40 && input2 < 40 && input3 < 40? "불합격" : (input5 >= 60.0? "합격" : "불합격");
			         System.out.println(result);
		
		
		
		
		
		
		
		
		
	}

}
