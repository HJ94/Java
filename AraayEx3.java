package appEx;

import java.util.Scanner;


public class AraayEx3 {
	public static void main(String []args) {
		
		int[][] IntArray = new int[2][2];
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("배열에 저장할 수를 입력하세요 : ");
		int price = scanner.nextInt();
		System.out.print("사용할 회원 번호를 입력하세요 : ");
		int num = scanner.nextInt();
		
		
		IntArray[0][0] = price;
		IntArray[0][1] = num;

		
		System.out.println("IntArray[0][0]에 저장된 숫자는 "+ price + "입니다.");
		System.out.println("IntArray[0][0]에 저장된 회원 번호는 " + num + "입니다.");
		
	
		
		
		
		

		
		
	}

}
