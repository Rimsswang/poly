package SusangISS;

import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int menu = 0;
		
		do {
			System.out.println("�մ� �ֹ� �Ͻðڽ��ϱ�? ");
			System.out.println("1, ī���2, īǪġ��3, �Ƹ޸�ī��4, �׸���ų����.");
			
			menu = s.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("ī��� �ֹ��ϰڽ��ϴ�.");
			break;
			case 2 :
				System.out.println("īǪġ�� �ֹ��ϰڽ��ϴ�.");
			break;
			case 3 :
				System.out.println("�Ƹ޸�ī�� �ֹ��ϰڽ��ϴ�.");
			break;
			case 4 :
				System.out.println("�ֹ��Ͻ� Ŀ�Ǹ� �غ��ϰڽ��ϴ�.");
			break;
			default:
				System.out.println("�߸� �ֹ��ϼ̽��ϴ�.");
			
			}
			
			
		} while (menu !=4);
		
	
	
	}
}
