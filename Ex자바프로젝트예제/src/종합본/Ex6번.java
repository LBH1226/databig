package 종합본;

import java.util.Iterator;

public class Ex6번 {

	public static void main(String[] args) {

		
		int sum = 0;
		int a = 77;
		for (int i = 1; i <= 77; i++) {
			sum += i*a;
			a--;
		}
		System.out.println(sum);
		
	}

}
