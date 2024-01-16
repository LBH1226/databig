package 종합본;

import java.util.Scanner;

public class Ex16번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		int a = 10000000;
		int sum = 0;
		int mok = 0;
		int namuzi = input;
		for (int i = 0; i < 8; i++) {
			
			mok= namuzi/a;
			namuzi= namuzi%a;
			a /= 10;
			
			sum += mok;
		}

		System.out.println(sum);

	}

}
