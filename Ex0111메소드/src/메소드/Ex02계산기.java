package 메소드;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '-';
		System.out.println(cal(num1,num2,op));
		
	}

	
	// private : 다른 클래스에서는 접근이 불가능하게 막아주는 접근제한자
	private static int cal(int num1, int num2, char op) {
		int result = 0;
		
		if(op =='-') {
		result = num1>num2 ? num1-num2 : num2-num1;
		}else if(op == '+') {
			result = num1+num2;
		}else if(op == '*') {
			result = num1*num2;
		}else if(op == '/') {
			result = num1/num2;
		}else {
			// 조건에 맞지 않는 연산자가 들어왔을 때는 0을 리턴
			return 0;
		}
		
		return result;
		
//		if(op =='-') {
//			    return num1>num2 ? num1-num2 : num2-num1;
//			}else if(op == '+') {
//				return num1+num2;
//			}else if(op == '*') {
//				return num1*num2;
//			}else if(op == '/') {
//				return num1/num2;
//			}else {
//				// 변수정의 안하고 바로 return 으로 정의할땐
//		        // 모든값을 정의할수있어야 함
//				return 0;
//			}
	}

}
