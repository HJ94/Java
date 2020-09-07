package appEx;

public class MethodEx3 {

	
	// 문제1) dan1, dan2를 args로 만들어 사용(method)
	public static void methodA(int dan1, int dan2) {
	
		for(int j= dan1; j<=dan2; j++) {
		for(int i =1; i < 10; i++) {
			System.out.println(j + " * " + i + " = " + (j*i));
			}
		System.out.println();
		}
	}	


	
	//배열을 이용하여 원하는 단 출력
	/*
	 * for(int i=0; i<array.length; i++) { for(int j=1; j<10; j++) {
	 * System.out.print(array[i] + " * " + j + " = " + (array[i]*j) + j + "\t"); }
	 * System.out.println(); }
	 */
	
	
	public static void main(String[] args){
		methodA(2,7);

	}
	


}
