package SusangISS;

public class Exam_StarR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 1;
		for (int a = 1; a <= 9; a++) {
			for (int c = 1; c <= 5; c++) {
				if (c <= b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (a < 5) {
				b++;
			} else {
				b--;
			}
			System.out.println();
		}

		
	}

}
