package edu.kh.opp.basic;

public class BasicRun {
	
	// 객체 ( 속성, 기능) 정의
	// class에 정의된 내용대로 Heap 메모리에 생성하면 객체가됨
	// class를 이용해 여러 객체를 만듬
	
	public static void main(String[] args) {
		
	// Nation 이라는 객체 생성
		Nation n1 = new Nation();
	
		
	   n1.납세의의무();
	   n1.speakKorean();
	
	   n1.pNo="979797-979797";
	   n1.name="빵빵이";
	   n1.gender = "여자";
	   n1.address = "서울시 부대찌개동";
	   n1.phone = "010-1515-7878";
	   n1.age = "24";
	   
		
	// 객체에 저장된 속성 출력
			System.out.println(n1.pNo);
			System.out.println(n1.name);
			System.out.println(n1.gender);
			System.out.println(n1.address);
			System.out.println(n1.phone);
			System.out.println(n1.age);
		
		
	// 캡슐화 적용 확인!	
    // private String job; 에 값 대입하기
	
    /* 간접 접근 기능 */
		n1.setJob("개발자");
		
		System.out.println( n1.getJob() );
		
		n1.introduce();
		
		
		
		
		
		
	}

}
