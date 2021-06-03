package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.conn.DBConn;

public class DBSelect {

   public static void main(String[] args) throws SQLException {
      
      Connection conn = DBConn.getDBConnection();
      
      PreparedStatement pstmt = null;
      
      String sql = "SELECT COUNT(1) AS CNT FROM USER_INFO";
      
      pstmt = conn.prepareStatement(sql);
      
      ResultSet rs = pstmt.executeQuery(sql);
      
      if(rs.next() ) {
         String cnt = rs.getString("CNT");
         System.out.println("회원가입한 수 CNT : " + cnt);
      }
      rs.close();
      
      DBConn.DBClose(conn);
   }
   

}