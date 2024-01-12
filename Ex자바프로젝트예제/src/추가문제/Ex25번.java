package 추가문제;

import java.util.Scanner;

public class Ex25번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 : ");
		String num = sc.next();
		
		int leng = num.length();
		int result = 0;
		for (int i = 0; i < num.length(); i++) {
			if(num.charAt(i)=='1') {
				result+=2;
			}
			if(num.charAt(i)=='7') {
				result+=3;
			}
			if(num.charAt(i)=='4') {
				result+=4;
			}
			if(num.charAt(i)=='2'||num.charAt(i)=='3'||num.charAt(i)=='5') {
				result+=5;
			}
			if(num.charAt(i)=='0'||num.charAt(i)=='6'||num.charAt(i)=='9') {
				result+=6;
			}
			if(num.charAt(i)=='8') {
				result+=7;
			}
		}
		System.out.println("대시('_')의 총 합 : "+result);
		
	}

}
