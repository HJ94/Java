package appEx;

/*����1)
int[] scores = {83, 90, 87};

int scores[] = new int[3];
scores[0] = 83;
scores[1] = 90;
scores[2] = 87;

������ ������ ���϶�*/

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
		System.out.println("������ ������ :" + sum);

		double avg = (double) sum / 3;
		System.out.println("������ ����� :" + avg);

		/*
		 * ����2)
		 * 
		 * int su[] = {3, 6, 4, 7, 10}; ¦���� ����Ͻÿ�.
		 */

		System.out.println();
		System.out.println();

		int su[] = { 3, 6, 4, 7, 10 };
		int sums = 0;

		for (int i = 0; i < su.length; i++) {

			if (su[i] % 2 == 0) {
				sums += su[i];
				System.out.println("¦���� : " + su[i]);

			}
		}
		System.out.println("¦���� ���� : " + sums);

		System.out.println();
		System.out.println();

//	����3) �������� 3, 7���� ���� ���� ����迭�� �����Ͻÿ�.( Ex -  int[ ] result)

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
		System.out.println("3���� ��:  " + sum1);

		for (int i = 1; i <= 9; i++) {
			sum2 += (chil * i);
			System.out.println(chil * i);
		}
		System.out.println("7���� ��: " + sum2);

		result[0] = sum1;
		result[1] = sum2;

		for (int val : result) {
			System.out.println(val);
		}

	}
}