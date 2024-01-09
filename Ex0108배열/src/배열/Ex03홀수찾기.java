package 배열;

import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] array = new int[5];
		int num1 = 0;

		for (int i = 0; i < array.length; i++) {
			int number1 = ran.nextInt(99)+1;
			array[i] = number1;
			if (array[i] % 2 == 1) {
				num1 += 1; 
				System.out.print(array[i] + " ");
			}

		}
		System.out.println();
		System.out.println("홀수 개수는 "+num1+"개 입니다.");
		
	}

}
