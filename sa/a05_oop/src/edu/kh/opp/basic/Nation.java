package edu.kh.opp.basic;

public class Nation {
	
	// 국민 정보를 저장할 객체를 위한 클래스(설계도)
	
	String pNo; // 주민번호
    String name; // 이름
    String gender; // 성별
    String address; //주소
    String phone; // 전화번호
    String age; // 나이
    

    // 기능 만들기
    
    public void 납세의의무() {
    	System.out.println("세금내라");
    }
    public void speakKorean() {
    	System.out.println("한국말 잘한다");
    }
    
   public void introduce() {
	   System.out.printf("저의 이름은 %s이고 직업은%s입니다.");
   }
   
   // 캡슐화 적용 : 불투명하게 해서 가리기 ( 정보은닉)
   // private => 비밀
   private String job;
   
   // 캡슐화 원칙에 의해서 직접 접근이 차단된 변수에
   // 값을 세팅하거나 얻어갈수 있는 간접접근기능을 작성
  // this =>  instance (자신을 가르키는 키워드)
   
	public void setJob(String job) {
		
		this.job = job;
	}
	
	
	// Nation 객체가 가지고 있는 job의 값을 호출한 곳으로 돌려보내주는 기능
	
	public  String getJob() {
		return getJob();
	}
	
	

}
