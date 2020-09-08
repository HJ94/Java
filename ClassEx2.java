package appEx;

//public은 하나만 !! 두개 존재 X


public class ClassEx2 {

	public static void main(String[] args) {
		Car car = new Car(); //car 객체 생성을 통해서  (객체는 변수 와 기능(메소드)으로 얘기할 수 있다.)  
		System.out.println("carname : "+car.carname);
		System.out.println("speed : "+car.speed); //객체 참조 변수 사용(객체 접근 연산자)
		System.out.println("wheel : "+car.wheel);
		
		car.move(); //메소드 사용 , 메모리 영역의 차이 (그냥 호출했을 때와 객체 안에 있는 메소드 호출은 메모리 영역의 차이이다.)
		System.out.println("speed : "+car.speed);
		car.display();
		
		
		Car car2 = new Car("티코"); 
		System.out.println("carname : "+car2.carname);
		System.out.println("speed : "+car2.speed);
		System.out.println("wheel : "+car2.wheel);
		car2.display();
		
		Car car3 = new Car("봉고", 700, 16);
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
		carname = "셀토스";
			
	}
	public Car(String name) {
		wheel = 8;
		speed = 500;
		carname = name;//this는 
	}
	public Car(String name, int s, int n) {
		carname = name;//this는 
		speed = s;
		wheel = n; 
	}
	
	
	public void move() {
		speed += 100;
	}
	public void display() {
		System.out.println("차 이름: " + carname + " / 현재 속도 : " + speed + " / 바퀴수 : " + wheel);
	}

}