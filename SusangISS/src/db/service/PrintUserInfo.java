package db.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintUserInfo {

	public static void main(String[] args) throws SQLException {

		Map<String, String> pMap = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------");
		System.out.print("회원아이디를 입력하시오 : ");
		pMap.put("user_id", sc.next());
		
		/*
		 * System.out.println("-----------------------------------------------------");
		 * System.out.print("회원이름을 입력하시오 : "); pMap.put("user_nm", sc.next());
		 * 
		 * System.out.println("-----------------------------------------------------");
		 * System.out.print("이메일을 입력하시오 : "); pMap.put("email", sc.next());
		 * 
		 * System.out.println("-----------------------------------------------------");
		 * System.out.print("주소를 입력하시오 : "); pMap.put("addr", sc.next());
		 */
		
		sc.close();
		
		  //DBinsert dbI = new DBinsert();
	      //DBdelete dbI = new DBdelete();
	      DBupdate dbI = new DBupdate();
	      
	      dbI.doUpdate(pMap);
	      //dbI.doInsert(pMap);
	      //dbI.doDelete(pMap);
		
		pMap = null;
		
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