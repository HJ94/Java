package appEx;

/*배열
-같은 자료형의 데이터를 여러개 저장하기 위한 메모리 공간
-생성된 메모리 공간에 index를 이용하여 각 기억장소를 구분함.
-배열크기는 length를 사용하여 구함.abstract

표현
-int[]arr = new int[n];(n개 만큼 0으로 초기화)  -> arr[0] = 1;
-int[]arr = {1, 2, 3};
-int[]arr = new int[] {1, 2, 3};*/

public class ArrayEx {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		System.out.println();

		String[] str = new String[3];

		str[0] = "Hello";
		str[1] = "Hi";
		str[2] = "Good";

		for (int j = 0; j < str.length; j++) {
			System.out.println("str[" + j + "] = " + str[j]);
		}
		
		System.out.println();

		int[] arr2 = { 100, 200, 300};
		
		for(int val : arr2) {
			System.out.println(val);
		}
	}

}
