package Ex5일차;

import java.util.Arrays;
import java.util.Random;

public class Ex로또 {

	public static void main(String[] args) {

		Random rd = new Random();
        int [] lotto = new int[5];
		
		
		
		
		for(int j = 0; j<5; j++) {
			lotto[j] = rd.nextInt(10)+1;
		for(int i = 0; i<j; i++) {
			if(lotto[i]==lotto[j]) {
				j--;
				break;
			}
		}
		System.out.println("행운의숫자 : "+lotto[j]);
		}
		
		
		
		
		
	}

}
