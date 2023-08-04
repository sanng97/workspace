package edu.kh.opp.method;

public class PersonServiceRun {
	
	public static void main(String[] args) {
		
		// personservice 객체 생성 (기본생성자)
		PersonService service = new PersonService();
		
		// PersonService 객체 생성자로 초기화된 title을 얻어와 출력
		
		String title = service.getTitle();
		System.out.println(title);

		
		// PersonService의 createPerson을 이용해서
		Person p1 = service. createPerson();
		// 생성된 person 객체의 주소를 반환 받음
        // 얕은 복사 : 객체 참조 주소만 복사
		
		
		
	}

}
