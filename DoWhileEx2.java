package appEx;

public class DoWhileEx2 {

	public static void main(String[] args) {
		int a=7, b=1, c;
		
		do {
			c= a*b;
			System.out.println(a + "x" + b +"=" + c);
			b++;
		}while(b<=9);

	}

}
