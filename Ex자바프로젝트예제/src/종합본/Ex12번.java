package 종합본;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12번 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] array = new int[N][N];
		
		for (int i = 0; i < array.length; i++) {
			array[i][0]=i+1;
			for (int j = 1; j < array.length; j++) {
				array[i][j]=array[i][0]+(5*j);
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

	
}
