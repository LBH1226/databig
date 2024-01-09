package for문;

import java.util.Scanner;

public class Ex04구구단 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("어느 수까지 출력 " );
		int num2 = sc.nextInt();
		
		for( int i = 1 ; i<=num2 ; i++) {
			System.out.println(num1+"x"+i+"="+num1*i);
		}
		
	}

}
