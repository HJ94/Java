package appEx;

class X{
	protected int i = 10;
	protected String msg = " I am an X.";
	
	public void print() {
		System.out.println(msg);
	}
	
	public void play() {
		System.out.println("Play.." + msg);
	}
}

class Y extends X{
	protected int i = 20;
	protected String msg = "I am an Y.";


	@Override
	public void print() {
		System.out.println(msg);
	}

}
public class Z extends Y {
	protected int i = 30;
	protected String msg = "I am a Z.";
	
	public void print() {
		System.out.println(msg);
	}
	public void play() {
		System.out.println("Play.." + msg);
	}
	public void doZ() {
		System.out.println("do something in Z");
	}
	public void test(int i) {
		Z z = new Z();
		Y y = z; //부모의 타입으로 자동 형 변환 
		X x = z;
		
		
		
		//문제
		z.print(); //I am an Z. , I am an X. (지역변수가 우선이다)
		y.print(); //I am an Y. , I am an Y.
		x.print(); //I am an X. , I am an Z.
		
		
		super.print();   // I am an X. 가까운게 우선이다. 바로 위 상위 클래스에 없으면 그 위에 상위 클래스로! (없으면 위로 올라간다!)
		play();		     // Play..I am a Z.  <-this가 생략되어있다.
		super.play();	 // Play..I am an X.
		//y.doZ();
		
		System.out.println("\ni =" + i);  //i = 
		System.out.println("this.i =" + this.i);
		System.out.println("super.i =" + super.i);
		System.out.println("y.i =" + y.i);  //부모 클래스의 i는 은닉이 되어진다.
		System.out.println("x.i =" + x.i);
		System.out.println("((y)this).i = " + ((Y)this).i);
		System.out.println("((x)this).i = " + ((X)this).i);
		
		
		
	}




	public static void main(String[] args) {
		Z z = new Z();
		z.test(15);
	}

}
