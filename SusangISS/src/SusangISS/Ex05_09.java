package SusangISS;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("1~4까지 선택하세요 :");
		a = s.nextInt();
		switch (a) {
		case 1:
			System.out.println(a + "을 선택함.");
			break;

		case 2:
			System.out.println(a + "을선택함.");
			break;
		case 3:
			System.out.println(a + "을선택함.");
			break;
		case 4:
			System.out.println(a + "을선택함.");
			break;
		default:
			System.out.println("이상하네 !!");
			
		}

	}

}
