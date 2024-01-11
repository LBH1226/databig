package Ex5일차;

import java.util.Scanner;
import java.util.Arrays;

public class Ex채점 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String b = sc.next();

		int a = 0;
		int c = 0;

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == 'o') {

				a++;
			} else if (b.charAt(i) == 'x') {
				a = 0;
			}
			c += a;
		}

		System.out.println(c);

	}

}
