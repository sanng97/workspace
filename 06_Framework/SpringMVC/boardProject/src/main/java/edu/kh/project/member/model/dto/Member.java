package edu.kh.project.member.model.dto;


// DTO(Date Transfsar Object : 데이터 전달용 객체
// lombok 라이브러리 : DTO 코드 자동완성

// 설정 방법
// 1) mvnrepositoiy에서 lombok -> dependency 추가(pom.xml)
// 2) lombok.jar 파일을 다운로드 받은 후 실행
//    -> cmd->java->jar 경로/lombok.jar




public class Member {

	private String memberEmail;
	private String memberPw;
	private String memberName;
	
	public Member() {}
		
	
	public String getMemberEmail() {
		return memberEmail;
	}


	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}


	public String getMemberPw() {
		return memberPw;
	}


	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public Member(String memberEmail, String memberPw, String memberName) {
		super();
		this.memberEmail = memberEmail;
		this.memberPw = memberPw;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberEmail=" + memberEmail + ", memberPw=" + memberPw + ", memberName=" + memberName + "]";
	}
	
}
