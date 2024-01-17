package 종합본;

import java.util.Iterator;
import java.util.Random;

public class Ex10번 {

	public static void main(String[] args) {

		Random rd = new Random();
		
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			int ran = rd.nextInt(6)+1;
			lotto[i]=ran;
			for (int j = 0; j < i; j++) {
				if(ran==lotto[i]) {
					j--;
					break;
				}
			}
		}
		

	}
}
