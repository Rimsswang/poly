package SusangISS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Exam_����12 {

	public static void main(String[] args) {
		List<HashMap<String, String>> rList = new ArrayList<>();

		HashMap<String, String> pMap = new HashMap<>();

		pMap.put("name", "������");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "����");

		rList.add(pMap);

		pMap = null;

		pMap = new HashMap<>();

		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "���");

		rList.add(pMap);

		pMap = null;

		Iterator<HashMap<String, String>> it = rList.iterator();
		while (it.hasNext()) {
			HashMap<String, String> rMap = it.next();

			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println();}
	}

}
