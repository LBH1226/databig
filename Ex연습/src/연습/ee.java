package 연습;

import java.util.Random;
import java.util.Scanner;

public class ee {

	public static void main(String[] args) {

		Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("[1]게임시작\n[2]랭킹확인\n[3]회원가입");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i <= 50; i++) {
                    // 랜덤한 색상 선택
                    int colorCode = random.nextInt(8) + 30; // 30부터 37까지의 색상 코드

                    // ANSI 이스케이프 시퀀스를 사용하여 색상 변경
                    System.out.print("\u001B[" + colorCode + "m");

                    System.out.println("====게임을 시작합니다====");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n!!!!!!!!!!시작!!!!!!!!!!!");
                break;
      case 2 :
         for(int i = 0; i<=15 ; i++) {
            System.out.println("====랭킹확인====");
         }
         break;
      case 3 :
         for(int i = 0; i<=15 ; i++) {
            System.out.println("====회원가입====");
         }
         break;
      }
		
		
	}

}
