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

		Arrays.sort(array);
		
		for(int n:array) {
			System.out.print(n+" ");
		}
		

	}

}
