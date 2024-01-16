package Ex1일차;

import java.util.Scanner;

public class Ex세자리x세자리 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		int a = num1*(num2%10);
		int b = num1*(num2%100/10);
		int c = num1*(num2/100);
		int d = a + b*10 + c*100;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
