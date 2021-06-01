package SusangISS;

import java.util.ArrayList;
import java.util.List;
import javax.print.DocFlavor.STRING;

public class Exam_쪽지11 {

	public static void main(String[] args) {
		// TODO Auto-geSTRINGd method stub
		List<String> rList = new ArrayList<>();
		rList.add("객체지향프로그래밍");
		rList.add("하둡");
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