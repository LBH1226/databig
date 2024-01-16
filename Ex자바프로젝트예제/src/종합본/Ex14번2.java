package 종합본;

import java.util.Scanner;

public class Ex14번2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] array = new int [N][N];

		int num = 1;
		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array.length; j++) {
					
					array[i][j] = num;
					num++;
				}
			} else {
				for (int j2 = array.length - 1; j2 >= 0; j2--) {
					array[i][j2] = num;
					num++;
				}
			}

		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

		
	}

}
