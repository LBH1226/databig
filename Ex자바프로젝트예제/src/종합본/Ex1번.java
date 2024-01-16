package 종합본;

import java.util.Scanner;

public class Ex1번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		
		int a = 0;
		while(true) {
			a++;
			System.out.print(a+"주차 감량 몸무게 : ");
			int ma = sc.nextInt();
			now= now-ma;
			if(now<=goal) {
				break;
			}
		}
		System.out.println(now+"kg 달성 축하합니다");
		
		
		
	}

}
