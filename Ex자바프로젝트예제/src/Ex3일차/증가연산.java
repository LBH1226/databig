package Ex3일차;

import java.util.Scanner;

public class 증가연산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();

		int num1 = 1;
		for (int i = 0; i <= num; i++) {
			num1 += i;
			System.out.print(num1 + " ");
		}

	}

}
