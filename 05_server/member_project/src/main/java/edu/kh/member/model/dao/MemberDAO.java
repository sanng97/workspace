package edu.kh.member.model.dao;

import static edu.kh.member.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.member.model.dto.Member;

// DAO(Database Access Object) : DB와 연결되어 SQL 수행 후 결과 반환 받는 객체
public class MemberDAO {

	private Statement stmt = null; // sql 수행 후 결과 반환 받는 역할
	private PreparedStatement pstmt = null; // Statement + "?"로 sql 쉽게 작성
	private ResultSet rs = null; // 조회 결과 집합 (Result Set) 저장 역할

	// Properties : k,v 모두 string으로 제한된 Map+ 파일 입출력 쉬움
	private Properties prop = null;

	// 기본생성자
	public MemberDAO() {

		// DAO 객체 생성 시 xml 파일(sql)의 내용을 읽어오기
		try {
			String path = MemberDAO.class.getResource("/edu/kh/member/sql/member-sql.xml").getPath();

			prop = new Properties();
			prop.loadFromXML(new FileInputStream(path));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 로그인
	 * 
	 * @param conn
	 * @param id
	 * @param pw
	 * @return 회원 정보 또는 NULL
	 */

	public Member login(Connection conn, String id, String pw) {

		// 1) 결과 저장용 변수 선언
		Member loginMember = null;

		try {

			// 2 ) sql 작성 -> sql 얻어오기
			String sql = prop.getProperty("login");

			// 3) PreparedStatement 객체 생성 (Connection 이용)
			pstmt = conn.prepareStatement(sql);

			// 4) ?에 알맞은 값을 세팅하는 코드
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			// 5) sql(SELECT) 수행 후 결과 (ResultSet)반환받기
			rs = pstmt.executeQuery();

			// 6) 조회 결과를 Member 객체에 옮겨 담기
			if (rs.next()) { // 조회 결과가 1행인 경우 ,if, N행 while
				int memberNo = rs.getInt("MEMBER_NO");
				String memberId = rs.getString("MEMBER_ID");
				String memberName = rs.getString("MEMBER_NAME");
				String gender = rs.getString("GENDER");
				String enrollDate = rs.getString("ENROLL_DATE");

				loginMember = new Member(); // Member 객체 생성

				loginMember.setMemberNo(memberNo);
				loginMember.setMemberId(memberId);
				loginMember.setMemberName(memberName);
				loginMember.setGender(gender);
				loginMember.setEnrollDate(enrollDate);

			}

		} catch (Exception e) {

		} finally {
			// 7) 사용한 JDBC 객체 자원 반환 (생성 역순)
			close(rs);
			close(pstmt);
		}

		return loginMember;
	}

	/**
	 * 회원목록 조회
	 * 
	 * @param conn
	 * @return memberList
	 */

	public List<Member> selectMemberList(Connection conn) {

		// 1) 결과 저장용 변수 생성
		List<Member> memberList = new ArrayList<Member>();

		try {

			// 2)sql 얻어오기 (xml 파일에 작성)

			String sql = prop.getProperty("selectMemberList");

			// 3 ) PreparedStatement 생성
			pstmt = conn.prepareStatement(sql);

			// 4 ) ? 값 세팅 없으면 pass

			// 5) sql 수행(executeQuery()) 후
			// 결과 반환 받기

			rs = pstmt.executeQuery();

			// 6) 조회 결과를 list 에 옮겨담기
			while (rs.next()) {
				int memberNo = rs.getInt("MEMBER_NO");
				String memberId = rs.getString("MEMBER_ID");
				String memberName = rs.getString("MEMBER_NAME");
				String gender = rs.getString("GENDER");
				String enrollDate = rs.getString("ENROLL_DATE");
				String memberPw = rs.getString("MEMBER_PW");

				Member mem = new Member(); // Member 객체 생성

				mem.setMemberNo(memberNo);
				mem.setMemberId(memberId);
				mem.setMemberPw(memberPw);
				mem.setMemberName(memberName);
				mem.setGender(gender);
				mem.setEnrollDate(enrollDate);

				// 리스트 추가
				memberList.add(mem);

			} // while 종료

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 7 )사용한 JDBC 객체 자원 반환
			close(rs);
			close(pstmt);

		}
		return memberList;
	}

	public int signup(Connection conn, Member member) {

		int result = 0;

		try {
			// sql 얻어오기
			String sql = prop.getProperty("signup");

			// PreparesStatement 생성
			pstmt = conn.prepareStatement(sql);

			// ? 알맞은 값 새팅
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getGender());

			// sql(INSERT) 수행(executeUpdate()) 후
			// 결과 ( 성공 행의 개수 (int) )반환 받기
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

}
