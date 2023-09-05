package edu.kh.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class MemberDAO {

// DAO : 데이터베이스 접근 객체	
// JDBC를 이용해서 DB에 SQL을 전달하여 수행 후 결과를 반환받는 역할
	public static void main(String[] args) {
		
		//필드
		// JDBC 객체 참조 변수 선언 (connection은 service에서 생성 -> 제외)
		private Statement stmt = null;
		private ResultSet ts = null;
		
		// PreparedStatement 준비된 Statement
		// 외부 변수 값을 sql에 받아들일 준비가 되어있는  Statement
		// 성능과 속도면에서 우위를 가지고 있음
		// -> ? placeholder : 변수를 위치시킬 자리지정
		
		private PreparedStatement pstmt = null;
		
		/*
		 * 회원가입
		 */
		
		public int insertMember(Connection conn, Member member) {
			
		// DAO 작성법
		// 1. 최종결과를 저장할 변수선언 또는 객체생성
			int result = 0;
		
		// 2. sql 작성
			// PreparedStatement용 sql작성
			String sql
			= "INSERT INTO MEMBER "
					+ "VALUES(SEQ_MEMBER_NO.NEXTVAL, ?, ?, ?, ?, ?, DEFAULT, DEFAULT)";
			
		try {
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, member.getMemberEmail());
			pstmt.setString(2, member.getMemberPw);
			pstmt.setString(3, member.getMemberNickname());
			pstmt.setString(4, member.getMemberTel());
			pstmt.setString(5, member.getMemberAddress());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}	
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
