package edu.kh.poly.run;

import edu.kh.poly.model.dto.Car;
import edu.kh.poly.model.dto.Porsche;
import edu.kh.poly.model.dto.Spark;

public class CarRun {
	
public static void main(String[] args) {
	
	//선수 지식
	// 1. 컴퓨터의 값 처리 원칙
	// -> 같은 자료형 끼리만 연산 가능, 연산 결과도 같은 자료형
	
	// 2. 상속 메모리 구조
	// -> 자식 객체 생성 시
	//    부모 객체가 먼저 생성되고
	//    그 부모를 자식객체가 포함하는 형태(감싸고 있는 형태)  
	
	
	//import 자동완성 : ctrl +shift +o
	
	// 부모 참조 변수 = 부모 객체 생성
	Car c1 = new Car();
	
	// 자식 참조 변수 = 자식 객체 생성
	Porsche p1 = new Porsche();
	Spark s1 = new Spark();
	
	// * 다형성 (업캐스팅) ! *
	
	// 부모 참조 변수 = 자식 객체 생성
	
	Car c2 = new Porsche();
	
	// -> 컴퓨터의 값 처리 원칙이 위배 된걸로 보임
	
	// c2 부모 타입 참조 변수가
	// 자식 타입의 객체를 참조하게 되면
	// 자식 내 부모 부문만 참조가 가능하다
	
	// * c2가 자식 객체를 참조하고 있지만
	//   부모 객체만 바라보고 있으므로
	//  c2가 car 객체를 참조하고 있는것처럼느껴짐
	//  ->  자식 porsche가 car로 변한것 처럼 느껴짐
	//   -> 자식이 부모로 변했다 -> up Casting
	
	
	// c2.setOpenTheDoor(true);
	c2.setWheel(4);
	
	System.out.println("업캐스팅 확인");
	// 다형성 업캐스팅
	// - 부모 타입 참조 변수로 자식 타입의 객체를 참조하는 것
	
	// - 참조하는 자식 객체 중 부모 부분만 참조
	// 1. 다형성과 객체 배열
	Car[]carArr = new Car[3];
	              // Car(부모) 객체 참조 변수 3개의 묶음
	
	// 부모 = 부모
	carArr[0] = new Car(4,5,"경유");
	
	// 부모 = 자식 (부모처럼 바뀌는걸로 보임) (업캐스팅)
	carArr[1] = new Porsche(4 ,2, "고급휘발유", true);
	
	// 부모 = 자식 (부모처럼 바뀌는걸로 보임) (업캐스팅)
	carArr[2] = new Spark (4, 4, "휘발유", 0.5);
	
	for(int i =0; i<carArr.length; i++) {
		System.out.printf("%d / %d / %s \n",
				carArr[i].getWheel(),
				carArr[i].getSeat(),
				carArr[i].getFuel());
	}
	
	
	
	
	
	
	
}
	
}
