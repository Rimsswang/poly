package SusangISS;

public class Exam_While��_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=1;

		while(i<10) {
			j=1;
			if(i==5 || i==7)
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
