package 단순if문;

import java.util.Scanner;

public class Ex01단순if문 {

	public static void main(String[] args) {
       
		// age가 20보다 크거나 같다면 "성인입니다" 출력 예제
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age>=20) {
			System.out.println("성인입니다.");
		
		}
	}

}
