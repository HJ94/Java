package appEx;

/*문제) int dan[] = { 3, 7, 9}; 배열범위 구구단을 출력*/

public class ArrayExam {

	public static void main(String[] args) {

		int dan[] = { 3, 7, 9 };
		int d = dan[0];

		/*
		 * for (int i = 1; i <= 9; i++) { System.out.println(d + " * " + i + " = " + (d
		 * * i)); }
		 * 
		 * System.out.println();
		 * 
		 * int d1 = dan[1]; for (int j = 1; j <= 9; j++) { System.out.println(d1 + " * "
		 * + j + " = " + (d1 * j)); }
		 * 
		 * System.out.println();
		 * 
		 * int d2 = dan[2]; for(int x =1 ; x<=9; x++) { System.out.println(d2 + " * " +
		 * x + " = " + (d2 * x)); }
		 */

		for (int j = 0; j < dan.length; j++) {
			for (int x = 1; x <= 9; x++) {
				System.out.println((dan[j] * x));
			}
		}

	}

}
