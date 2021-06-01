package SusangISS;

public class Ex_배열쪽지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = new int[10];
for (int i= 0; i < 10; i++) {
	num[i] = ((i+1)*10);
}
int i=0;
while(i<10) {
	System.out.println("num["+ i + "]" + num[i]);
	i++;

}
	}

}
