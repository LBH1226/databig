package Ex3일차;

import java.util.Scanner;

public class 원하는곱셈단수출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		System.out.println(num1+"단");
		
		for(int i=1; i<=num2; i++) {
			System.out.println(num1+"x"+i+"="+num1*i);
		}
	}

}
