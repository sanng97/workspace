package edu.kh.test.model.dao;

import static edu.kh.test.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.kh.test.model.dto.ShopMember;

public class ShopDAO {

	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public ShopMember selectMember (Connection conn, String memberId
			) {
		
		ShopMember sm = null;
		
		try {
			
			String sql = "SELECT * FROM GHOP_MEMBER WHERE MEMBER_ID = ? +"
					+ "MEMBER_PW";
			
			pstmt = conn.prepareStatement(sql);
			
			if(rs.next()) {
				String id = rs.getString("MEMBER_ID");
				String pw = rs.getString("MEMBER_PW");
				String phone = rs.getString("PHONE");
				String gender = rs.getString("성별");
			}
			
			
			

		} catch (Exception e) {
		
			e.printStackTrace();
			
			
			
		}finally {
			
			close(conn);
		}
		return sm;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



