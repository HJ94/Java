package appEx;

/*�迭
-���� �ڷ����� �����͸� ������ �����ϱ� ���� �޸� ����
-������ �޸� ������ index�� �̿��Ͽ� �� �����Ҹ� ������.
-�迭ũ��� length�� ����Ͽ� ����.abstract

ǥ��
-int[]arr = new int[n];(n�� ��ŭ 0���� �ʱ�ȭ)  -> arr[0] = 1;
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
