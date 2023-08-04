package edu.kh.opp.method;

public class Person {

	// 필드 (생성자)
	//private 인스턴스 변수에도
	// 접근할 수 있는 초기화만을 위한 public 메소드가 필요
	private String name;
	private int age;
	private char gender;
	
	// 기본 생성자
	public Person() {
	}
	
	//생성자(constructor)의 이름은 해당 클래스의 이름
	// 매개변수 생성자
	public Person(String name, int age, char gender) { // 오버로딩
		
		this.name =name;
		this.age = age;
		this. gender = gender;

	}
	
	// 메서드 (method):  객체의 기능 반환하고 돌려받는값
	
	// [작성법]
	// [접근제한자] [예약어] 반환형 메서드명 ([매개변수])
	// void : 메서드 수행 후 돌려보내주는 결과가 없음
    // 괄호 안에 자료형 + 변수
	public void setName(String name) {
		
		this. name = name;

	}
	
	public String getName () {
		
		return this.name;

	}
	
	public void setAge(int age) {
		
		
		this.age = age;

	}
	
	public int getAge() {
		
		return this .age;
		
	}
	
	public void setGender(char gender) {
		
		this.gender = gender;
				
	}
	
	public char getGenter( ) {
		
		return gender;
		
	}
	
	
	
	
	
	
	
	
	
}
