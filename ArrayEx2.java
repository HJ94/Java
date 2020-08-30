package appEx;

/*다차원 배열(array) 행과 열

표현
-int[ ] [ ] arr = new int [n][n];
-int[ ] [ ] arr = {[n, n}
			   , {n, n}
			   , {n, n}};] -3행 2열

2차원 배열을 이용해 회원 정보 저장 가능 
*/

public class ArrayEx2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
		System.out.println("arr[0][0] = " + arr[0][0]);
		System.out.println("arr[0][1] = " + arr[0][1]);
		System.out.println("arr[1][0] = " + arr[1][0]);
		System.out.println("arr[1][1] = " + arr[1][1]);
		System.out.println("arr[2][0] = " + arr[2][0]);
		System.out.println("arr[2][1] = " + arr[2][1]);

		System.out.println();

		for (int i = 0; i < arr.length; i++) { // 행의 길이 -3
			for (int j = 0; j < arr[i].length; j++) { // 2
				System.out.println("arr[ " + i + "] [" + j + " ]  = " + +arr[i][j]);

			}
		}
		System.out.println();

		int[][] arr2 = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		System.out.println("arr2[0][0] = " + arr2[0][0]);
		System.out.println("arr2[0][1] = " + arr2[0][1]);
		System.out.println("arr2[1][0] = " + arr2[1][0]);
		System.out.println("arr2[1][1] = " + arr2[1][1]);
		System.out.println("arr2[2][0] = " + arr2[2][0]);
		System.out.println("arr2[2][1] = " + arr2[2][1]);

		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println("arr2[ " + i + "][" + j + "] = " + arr2[i][j]);
			}
		}

		System.out.println();

		/* 문자열로 된 2차원 배열 만들기 */

//		String [][] array = new String[3][3];	
//		array[0][0] = "A";
//		array[0][1] = "B";
//		array[0][2] = "C";
//		array[1][0] = "D";
//		array[1][1] = "E";
//		array[1][2] = "F";
//		array[2][0] = "G";
//		array[2][1] = "H";
//		array[2][2] = "I";

		String[][] str = { { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H", "I" } };

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println("str[" + i + "] [" + j + "]  = " + str[i][j]);

			}
		}
		System.out.println();
		/*
		 * 문제) 총합과 평균 int [] [] array = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}
		 (**각각의 최댓값 구해보기)
		 * };
		 */

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		int max = 0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count ++;
				
				
				if (array[i][j] > max) {
					max = array[i][j];
				}
			
			}
		}
		System.out.println("총 합은:  " + sum);
		System.out.println("평균은 : " + sum / count);
		System.out.println("최고값은 : " + max);
		System.out.println("배열의 총 개수 : " + count);
		
		System.out.println();
//		문제2) 최대값 출력
		
		int maxs = 0;
		int [ ] array2 = {1, 5, 3, 8, 2};
		
		for(int i=0; i < array2.length; i++) {
			if(array2[i]  > maxs) {
				maxs = array2[i];
			}
		}
		System.out.println("배열의 최대값은 : " + maxs);
		}
}
