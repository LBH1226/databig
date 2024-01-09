package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex03플러스게임 {

	public static void main(String[] args) {

		//1.입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		//2.랜덤숫자 추출하는 도구 꺼내오기
		Random ran = new Random();
		do {
			int ranNum1 = ran.nextInt(9) + 1;
			int ranNum2 = ran.nextInt(9) + 1;
			// 3.문제출력
			System.out.print(ranNum1 + "+" + ranNum2 + "=");
			// 4.사용자로부터 정답 입력받기
			int input = sc.nextInt();
			// 5.입력받은 숫자와 정답이 같은지 비교
			// String같은 기본자료형이 아닌경우엔 .equals사용
			if (input == ranNum1 + ranNum2) {
				System.out.println("success");
			} else {
				System.out.println("fail");
				System.out.print("계속하시겠습니까? >> ");
				String answer = sc.next();
				if (answer.equals("N")) {
					System.out.println("종료합니다.");
					break;
				}
			}
		}
		while (true);
	}

}
