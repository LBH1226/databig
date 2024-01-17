package 추가문제;

import java.util.Arrays;
import java.util.Scanner;

public class Ex20번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
	

		int[] array = new int[20];

		int c = 0;

		do {

			array[c] = num % 2;
			c++;
			num /= 2;
			
		}while(num!=0);

		int[] array1 = new int[c];
		int d = 0;

		for (int i = c - 1; i > 0; i--) {
			array1[d] = array[i];
			d++;
		}
		System.out.println(Arrays.toString(array1));

	}

}
