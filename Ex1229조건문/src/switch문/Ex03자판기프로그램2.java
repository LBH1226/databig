package switch문;

import java.util.Scanner;

public class Ex03자판기프로그램2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int menu = sc.nextInt();
		
		int change = 0;
		if(menu==1) {
			change = money - 700;
		} else if(menu==2) {
			change = money - 1000;
		} else if(menu==3) {
			change = money - 500;
		} else {
			System.out.println("메뉴를 다시 골라주세요");
		}
		
		
		if(change<0) {
			System.out.println("돈이 부족해요ㅠㅠ");
			System.out.println("잔돈 : " + money);
		} else {
		System.out.println("잔돈 : " + change);
		}
		
		
		if(change<0) {
			int d = money/1000;
			int e = money%1000/500;
			int f = money%1000%500/100;
			
		    System.out.print("천원 : " + d + "개,");
			System.out.print(" 오백원 : " + e + "개,");
			System.out.print(" 백원 : " + f + "개");
			
		} else {
			int a = change/1000;
			int b = change%1000/500;
			int c = change%1000%500/100;
			
		    System.out.print("천원 : " + a + "개,");
			System.out.print(" 오백원 : " + b + "개,");
			System.out.print(" 백원 : " + c + "개");
		}

	}

}
