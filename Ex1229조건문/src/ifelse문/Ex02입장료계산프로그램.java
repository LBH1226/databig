package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {
        // 입장료 계산 예제(인당 5000원, 20세미만 50프로할인)
		System.out.println("===에버랜드에 오신 걸 환영합니다!===");
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(age<20) {
			System.out.println("총"+ num*5000/2 +"원입니다.");
		}else {
			System.out.println("총"+ num*5000+"원입니다.");
	
			
//		String result1 = "총"+ num*5000/2 +"원입니다.";
//		String result2 = "총"+ num*5000+"원입니다.";
//		
//		if(age<20) {
//			System.out.println(result1);
//		}else {
//			System.out.println(result2);
	
			
		//***지역변수(local variable)***
		//{} : 영역 안에서 선언된 변수는 {}영역 안에서만 사용 가능
		//{} : scope
//		int money = 0;
//		if(age<20) {
//			money = (int) (5000*num*0.5);
//		}else {
//			money = (int) (5000*num);
//		}
//		System.out.println("입장료는"+ money + "원 입니다.");
	 }
   }
}
