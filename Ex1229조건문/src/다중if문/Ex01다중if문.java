package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {

	public static void main(String[] args) {

		//사용자로부터 점수를 입력받아 해당 숫자
		//홀수,짝수,0 구분 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num==0) {
			System.out.println("0입니다.");
		}else if(num%2==1) {
			System.out.println("홀수입니다");
		}else if(num%2==0) {
			System.out.println("짝수입니다");
		}
		
//		String result = num%2==0 ? "짝수입니다" : "홀수입니다";
//		if(num==0) {
//			System.out.println("0입니다");
//		}else {
//			System.out.println(result);
//		}
		
//		String result;
//		if(num==0) {
//			System.out.println("0입니다");
//		}else {
//			result = num%2==0 ? "짝수입니다" : "홀수입니다";
//			System.out.println(result);
//		}
		
		
		
		
		
		
		
	}

}
