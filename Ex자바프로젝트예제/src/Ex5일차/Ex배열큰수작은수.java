package Ex5일차;

import java.util.Arrays;
import java.util.Random;

public class Ex배열큰수작은수 {

	public static void main(String[] args) {

		int[] array = new int[8];
		Random rd = new Random();
		
		for (int i = 0; i < array.length; i++) {
	
			int a = rd.nextInt(99)+1;
			array[i]= a;
		}
		System.out.println("배열에 있는 모든 값 : "+Arrays.toString(array));
		
		int max = array[0];
		int mins = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			}

			if (array[i] <= mins) {
				mins = array[i];
			}
	}
		System.out.println("제일 큰 수 : " + max);
		System.out.println("제일 작은 수 : " + mins);
	}
}
