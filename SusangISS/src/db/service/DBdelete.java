package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBdelete {

	public static void doDelete(Map<String, String> pMap) {
		try {
			
			Connection conn = DBConn.getDBConnection();
			
			PreparedStatement pstmt = null;
			
			String sql = "DELETE FROM USER_INFO WHERE USER_ID=?";
			
			/*
			 * sql += "?, "; sql += "?, "; sql += "?, "; sql += "?) ";
			 */
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0;
			
			
			String user_id = pMap.get("user_id");
			System.out.println("전달받은 user_id : " + user_id);
			pstmt.setString(++idx, user_id);
			
			/*
			 * String user_nm = pMap.get("user_nm"); System.out.println("전달받은 user_nm : " +
			 * user_nm); pstmt.setString(++idx, user_nm);
			 * 
			 * String email = pMap.get("email"); System.out.println("전달받은 email : " +
			 * email); pstmt.setString(++idx, email);
			 * 
			 * String addr = pMap.get("addr"); System.out.println("전달받은 addr : " + addr);
			 * pstmt.setString(++idx, addr);
			 */
			
			int res = pstmt.executeUpdate();
			
			if (res > 0) {
				System.out.println("데이터 등록 성공 !");
			} else {
				System.out.println("데이터 등록 실패 !");
			}
			pstmt = null;
			
			DBConn.DBClose(conn);
		} catch (Exception e) {
			System.out.println(e.toString());
			}
			
	}
}

