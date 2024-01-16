package 추가문제;

import java.util.Scanner;

public class Ex31번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		int a = num;
		for (int i = num-1; i > 0; i--) {
			num=num*i;
		}
		
		System.out.print("출력 : "+num);
		
	}

}
