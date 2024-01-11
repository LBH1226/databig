package 보너스문제;

import java.util.Scanner;

public class 보너스문제1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 : ");
			int num2 = sc.nextInt();

			int subNum = num1 - num2;

			if (num1 == 0 && num2 == 0) {
				break;
			}

			System.out.println("결과 : " + subNum);

		}

	}

}
