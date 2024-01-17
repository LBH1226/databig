package 추가문제;


import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex연습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int b = 1;
		while(b<6) {
		int ran = rd.nextInt(10)+1;
		int ran2 = rd.nextInt(10)+1;
		
		System.out.println(ran+"+"+ran2+"=");
		int input = sc.nextInt();
		
		if(ran+ran2==input) {
			System.out.println("성공");
		}else if (ran+ran2!=input) {
			System.out.println("실패");
			b++;
		}
		
		}
		
		
	}
	
}
