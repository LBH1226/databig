package 산술연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {

//		// 1. 입력도구 꺼내오기
//		Scanner sc = new Scanner(System.in);
//		// 2. 입력받기
//		String name = sc.next();
//		System.out.println("입력받은 글자는 >> "  + name);
//		
//		// 3. 정수형 숫자 입력받기
//		System.out.print("숫자를 입력하세요 >> " );
//		int num1 = sc.nextInt();
		
		// 단축키 >> 주석처리하고싶은 부분 선택 후 ctrl + /
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 첫번째 정수입력 : " );
		int num1 = sc.nextInt();
		
		System.out.print(" 두번째 정수입력 : " );
		int num2 = sc.nextInt();
		
		System.out.println("더한 결과 값 " + (num1+num2));
		System.out.println("뺸 결과 값 " + (num1-num2));
		System.out.println("곱한 결과 값 " + (num1*num2));
		System.out.println("나눈 결과 값 " + (num1/(double)num2));
		
		
	}

}
