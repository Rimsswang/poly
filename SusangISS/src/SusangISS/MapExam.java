package SusangISS;

import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap ������Ÿ�� ���ǽ� Ű�� ���� ����� ������ Ÿ���� �����ϸ�, �޸𸮿� �ø�
		Map<String, String> pMap = new HashMap<>();

		// Ű�� ���� ������ ������ �߰��ϱ�
		pMap.put("name", "������");
		pMap.put("email", "hglee67@kopo.ac.kr");
		pMap.put("dept", "�����ͺм���");
		pMap.put("dept", "������?");

		// ������ �ҷ�����
		System.out.println("----------------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("��Ÿ"));
		System.out.println("----------------------------");
	}

	
	
}
