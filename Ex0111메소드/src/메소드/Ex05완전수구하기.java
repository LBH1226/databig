package 메소드;

import java.util.Scanner;

public class Ex05완전수구하기 {

	public static void main(String[] args) {
		
		//완전수 : 자기 자신을 제외한 약수들의 합이 자기 자신인 수

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1,num2);
		System.out.println(divisor);
		
		System.out.println(getSum(44));
		
		System.out.println(isPerfect(6));
	}
	
	private static boolean isDivisor(int num1, int num2) {
		boolean result = false;
		if(num1%num2==0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	
	private static int getSum(int num1) {
		
		int result = 0;
		for(int i=1; i<num1; i++) {
			
//			if(num1%i==0) {
			//메소드 구조 안에 메소드를 새롭게 구현할 수는 없으나
			//메소드 자체를 호출하여 사용하는 것은 가능하다
			if(isDivisor(num1,i)==true) {
				result+=i;
			}
		
		}
		return result;
	}
	
	private static boolean isPerfect(int num1) {
		boolean result = false;
		if(num1==getSum(num1)) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
	
	

}
