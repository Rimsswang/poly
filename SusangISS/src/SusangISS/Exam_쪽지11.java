package SusangISS;

import java.util.ArrayList;
import java.util.List;
import javax.print.DocFlavor.STRING;

public class Exam_����11 {

	public static void main(String[] args) {
		// TODO Auto-geSTRINGd method stub
		List<String> rList = new ArrayList<>();
		rList.add("��ü�������α׷���");
		rList.add("�ϵ�");
		rList.add("MangoDB");
		int i = 0;
		while (i < rList.size()) {
			if (i == 0) {
				System.out.print("<");
				System.out.print(rList.get(i));
				System.out.println(">");
			} else {
				System.out.println(rList.get(i));
			}
			i++;
		}
	}
}