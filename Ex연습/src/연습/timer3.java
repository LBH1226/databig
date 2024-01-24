package 연습;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class timer3 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		while (true) {
			System.out.println("입력: ");
			if(sc.hasNext()==false) {
				int a = sc.nextInt();
			}

			// 현재 시간과 시작 시간을 비교하여 제한 시간을 초과했는지 확인
			long currentTime = System.currentTimeMillis();
			long elapsedTime = (currentTime - startTime) / 1000; // 밀리초를 초로 변환
			if (elapsedTime >= 5&&sc.hasNext()==false) {
				System.out.println("제한 시간이 초과되었습니다.");
				break;
			}
		}
	}

}
