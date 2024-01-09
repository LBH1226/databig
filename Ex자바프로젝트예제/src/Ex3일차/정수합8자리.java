package Ex3일차;

import java.util.Scanner;

public class 정수합8자리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();

		int sum = 0;
		int e = a;
		int c = 100000000;
		
		while (e>=1) {
	
			c *= 0.1;

			sum += e / c;
			e = a % c;
		}
		
		System.out.println("합은" + sum + "입니다.");
		
	}

}
