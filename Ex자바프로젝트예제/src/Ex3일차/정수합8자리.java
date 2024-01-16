package Ex3일차;

import java.util.Scanner;

public class 정수합8자리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();

		int sum = 0;
		
		int c = 100000000;
		
		while (c>=10) {
	
			c *= 0.1;

			sum += a / c;
			a = a % c;
		}
		
		System.out.println("합은" + sum + "입니다.");
		
	}

}
