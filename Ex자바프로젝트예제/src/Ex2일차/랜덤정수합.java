package Ex2일차;

import java.util.Random;
import java.util.Scanner;

public class 랜덤정수합 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int num4 = 1;
		do {
			int num1 = ran.nextInt(9) + 1;
			int num2 = ran.nextInt(9) + 1;

			System.out.print(num1 + "+" + num2 + "= ");
			int num3 = sc.nextInt();
			if (num1 + num2 == num3) {

				System.out.println("SUCCESS!");
			} else {

				System.out.println("FAIL...");

				num4++;
			}
		} while (num4 < 6);

		System.out.println("GAME OVER");

	}
}
