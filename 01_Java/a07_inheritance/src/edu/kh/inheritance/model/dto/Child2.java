package edu.kh.inheritance.model.dto;




// Parent 클래스를 상속받겠다
// ->Child2가 Parent의 필드 , 메서드를 내부에 포함하게 되어 자신의 것처럼
//   사용
// -> 단, parent의 필드 메서드 중 private 설정된 것을 자식이 다룰 수 없다


public class Child2 extends Parent{
	private String house;
	
	
	//생성자
	public Child2() {
		
		super(); // 상속 관계 시 부모 객체가 먼저 생성되어야 하기 때문에
		         // 자식 생성자 첫 번째 줄에 무조건 작성
		  		 // 단, 미작성 시 컴파일러가 추가
		
		System.out.println("Child2() 기본 생성자로 자식 객체 생성");
	}
	
	public Child2(String house) {
		this.house = house;
		System.out.println("Child2(String) 매개변수 생성자로 자식 객체 생성");
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}
	
	public Child2 (int money, String lastName, String house) {
		
		super(money,lastName);
		this.house = house;
	}
		
		
	@Override // 오버라이딩 문법 검사 (컴파일러가 읽으라고 주석 남김)
	public String toString() {
		// 부모로 부터 상속 받은 멤버(필드,메서드)를 
		// 자식이 자신의 것 처럼 사용 가능
//		setLastName(house);
//		setMoney(10);
//		getMoney();
//		getLastName();

		// 부모의  to String()을 호출하여 반환
		return super.toString() + "/" + house;
		// money + "/"  +lastName
		
		
	}
	
	
	
	
}
