package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBupdate {
   public void doUpdate(Map<String, String> pMap) {

      try {

         Connection conn = DBConn.getDBConnection();

         PreparedStatement pstmt = null;

         String sql = "UPDATE USER_INFO SET USER_NM=?, EMAIL=?, ADDR=? WHERE USER_ID=?";

         /*
          * sql +="?, "; sql +="?, "; sql +="?, "; sql +="?) ";
          */

         System.out.println(sql);

         pstmt = conn.prepareStatement(sql);

         int idx = 0;

         String user_nm = pMap.get("user_nm").trim();
         System.out.println("1���޹��� user_nm : " + user_nm);
         pstmt.setString(++idx, user_nm);

         String email = pMap.get("email").trim();
         System.out.println("1���޹��� email : " + email);
         pstmt.setString(++idx, email);

         String addr = pMap.get("addr").trim();
         System.out.println("1���޹��� addr : " + addr);
         pstmt.setString(++idx, addr);

         String user_id = pMap.get("user_id").trim();
         System.out.println("���޹��� user_id : " + user_id);
         pstmt.setString(++idx, user_id);

         int res = pstmt.executeUpdate();

         if (res > 0) {
            System.out.println("������ ��� ����!");
         } else {
            System.out.println("������ ��� ����!");
         }
         pstmt = null;

         DBConn.DBClose(conn);

      } catch (Exception e) {

         System.out.println(e.toString());
      }
   }
}