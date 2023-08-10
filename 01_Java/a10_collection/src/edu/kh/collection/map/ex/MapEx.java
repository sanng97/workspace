package edu.kh.collection.map.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.list.model.dto.Student;

public class MapEx {

	/*
	 * Map : 특정 키워드(key)를 입력하면 해당되는 상세한 값을 얻을 수 있는 컬렉션 객체
	 * 
	 * - K:V 한 쌍으로 데이터를 저장(K:V 한쌍을 몪으서 Entry라고 부름)
	 * 
	 * - Key : 키워드 역할
	 *
	 * 1 ) 중복 X (Key 중복 시 Value를 새로운 내용으로 덮어씌움) * key 역할을 하는 객체에는 equals()
	 * ,hashCode()가 오버라이딩 되어있어야한다
	 * 
	 * 2) 순서 유지 x
	 * 
	 * --> Map에서 key만 묶어 놓으면 Set과 같은 특징을 지님
	 * 
	 * --> value: 키워드에 대응되는 값의 역할
	 * 
	 * 1) key로 인해서 구분됨 -> 중복허용
	 * 
	 * 
	 */

	public void ex1() {

		// key제한, value제한

		Map<Integer, String> map = new HashMap<Integer, String>();

		// 1. map.put(K k, V v) : map에 추가
		// Map에 추가시 K가 중복되면 새로운 v로 덮어 씌우고
		// 이전 v가 반환된다.
		// 중복 아니면 null 반환

		System.out.println(map.put(1, "에그마요"));
		System.out.println(map.put(2, "로스트치킨"));
		System.out.println(map.put(3, "로티세리바비큐"));

		System.out.println(map);

		// 2. V map.get( K k) :
		// map에서 key에 해당하는 value를 반환
		// 일치하는 key가 없으면 null반환

		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));

		// value가 string 이니까 string 변수에 저장
		String s = map.get(1);

		// 3. int map.size() : 저장된 k:v 쌍의 수를 반환

		System.out.println("k:v몇쌍? : " + map.size() + "쌍");

		// 4. V.map.remove(K k) :
		// map에서 key가 일치하는 요소( K:V 쌍)을 제거
		// 제거되는 v반환,없으면 NULL반환
		System.out.println(map.remove(1) + "제거");
		System.out.println(map.remove(9) + "제거");

		// 5.void map.clear() : map다지움
		map.clear();

		// 6 . bollean map.isEmpty() :비었으면true, 아님 false
		System.out.println("비었음? " + map.isEmpty());
	}

	public void ex2() {
		// Map에 저장된 값 순차 접근 (반복해서 순서대로 하나씩 꺼내기)

		// 1. Set map.keySet():
		// key만을 모아놓은 집합(set)을 반환

		Map<String, String> map = new HashMap<String, String>();

		map.put(" 집", "경기도 의정부시");
		map.put("학원", "서울시 중구");
		map.put("스타필드 하남", "경기도 하남시");
		map.put("롯데타워", "서울시 송파구");

		Set<String> set = map.keySet();
		System.out.println(set);

		// 2. keySet을 이용해서 Map에 있는 모든 요소 순차 접근
		for (String key : set) {
			System.out.printf("[%s] %s \n", key, map.get(key));
		}

		// Map은 언제 사용하면 좋을까??

		// 1) 한번에 많은 양의 데이터를
		// 명확하게 구분할 수 있는 형태러
		// 전달해야되는 경우

		// 2) DTO(DATA Transfer Object) : 값 전용 객체
		// DTO가 없거나 , 있어도 사용 빈도가 낮은 경우
		// Map< String, Object> s1 = new HashMap <String, Object>();

	}

	public void ex3() {
		Map<String, Object> s1 = new HashMap<String, Object>();
		s1.put("grade", 3);
		s1.put("ban", 3);
		s1.put("number", 3);
		s1.put("name", "홍길동");
		s1.put("gender", 'M');
		s1.put("score", 75);

		Set<String> set = s1.keySet();

		for (String key : set) {
			System.out.printf("%s : %s \n", key, s1.get(key));
		}
		
		// 	Map과 DTO 비교
		Student s2 = new Student();
		s2.setGrade(2);
		s2.setBan(7);
		s2.setNumber(24);
		s2.setName("김미영");
		s2.setGender('F');
		s2.setScore(80);
		
		// s1, s2의 학년 반 번호 이름만 출력
		System.out.printf("s1 : %d학년 %d반 %d번 %s \n" , s1.get("grade"), s1.get("ban"), s1.get("number"),s1.get("name"));
		
		
		
		System.out.printf("s2 : %d학년 %d반 %d번 %s \n", s2.getGrade(),s2.getBan(),s2.getNumber(),s2.getName());
		
		
		
		
		
		
		
	}

}
