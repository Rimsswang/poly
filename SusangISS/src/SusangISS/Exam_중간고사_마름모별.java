package SusangISS;

public class Exam_중간고사_마름모별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 1;
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b < k + 2 * n - 1; b++) {
				if (b < k)
					System.out.print(" ");
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (a < 3) {
				k--;
				n++;
			} else {
				k++;
				n--;
			}
		}

		
	}
}
