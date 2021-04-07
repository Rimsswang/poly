package SusangISS;

public class Ex06_08 {
	int a = 0; // 난 클래스 전체에서 사용되는 변수 (전역변수)

	public static void main(String[] args) {
		int hap = 0;
		int i; // Main 함수 실행되는 동안만 살아있는 변수

		for (i = 1; i <= 10; i++) {
			hap = hap + i;
			int b = 0; // for문 한번 돌 때만 살아있는 변수
		
		}
		System.out.println("1부터 10까지 합 :" + hap);
	}

}
