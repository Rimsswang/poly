package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	public static void main(String[] args) throws SQLException{
Connection conn = null;
String url = "jdbc:oracle:thin:@localhost:1421:ORCL";

String user = "myuser"; //����Ŭ ���̵�
String passwd = "12341"; // ����Ŭ �н�����

try {
	Class.forName("Oracle.jdbc.driver.OracleDriveDriverr1");
	conn = DriverManager.getConnection(url, user, passwd);
	
	System.out.println("����Ŭ ���� ����!!");
	
} catch (ClassNotFoundException e) {
	System.out.println("����Ŭ ���� ����");
	System.out.println("ojbdc6.jar ���Ͽ� �����ϴ� �ڹ� ������ ã�� ����");
	System.out.println("���� : "+ e.toString());
} catch (Exception e) {
	System.out.println("����Ŭ ���� ���� - �M�� Exception���� ȣ����");
	System.out.println("���� : " + e.toString());
	} finally {
	if (conn != null) {
		conn.close();
		}
	}
	conn = null;
}
	}
