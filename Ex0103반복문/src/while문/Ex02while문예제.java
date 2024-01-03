package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		int num = 0;
//		while(num<10) {
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//		}
//		
//			System.out.println("종료되었습니다.");
		
		//무한반복문
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if(num>=10) {
				System.out.println("종료되었습니다");
				break;
			}
			
			
		}
		
		
		
	}

}
