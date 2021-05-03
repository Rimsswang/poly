package SusangISS;
import java.util.Scanner;


public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;

		while (true) { // 난 무한 루프이다.
			System.out.print("첫 번째 입력 값 : ");
			a = sc.nextInt();
			System.out.print("두 번째 입력 값 : ");
			b = sc.nextInt();

			System.out.println("합계 : " + ( a+b));
			
			// 합계가 10보다 크면 나가기
			if ((a+b) > 10) {
				break; 
			}
		}
	}

	
}

