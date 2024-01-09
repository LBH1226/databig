package Ex5일차;

import java.util.Scanner;

public class Ex3의배수출력 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1)+"번 째 정수 입력 : ");
			int a = sc.nextInt();
			array[i]=a;
			
		}
		
		
		System.out.print("3의 배수 : ");
		for (int i = 0; i < array.length; i++) {
			if(array[i]%3==0) {
				System.out.print(array[i]+" ");
			}
		}
		
	}

}
