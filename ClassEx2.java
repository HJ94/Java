package appEx;

//public�� �ϳ��� !! �ΰ� ���� X


public class ClassEx2 {

	public static void main(String[] args) {
		Car car = new Car(); //car ��ü ������ ���ؼ�  (��ü�� ���� �� ���(�޼ҵ�)���� ����� �� �ִ�.)  
		System.out.println("carname : "+car.carname);
		System.out.println("speed : "+car.speed); //��ü ���� ���� ���(��ü ���� ������)
		System.out.println("wheel : "+car.wheel);
		
		car.move(); //�޼ҵ� ��� , �޸� ������ ���� (�׳� ȣ������ ���� ��ü �ȿ� �ִ� �޼ҵ� ȣ���� �޸� ������ �����̴�.)
		System.out.println("speed : "+car.speed);
		car.display();
		
		
		Car car2 = new Car("Ƽ��"); 
		System.out.println("carname : "+car2.carname);
		System.out.println("speed : "+car2.speed);
		System.out.println("wheel : "+car2.wheel);
		car2.display();
		
		Car car3 = new Car("����", 700, 16);
		System.out.println("carname : "+car3.carname);
		System.out.println("speed : "+car3.speed);
		System.out.println("wheel : "+car3.wheel);
		car3.display();

		
	}

}

class Car{
	
	int wheel;
	int speed;
	String carname;
	
	public Car() {
		wheel = 4;
		speed = 100;
		carname = "���佺";
			
	}
	public Car(String name) {
		wheel = 8;
		speed = 500;
		carname = name;//this�� 
	}
	public Car(String name, int s, int n) {
		carname = name;//this�� 
		speed = s;
		wheel = n; 
	}
	
	
	public void move() {
		speed += 100;
	}
	public void display() {
		System.out.println("�� �̸�: " + carname + " / ���� �ӵ� : " + speed + " / ������ : " + wheel);
	}

}