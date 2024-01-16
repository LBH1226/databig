package 보너스문제;

import java.util.Scanner;

public class 보너스문제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		if(a.length()%2==0) {
			System.out.print(a.charAt(a.length()/2-1));
			System.out.print(a.charAt(a.length()/2));	
		}else {
		
		System.out.print(a.charAt(a.length()/2));
		}
	}
}
