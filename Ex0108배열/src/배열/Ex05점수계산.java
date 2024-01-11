package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++) {
			System.out.print((i+1)+"번째 입력 : ");
			int a = sc.nextInt();
			array[i]=a;
		}
		System.out.print("입력된 점수 : "+ Arrays.toString(array));
	    
		int max = array[0];
		for(int i = 0; i<array.length; i++) {
		if(array[i]>=max) {
			max=array[i];
		}
		}
		System.out.println();
		System.out.println("제일 큰 수 : "+max);
		
		
		int mins = array[0];
		for(int i = 0; i<array.length; i++) {
		if(array[i]<=mins) {
			mins=array[i];
		}
		}
		System.out.println("제일 작은 수 : "+mins);
		
		int a = 0;
		for(int i = 0; i<array.length; i++) {
			a += array[i];
		}
		System.out.println("총합 : "+ a);
		
		float b = ((float) a)/5;
		
		System.out.println("평균 : " +b);
		
		
	}

}
