package Prac;

//������, ��ü ����, ������ �����ε�


public class ConstroctorPrac2 {

	public static void main(String[] args) {
		Kia kia = new Kia();
		
		kia.display();
		
		Kia kia2 = new Kia("����Ƽ��");
		kia2.price = 1500;
		kia2.display();
	
		Kia kia3 = new Kia("ī�Ϲ�" , 180);
		kia3.display();
		
	}

}

class Kia{
	
	String name = "���佺";
	int maxspeed = 200;
	int price = 1000;


	public Kia() {
	}
	public Kia(String n) {
		name = n;
	}
	public Kia(String n, int m) {
		name = n;
		maxspeed = m;
	}
	
	
	public void display() {
		System.out.println("�� �̸� : " + name + " / �ְ� �ӷ� : " + maxspeed + " / �� ���� : " + price);
	}

}



