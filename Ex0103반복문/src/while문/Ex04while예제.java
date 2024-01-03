package while문;

import java.util.Scanner;

public class Ex04while예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num2 = 0;
		int num3 = 0;
		while (true) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				num2 += 1;
			} else  {
				num3 += 1;
			}
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}

			System.out.println("짝수개수 : " + num2);
			System.out.println("홀수개수 : " + num3);
		}
		
		
		
	}

}
