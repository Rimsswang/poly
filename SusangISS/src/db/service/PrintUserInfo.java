package db.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PrintUserInfo {

	public static void main(String[] args) throws SQLException {

		DBUserInfo ui = new DBUserInfo();
		
		List<Map<String, String>> rList = ui.getUserInfo();
		
		if (rList == null) {
			rList = new ArrayList<Map<String, String>>();
		}
		
		System.out.println("---------------------------------");
		System.out.println("ui.getUserInfo() 함수로부터 전달받은 회원 정보 출력합니다.");
		System.out.println("---------------------------------");
		
		Iterator<Map<String, String>> it = rList.iterator();
		
		while (it.hasNext()) {
			
			Map<String, String> rMap = it.next();
			
			if (rMap == null) { 
				rMap = new HashMap<String, String>();
			}
			
			
			System.out.println("회원아이디(user_id) : " + rMap.get("user_id"));
			System.out.println("회원이름(user_nm : " + rMap.get("user_nm"));
			System.out.println("이메일(email) : " + rMap.get("email"));
			System.out.println("주소(addr) : " + rMap.get("addr"));
			System.out.println("가입일(reg_dt) : " + rMap.get("redg_dt"));
			System.out.println("----------------------------------------");
			
			rMap = null;
		}
		
		rList = null;
		
	}
}