package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {

		// 짝수 판별 예제
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println(num1%2==0?num1 + "는(은) 짝수입니다." : num1 + "는(은) 홀수입니다.");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		String result = num1%2 == 1 ? "홀수" : "짝수";
//		System.out.println(num1 + "은(는)" + result + "입니다." );
		
	}

}
