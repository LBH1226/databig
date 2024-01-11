package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {

		//이차원배열
		//:배열 안에 또 다른 배열이 있는 형태
		//:참조가 2번 일어나는 형태(참조의 참조)
		
		//1. 이차원 배열 선언방법
		//자료형[][] 변수명 = new 자료형 [행][열];
		int[][] array = new int [3][3];
		array[1][1]=5;
		System.out.println(array[1][1]);
		
		//이차원배열에 값 넣기(1~9)
		array[0][0]=1;
		array[0][1]=2;
		array[0][2]=3;
		array[1][0]=4;
		array[1][1]=5;
		array[2][2]=6;
		array[2][0]=7;
		array[2][1]=8;
		array[2][2]=9;
		
		int num =1;
		for(int i=0;i<array.length;i++) {
			for(int j = 0;j<array.length;j++) {
				array[i][j]=num++;
			}
		}
//		System.out.println(Arrays.toString(array[0]));
//		System.out.println(Arrays.toString(array[1]));
//		System.out.println(Arrays.toString(array[2]));
		
//		System.out.print(array[0][0]+"\t");
//		System.out.print(array[0][1]+"\t");
//		System.out.print(array[0][2]+"\t");
//		System.out.println();
//		
//		System.out.print(array[1][0]+"\t");
//		System.out.print(array[1][1]+"\t");
//		System.out.print(array[1][2]+"\t");
//		System.out.println();
//		
//		System.out.print(array[2][0]+"\t");
//		System.out.print(array[2][1]+"\t");
//		System.out.print(array[2][2]+"\t");
//		System.out.println();
		
	
		for(int i=0;i<array.length;i++) {
			System.out.println();
			for(int j = 0;j<array.length;j++) {
				System.out.print(array[i][j]+"\t");
			}
		}
		
		
		
		
		
	}

}
