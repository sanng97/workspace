package edu.kh.oop.clas.pack2;

//import 사용 , classtest1 클래스를 가져오는 코드
import edu.kh.oop.cls.pack1.ClassTest1; 

public class TestRun2 {
	
	public static void main(String[] args) {
		
		//ClassTest1 객체 생성
		//  -> 다른 패키지
		
		// -> public은 어디서든 접근가능하는데?
		// -> 패키지가 다른클래스를 접근하고자 할 때
		//    import라는 작업을 해서 가져와 사용
		
		// -> 아 public은 어디서든 접근해 가져와서 사용가능
		
		
		
		ClassTest1 c1 = new ClassTest1();
		
		c1.method1();
		
		//ClassTest2 객체 생성
		ClassTest2 c2 = new ClassTest2();
		// (default) 접근 제한자 : 같은 패키지에서 접근 가능 (확인!)
		// + 같은 패키지는 import 필요없음
		
		c2.method2();
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
