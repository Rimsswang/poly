
package SusangISS;

class Car2 {
	private String color;
	private int speed;

	Car2() {
		color = "����";
		speed = 0;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
}

public class Ex11_06 {
	public static void main(String[] args) {
		Car2 myCar1 = new Car2();
		Car2 myCar2 = new Car2();

		System.out.println("�ڵ���1�� ������ " + myCar1.getColor() + "�̸�, ����ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ���2�� ������ " + myCar2.getColor() + "�̸�, ����ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");
		
		
	}
}
