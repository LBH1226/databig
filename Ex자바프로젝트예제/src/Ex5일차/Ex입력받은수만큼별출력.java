package Ex5일차;

import java.util.Scanner;

public class Ex입력받은수만큼별출력 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int a = 0;
		for (i = 0; i < array.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			a = sc.nextInt();
			array[i] = a;

		}
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + ":");

			for (int j = 1; j <= array[i]; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}
