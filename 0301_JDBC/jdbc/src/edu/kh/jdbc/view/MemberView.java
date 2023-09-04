package edu.kh.jdbc.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.jdbc.model.dto.Member;
import edu.kh.jdbc.model.service.MemberService;

public class MemberView {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	private MemberService service = new MemberService();
	
	// alt + shift + j : 툴팁 주석
	/**
	 * 메뉴 출력용 메서드
	 */
	public void displayMenu() {
		
		int input = -1;
		
		do {
			
			try {
				System.out.println("\n--- Member 테이블로 JDBC 연습하기 ---\n");
				
				System.out.println("1. 회원 가입(INSERT)");
				System.out.println("2. 회원 정보 수정(UPDATE)");
				System.out.println("3. 회원 탈퇴 (DELETE)");
				
				System.out.println("4. 비밀번호 변경(UPDATE)");
				// 이메일, 비밀번호, 새 비밀번호를 입력 받아
				// 이메일, 비밀번호가 일치하는 회원의 비밀번호를 
				// 새 비밀번호로 변경
				// 메서드 이름 : updatePw()
				// hint : Member 객체 하나라 안돼요
				//		(비밀번호가 [두개]지요)
				
				
	
				
				input = sc.nextInt();
				
				switch(input) {
				case 1 : insertMember(); break;
				case 2 : updateMember(); break;
				case 3 : deleteMember(); break;
				case 4 : updatePw(); break;
				
				case 0 : System.out.println("\n프로그램 종료\n"); break;
				default : System.out.println("\n메뉴에 작성된 번호만 입력하세요\n");
				}
				
			}catch(InputMismatchException e) {
				System.out.println("\n[잘못된 입력 입니다]\n");
				sc.nextLine(); // 입력 버퍼에 잘못 입력된 문자열 제거
			}
			
		} while(input != 0);
	}
	


	/*
	 * 회원가입 화면
	 */
	
		private void insertMember() {
		
		System.out.println("\n***** 회원 가입 *****\n");
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.println("비밀번호 : ");
		String pw = sc.next();
		
		System.out.println("닉네임 : ");
		String nickname = sc.next();
		
		System.out.println("휴대폰 번호 ");
		String tel = sc.next();
		
		
		System.out.println("주소 : ");
		String address = sc.nextLine();
		
		// 입력 받은 값을 Member 객체에 저장하기
		
		Member member = new Member(email, pw, nickname,tel,address);
		
		// 서비스로 member를 전달한 후 수행 결과 반환 받기
		
		int result = service.insertMember(member); // 1 또는 0
		
		if(result > 0) {
			
			System.out.println("회원가입 성공");

		}else {
			System.out.println("회원가입 실패");
			
		}
		
	}
	
	
		private void updateMember() {
			// TODO Auto-generated method stub
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
}	
