package appEx;

//오버로드는 생성자를 다양하게 생성자를 사용(생성)할 수 있게 만들어 놓은 것.
//생성자(변수의 초기화 목적)
//생성자의 이름과 클래스의 이름은 동일하다.(객체가 생성되어지면 생성자는 생성되어진다.)

public class ConstructorEx {
	int a;
	
	public ConstructorEx() {  //생성자 생성 , 메소드처럼 인자 사용가능(리턴 X)
		a = 10;
		//System.out.println("생성자 실행");
	}
	public ConstructorEx(int a) {
		a=50;
	}
	
	public ConstructorEx(String a) {
		//a=50;
	}
	
	public void a() {}
	public void a(int a) {}
	public void a(String a) {}
	
	
	public static void main(String[] args) {
		ConstructorEx obj1 = new ConstructorEx();
		ConstructorEx obj2 = new ConstructorEx(10);
		ConstructorEx obj3 = new ConstructorEx("A");
	}

}
