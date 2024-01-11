package 보너스문제;

import java.util.Scanner;

public class 보너스문제4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int [5];
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(i+"번째 별의 수 : ");
			int num = sc.nextInt();
		    array[i]=num;
		    
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+":");
			
			for(int j= 0; j<array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
