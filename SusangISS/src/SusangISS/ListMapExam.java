package SusangISS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;

public class ListMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap�� �����ϱ� ���� List �÷��� ��ü�� �޸𸮿� ����
		List<HashMap<String, String>> rList = new ArrayList<>();

		// �ռ� ����� rList ������ ������ HashMap ��ü �޸𸮿� ����
		HashMap<String, String> pMap = new HashMap<>();

		pMap.put("name", "������");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "����");
		pMap.put("dept", "����");

		// ������ ������ ����� HashMap ��ü�� List��ü�� ����
		rList.add(pMap);
		
		
		// ������ ������������ ���� ����� ���� HashMap ���� �޸𸮿��� ����
		pMap = null;

		// ȫ�浿 ������ �����ϱ� ���� ���� HashMap ������ ���Ӱ� �޸𸮿� �ø�
		pMap = new HashMap<>();

		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "���");
		pMap.put("dept", "����");

		// ������ ������ ����� HashMap ��ü�� List ��ü�� ����
		rList.add(pMap);
		// ������ ������������ ���� ����� ���� HashMap ���� �޸𸮿��� ����
		pMap = null;
		
		Iterator<HashMap <String, String>> it = rList.iterator();
		while (it.hasNext()){
			HashMap<String, String> rMap = it.next();
			
			System.out.println("#######  �ݺ�����!!! ########");
			System.out.println("name : " + rMap.get("name") );	
			System.out.println("email : " + rMap.get("email")) ;
			System.out.println("addr : " + rMap.get("addr" ) );
			System.out.println("dept :  " + rMap.get("dept"));
			
			
			// HashMap ���� �޸𸮿��� ����
			rMap = null;
			System.out.println("####### �ݺ���!!! #########");
	}
	}
}
