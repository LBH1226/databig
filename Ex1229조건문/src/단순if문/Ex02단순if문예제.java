package 단순if문;

import java.util.Scanner;

public class Ex02단순if문예제 {

	public static void main(String[] args) {
        
		// 3과5의배수 예제
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if((num%3==0)&&(num%5==0)) {
			System.out.println("3과5의 배수입니다.");
//		if(num%3==0) {
//			if(num%5==0) {
//				System.out.println("3과5의 배수입니다.");	
//			}
//		}
			
		}
	}
}
        