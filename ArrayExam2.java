package appEx;

/*문제1)
int[] scores = {83, 90, 87};

int scores[] = new int[3];
scores[0] = 83;
scores[1] = 90;
scores[2] = 87;

점수의 총합을 구하라*/

public class ArrayExam2 {
	public static void main(String[] args) {

		int scores[] = new int[3];
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 87;

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];

		}
		System.out.println("점수의 총합은 :" + sum);

		double avg = (double) sum / 3;
		System.out.println("점수의 평균은 :" + avg);

		/*
		 * 문제2)
		 * 
		 * int su[] = {3, 6, 4, 7, 10}; 짝수만 출력하시오.
		 */

		System.out.println();
		System.out.println();

		int su[] = { 3, 6, 4, 7, 10 };
		int sums = 0;

		for (int i = 0; i < su.length; i++) {

			if (su[i] % 2 == 0) {
				sums += su[i];
				System.out.println("짝수는 : " + su[i]);

			}
		}
		System.out.println("짝수의 합은 : " + sums);

		System.out.println();
		System.out.println();

//	문제3) 구구단중 3, 7단의 합을 각각 결과배열에 저장하시오.( Ex -  int[ ] result)

		int[] result = new int[2];
		int[] array = { 3, 7 };
		
		int sum1=0, sum2=0;
		int sam = 3;
		int chil = 7;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j <= 9; j++) {
				result[i] += (array[i] * j);

			}
		}
		for (int val : result) {
			System.out.println(val);
		}

		for (int i = 1; i <= 9; i++) {
			sum1 += (sam * i);
			System.out.println(sam * i);
		}
		System.out.println("3단의 합:  " + sum1);

		for (int i = 1; i <= 9; i++) {
			sum2 += (chil * i);
			System.out.println(chil * i);
		}
		System.out.println("7단의 합: " + sum2);

		result[0] = sum1;
		result[1] = sum2;

		for (int val : result) {
			System.out.println(val);
		}

	}
}