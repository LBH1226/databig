package Ex5일차;

import java.util.Arrays;
import java.util.Scanner;

public class Ex오름차순 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 1; i < 6; i++) {
			System.out.print(i + "번째 수 입력 : ");
			int a = sc.nextInt();
			array[i - 1] = a;
		}

		System.out.println("정렬후");

		int[] array1 = new int[5];
		int num1 = array[0];
		for (int i = 0; i <5; i++) {
			if(num1>=array[i]) {
				num1=array[i];
			}
		}
		array1[0]=num1;
		
		
		for (int i = 1; i <5; i++) {
			
			for(int j = 1; j<5; j++) {
				if(array[i]>=array[j]&&i!=j) {
					array1[i]=array[j];
				}else {
					array1[i]=array[i];
				}
			}
		}
		System.out.println(Arrays.toString(array1));

	}

}
