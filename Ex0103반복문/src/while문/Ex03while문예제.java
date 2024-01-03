package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num2 = 0;
		while(true) {
			System.out.print("정수 입력 : ");
			int num1 = sc.nextInt();
			num2 += num1; 
			System.out.println("누적결과 : "+num2);
			
			if(num1==-1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
				
		
		
		
		
	}

}
