package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	public static void main(String[] args) throws SQLException{
Connection conn = null;
String url = "jdbc:oracle:thin:@localhost:1421:ORCL";

String user = "myuser"; //¿À¶óÅ¬ ¾ÆÀÌµğ
String passwd = "12341"; // ¿À¶óÅ¬ ÆĞ½º¿öµå

try {
	Class.forName("Oracle.jdbc.driver.OracleDriveDriverr1");
	conn = DriverManager.getConnection(url, user, passwd);
	
	System.out.println("¿À¶óÅ¬ Á¢¼Ó ¼º°ø!!");
	
} catch (ClassNotFoundException e) {
	System.out.println("¿À¶óÅ¬ Á¢¼Ó ½ÇÆĞ");
	System.out.println("ojbdc6.jar ÆÄÀÏ¿¡ Á¸ÀçÇÏ´Â ÀÚ¹Ù ÆÄÀÏÀ» Ã£Áö ¸øÇÔ");
	System.out.println("ÀÌÀ¯ : "+ e.toString());
} catch (Exception e) {
	System.out.println("¿À¶óÅ¬ Á¢¼Ó ½ÇÆĞ - ­M³ó Exception±îÁö È£ÃâÇÔ");
	System.out.println("ÀÌÀ¯ : " + e.toString());
	} finally {
	if (conn != null) {
		conn.close();
		}
	}
	conn = null;
}
	}
