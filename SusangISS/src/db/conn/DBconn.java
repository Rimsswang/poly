package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	public static void main(String[] args) throws SQLException{
Connection conn = null;
String url = "jdbc:oracle:thin:@localhost:1421:ORCL";

String user = "myuser"; //오라클 아이디
String passwd = "12341"; // 오라클 패스워드

try {
	Class.forName("Oracle.jdbc.driver.OracleDriveDriverr1");
	conn = DriverManager.getConnection(url, user, passwd);
	
	System.out.println("오라클 접속 성공!!");
	
} catch (ClassNotFoundException e) {
	System.out.println("오라클 접속 실패");
	System.out.println("ojbdc6.jar 파일에 존재하는 자바 파일을 찾지 못함");
	System.out.println("이유 : "+ e.toString());
} catch (Exception e) {
	System.out.println("오라클 접속 실패 - 쵲농 Exception까지 호출함");
	System.out.println("이유 : " + e.toString());
	} finally {
	if (conn != null) {
		conn.close();
		}
	}
	conn = null;
}
	}
