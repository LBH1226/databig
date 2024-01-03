package Ex1일차;

import java.util.Scanner;

public class Ex시급계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("일할시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int money = 0;
		if(time<=8) {
			money = time*5000;
		}else {
			money = (int) ((8*5000) + (time-8)*5000*1.5);
		}
		 System.out.println("총 임금은 "+money+"원 입니다.");
		
	}

}
