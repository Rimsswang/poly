package SusangISS;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 함수 시작");

		int res = sum(4, 6);
		System.out.println("Res :  " + res);

		System.out.println("main 함수 끝");
	}

	public static int sum(int i1, int i2) {
		System.out.println("sum 함수 시작");
		int sum = 0;

		for (int i = i1; i <= i2; i++) {
			sum += i;
		}
		System.out.println("sum 함수 끝");	
		return sum;
	}
}