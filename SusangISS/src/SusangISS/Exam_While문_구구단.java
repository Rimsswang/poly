package SusangISS;

public class Exam_While��_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		
		while(i<9) {
			int j=1;
			if(i==3 || i==5)
			System.out.println(i+"[��] : ");
			while(j<10) {
			  System.out.println(i + "*" + j + "=" + (i*j));
		      j++;
			}
			System.out.println();
			i++;
		}
	}

}
