package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("인원 수 : ");
		
		int people = sc.nextInt();
		
		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy/people); 
		System.out.println("a를 2로 나눴을 때 나머지 : " + candy % people);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
