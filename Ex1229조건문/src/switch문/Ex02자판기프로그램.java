package switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int menu = sc.nextInt();
		
		
//		int change = money;
//		if(menu==1) {
//			if(change<700) {
//				System.out.println("돈이 부족해요");
//			}else {	
//				change = money - 700;
//			}~~~~~~~~~~~~~~~~~~~~~~~~~~
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
	
//		int change = 0;
//		switch(menu) {
//		case 1:
//			change = money - 700;
//		    break;
//		case 2:
//			change = money - 1000;
//		    break;
//		case 3:
//			change = money - 500;
//		    break;
//		default:
//		    System.out.println("메뉴를 다시 골라주세요");
//		}

		if(change<0) {
			System.out.println("돈이 부족해요ㅠㅠ");
			System.out.println("잔돈 : " + money);
		} else {
		System.out.println("잔돈 : " + change);
		}
		
	
	}
}
