package SusangISS;
import java.util.Scanner;


public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;

		while (true) { // �� ���� �����̴�.
			System.out.print("ù ��° �Է� �� : ");
			a = sc.nextInt();
			System.out.print("�� ��° �Է� �� : ");
			b = sc.nextInt();

			System.out.println("�հ� : " + ( a+b));
			
			// �հ谡 10���� ũ�� ������
			if ((a+b) > 10) {
				break; 
			}
		}
	}

	
}

