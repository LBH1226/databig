package Ex5일차;

import java.util.Arrays;
import java.util.Random;

public class Ex숫자거리 {

	public static void main(String[] args) {

		int[] array = new int[7];
		Random rd = new Random();

		for (int i = 0; i < array.length; i++) {
			int a = rd.nextInt(99) + 1;
			array[i] = a;
		}
	
		System.out.println(Arrays.toString(array));

		int a = array[0] - array[1];
		if(a<0) {
			a *= -1;
		}
		
		int c = 0;
		int d = 0;
		
		
		for (int i = 0; i < 6; i++) {

			for (int j = i + 1; j < array.length; j++) {
				int b = array[i] - array[j];
				
				if (b < 0) {
					b *= -1;
				}
				if (b <= a) {
					a = b;
					c = i;
					d = j;
				}
			}
		}
		System.out.println("result = " + c + ", " + d);
	}
}
