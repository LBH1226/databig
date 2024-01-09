package Ex3일차;

import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int a = 1;
		for(int i=1; i<=num; i++) {
			a *= i;
		}
		System.out.println("출력 : "+a);
		
	}

}
