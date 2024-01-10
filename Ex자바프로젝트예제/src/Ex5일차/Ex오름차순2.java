package Ex5일차;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex오름차순2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		//숫자입력받아 배열array 선언
		for (int i = 1; i < 6; i++) {
			System.out.print(i + "번째 수 입력 : ");
			int a = sc.nextInt();
			array[i - 1] = a;
		}

		//min 값을 담을 array1선언 후 먼저 선언된 min값을 제외한 배열 선언 
		//min 값의 arrray의 i 를 담을 배열 선언
		int[] array1 = new int[5];
		int[] array2 = new int[5];

		int min = array[0];
		int a = 1;
		int i = 1;
		for (int j = 0; j < array1.length; j++) {
			
		
			
			
		for (i = 0; i < array.length; i++) {
			
			
			if (min >= array[i]) {
				min = array[i];
			}
			
			if(min == array[array2[i]]) {
				
			}
			
		}
		a=i;
		array2[i]=a;
		array1[j]=min;
		
	
		
		
		
		
		System.out.println(Arrays.toString(array1));

	}

}
