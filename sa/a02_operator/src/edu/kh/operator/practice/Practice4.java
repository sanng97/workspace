package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		
		int input = sc.nextInt();
		
	    String result = 
	            input <= 13 ? "어린이(13세이하)" : (13< input && input <= 19?
	                  "청소년(13세 초과 ~ 19세 이하)" : "성인(19세 초과)");
	            System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
