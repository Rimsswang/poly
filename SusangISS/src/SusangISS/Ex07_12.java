package SusangISS;

public class Ex07_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i = 0;
		while (true) {
			// for(;;) {
			for(i = 1; i <= 100; i++) {
				hap += i;

				if (hap > 2000) 
				{
					System.out.println("�հ� : " + hap);
					hap =0;
					//break;
					return;			
				}
			}
			System.out.println("������ �ݺ���...");
		
		}
	}
}
