package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호 {

	public static void main(String[] args) {

		Random rd = new Random();
		int [] lotto = new int[5];
		
		
		
		
		for(int j = 0; j<5; j++) {
			lotto[j] = rd.nextInt(10)+1;
		for(int i = 0; i<j; i++) {
			if(lotto[i]==lotto[j]) {
//				lotto[j]=rd.nextInt(10)+1;
				j--;
				break;
			}
		}
		}
		System.out.println(Arrays.toString(lotto));

	}

}
