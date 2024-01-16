package 추가문제;

import java.util.Scanner;

public class Ex28번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 입력 : ");
		 String num = sc.next();
		 System.out.print(num+"(2)"+" = ");
		
		String egin = num;
		int result = 0;

		for (int i = 0; i < num.length(); i++) {
			if(num.charAt(i)=='0') {
				result*=2;
			}
			if(num.charAt(i)=='1') {
				result=result*2+1;
			}
		}
		System.out.println(result+"(10)");
	}

}
