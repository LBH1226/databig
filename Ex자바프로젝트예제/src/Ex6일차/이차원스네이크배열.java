package Ex6일차;


import java.util.Scanner;

public class 이차원스네이크배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N x N 을 실행할 정수 N 입력 : ");
		int input = sc.nextInt();
		int[][] array = new int[input][input];

		int num = 1;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				array[i][j] = num++;
			}
		}
		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.println(array[i][j]);
//			}
//			System.out.println();
//		}

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][j] + "\t");

				}
			} else  {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][array.length-j-1] + "\t");
				}
			}
			System.out.println();

		}

		
		
	}

}
