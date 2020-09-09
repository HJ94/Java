package Prac;

//생성자, 객체 생성, 생성자 오버로딩


public class ConstroctorPrac2 {

	public static void main(String[] args) {
		Kia kia = new Kia();
		
		kia.display();
		
		Kia kia2 = new Kia("스포티지");
		kia2.price = 1500;
		kia2.display();
	
		Kia kia3 = new Kia("카니발" , 180);
		kia3.display();
		
	}

}

class Kia{
	
	String name = "셀토스";
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
		System.out.println("차 이름 : " + name + " / 최고 속력 : " + maxspeed + " / 차 가격 : " + price);
	}

}



