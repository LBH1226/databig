package Ex5일차;

import java.util.Arrays;
import java.util.Scanner;

public class Ex오름차순 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 1; i < 6; i++) {
			System.out.print(i + "번째 수 입력 : ");
			int a = sc.nextInt();
			array[i - 1] = a;
		}

		System.out.println("정렬후");

		int b = array[0];
		int[] array1 = new int[5];
		for (int j = 0; j < 5; j++) {

			for (int i = j; i < 5; i++) {
				if (b >= array[i]) {
					b = array[i];
				} 
			}
			array1[j] = b;
		}
		System.out.println(Arrays.toString(array1));

	}

}
