package appEx;

import java.util.Scanner;


public class AraayEx3 {
	public static void main(String []args) {
		
		int[][] IntArray = new int[2][2];
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("�迭�� ������ ���� �Է��ϼ��� : ");
		int price = scanner.nextInt();
		System.out.print("����� ȸ�� ��ȣ�� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		
		
		IntArray[0][0] = price;
		IntArray[0][1] = num;

		
		System.out.println("IntArray[0][0]�� ����� ���ڴ� "+ price + "�Դϴ�.");
		System.out.println("IntArray[0][0]�� ����� ȸ�� ��ȣ�� " + num + "�Դϴ�.");
		
	
		
		
		
		

		
		
	}

}
