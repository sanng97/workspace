package edu.kh.jdbc.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {
public static void main(String[] args) {
	
	// 입력 받은 최소급여 보다 많이 받고(이상)
	
	// 입력 받은 최고 급여보단 적게 받는(이하)
	
	// 사원의 사번, 이름, 급여를 급여 내림차순 조회
	
	//[실행화면]
	// 최소 급여 : 1000000
	// 최대 급여 : 3000000
	
	// 사번 / 이름 / 급여
	
	// 1. JDBC 객체 참조 변수 선언
	Connection conn = null;
	
	Statement stmt = null;
	
	ResultSet rs = null;
	
	try {
		// JDBC Driver 객체를 메모리에 로드하기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// DB 연결 정보를 이용해서 Connection 객체 생성
		
		String type = "jdbc:oracle:thin:@"; // 드라이버 종류
		
		String host = "115.90.212.20"; // DB 서버 컴퓨터 IP주소
		
		String port = ":10000"; // DB 서버 컴퓨터 내에서 DB프로그램 번호
		
		String dbName = ":ORCL"; // DB 이름
		
		String userName = "a230724_pse"; //사용자 계정
		
		String pw = "i5frnzxy"; // 비밀번호
		
		
		conn =DriverManager.getConnection(type+host+port+dbName,userName,pw);
		
		// 3. SQL 작성 , 마지막 세미콜론 제외
		String sql = "SELECT EMP_ID, EMP_NAME, SALARY ,JOB_NAME"
				+"FROM EMPLOYEE "
				+"JOIN JOB USING(JOB_CODE)"
				+"WHERE SALARY <= 1000000 AND SALARY >= 3000000"
				+"ORDER BY SALARY DESC";
		
		// 4. Statement 객체 생성
		// - SQL을 DB로 가져다주고, 결과를 다시 JAVA로 가져오는 객체
		stmt = conn.createStatement();
		
		// 5. Statement 객체를 이용해서 SQL 수행 후 결과 반환 받기
		rs = stmt.executeQuery(sql);
		
		//6 .SQL(SELECT) 결과가 담겨있는 ResultSet(rs)를
		// 한 행씩 반복 접근하며 각 행의 컬럼값을 얻어와 출력
		while(rs.next()) {
			
			// 지정된 컬럼의 값을 java 자료형으로 변환해서 얻어오기
			
			String empld = rs.getString("EMP_ID");
			String empName = rs.getString("EMP_NAME");
			int salary = rs.getInt("SALARY");
			
			System.out.printf("사번 : %s / 이름 : %s / 급여 : %d",empld,empName,salary);
			
			
		} // while문 종료
		

	} catch (SQLException e) {
		// SQLException :  JDBC 관련 예외의 최상위 부모
		
		e.printStackTrace();
	} catch(ClassNotFoundException e) {
		
		e.printStackTrace();

	}finally {
		
		// 7. 사용한 JDBC객체 자원 반환 (역순으로)
		try {
			
		} catch (Excep) {
			// TODO: handle exception
		}
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
