package dowhile문;

import java.util.Scanner;

public class Ex02dowhile문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int num1 = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int num2 = sc.nextInt();
		
		int num3 = 0;
		int num5 = num1;
		do {
			num3++;
			System.out.print(num3 + "주차 감량 몸무게 : ");
			int num4 = sc.nextInt();
			num5 -= num4;

			if (num5 <= num2) {
				System.out.println(num5 + "kg 달성 축하합니다");
				break;
			}
		} while (true);		
		
//		int num3 = 0;
//		int num5 = num1;
//		while(true) {
//			num3++;
//			System.out.print(num3 + "주차 감량 몸무게 : ");
//			int num4 = sc.nextInt();
//			num5 -= num4;
//			
//			if(num5<=num2) {
//				System.out.println(num5+"kg 달성 축하합니다");
//				break;
//			}
		
		
		}
	}


