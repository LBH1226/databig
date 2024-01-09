package for문;

import java.util.Scanner;

public class Ex05약수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		for(int i=1 ; i<=num1 ; i++) {
			if(num1%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
