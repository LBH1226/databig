package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] array = new int[5];
		
	
//		int num2 =0;

		for (int i = 0; i < array.length; i++) {
			int num1 = ran.nextInt(9)+1;
			array[i]=num1;
			
//				if(i==0) {
//					num2=array[0];
//				}
//			
//			if(num2<=array[i]) {
//				num2=array[i];
//			}
		}
		
		
		int num2 = array[0];
		for(int i = 0; i < array.length; i++) {
			if(num2<=array[i]) {
				num2 = array[i];
			}
		}
		System.out.print("배열 안에 들어있는 값 : "+ Arrays.toString(array));
		System.out.println();
		System.out.println(num2);
		
	}

}
