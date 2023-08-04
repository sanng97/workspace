package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	//실습문제 1
	public void practice1() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 한 개 입력하세요");
		int num = sc.nextInt();
		
		
		if(num>0) {
					if(num % 2 == 0) {
			System.out.println("짝수 입니다.");
	
			}
			else {
				System.out.println("홀수 입니다.");
			}
		}
		else {
			System.out.println("양수만 입력해주세요");
		}
		
		
		
		


	}
		
	
	//실습문제 2
	
	public void practice2() {
		
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("국어점수 : ");
		 int kor = sc.nextInt();
		 
		 System.out.print("수학점수 : ");
		 int math = sc.nextInt();
		
		 System.out.print("영어점수 : ");
		 int eng = sc.nextInt();
		 
		 
		int sum = 0;
		sum = (kor + math + eng );
		
	    double avg = sum / 3;
		
	    System.out.println("합계  : "+sum);
	    System.out.println("평균 : "+avg);
		if (kor >= 40 && math >= 40 && eng >= 40 && avg >= 60.0) {
			System.out.println("축하합니다, 합격입니다!");
		
		}
	    else {
	    	System.out.println("불합격입니다");
	    	
		}

	}
	
	//실습문제 3
	public void practice3() {
		
    Scanner sc = new Scanner (System.in); 
    
    System.out.println("1~12 사이의 정수 입력 : ");
    int month = sc.nextInt();
    
    int day = 0; // 해당하는 달의 마지막 일(날짜)을 저장
    			 // 단 , 1~12월이 아니면 0을 저장
    
    switch(month) {
    case 1 :case 3: case 5 : case 7 : case 8 : case 10: case 12:
		day =31; break;	

    case 4: case 6: case 9: case 11: day=30; break;
    
    case 2: day =28; break;
    }
    if (day == 0) { // 1~ 12사이가 입력되지 않았을 때
    System.out.printf("%d월은 잘못 입력된 달입니다." , month);
    }
    else {
    	System.out.printf("%d월은 %d일 까지 있습니다." ,month,day);
    }
    }
    
    

	
	
	//실습문제 4
	public void practice4() {
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("키를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게를 입력해주세요 : ");
		double weight = sc.nextInt();
		
		double bmi =  weight / (height * height);
		
		String str; // 결과저장
		
		if(bmi < 18.5) {
			str = "저체중";
		}
		else if ( bmi >= 18.5 && bmi < 23 ) {
			str = "정상체중";
			
		}
			
		else if ( bmi >= 25 && bmi < 30 ) {
			str = "과체중";
			
		}
		else if ( bmi >= 25 && bmi < 30 ) {
			str = "비만";
			
		}
		else {
			str = "고도비만";
		}
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(str);
	
	}
	
	
	
	//실습문제 5
	public void practice5() {
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("중간고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말고사 점수 : ");
		int fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int home = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int atten = sc.nextInt();
		
		System.out.println("---------결과 ------------ ");

		
		// 출석 횟수가 부족한 경우 (14회 이하)
		
		if(atten <= 20 * (1- 0.3)) {
			System.out.printf("Fail [출석횟수 부족 (%d/20)]",atten);
		}
		else { // 출석을 잘했을 때
			// 점수 환산
			double midScore = mid * 0.2;
			double finScore = fin * 0.3;
			double homeScore = home * 0.3;
			double attenScore = atten *5 *0.2;
			
			// 총점
			double sum = midScore + finScore + homeScore + attenScore;
			
			
			
			System.out.println("중간 고사 점수 (20)" + mid);
			System.out.println("기말 고사 점수 (30)" + fin);
			System.out.println("과제 점수 (20)" + home);
			System.out.println("출석 점수 (20)" + atten);
			System.out.println("총점" + sum);
		
			if (sum >= 70 ) {
				System.out.println("pass");
				
			}
			else {
				System.out.println("fail (점수미달)");
			}
			
			
		
			
			
			
			
			
			
			
			
			
		}
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
