package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산2 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			int a = sc.nextInt();
			array[i] = a;
		}

		int sum = 0;
		int max = array[0];
		int mins = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			}

			if (array[i] <= mins) {
				mins = array[i];
			}

			sum += array[i];
		}

		System.out.println("입력된 점수 : "+ Arrays.toString(array));
		System.out.println("제일 큰 수 : " + max);
		System.out.println("제일 작은 수 : " + mins);
		System.out.println("총합 : " + sum);

		
		float c = ((float) sum) / 5;

		System.out.println("평균 : " + c);

	}

}
