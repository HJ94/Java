package appEx;


//����1) �־��� �迭�� �� Ȧ������ ����Ͻÿ�
// int array [] = {2, 5, 7, 3};
public class MethodEx4 {

	public static void main(String[] args) {
		int [] array = {2, 5, 7, 3};
		
		method(array);

	}
	
	public static void method(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=1; j<10; j++) {
				if(array[i] % 2 == 1) {
				System.out.println(array[i] + " * " + j + " = " + (array[i] * j));
			}
				
		}System.out.println();
	}
	}
}
