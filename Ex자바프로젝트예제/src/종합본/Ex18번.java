package 종합본;

import java.util.Arrays;
import java.util.Random;

public class Ex18번 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int [] array = new int [6];
		
		for (int i = 0; i < 6; i++) {
			array[i] = ran.nextInt(6)+1;
			for (int j = 0; j<i; j++) {
				if(array[j]==array[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		
		
	}

}
