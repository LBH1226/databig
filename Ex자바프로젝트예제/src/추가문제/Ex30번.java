package 추가문제;

import java.util.Arrays;
import java.util.Scanner;

public class Ex30번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String a = sc.next();

		// alpa배열에 소문자 알파벳 넣어주기
		char[] alpa = new char[26];

		char b = 'a';
		for (int i = 0; i < alpa.length; i++) {
			alpa[i] = b;
			b++;
		}

		// alpa2배열에 대문자 알파벳 넣어주기
		char[] alpa2 = new char[26];

		char b2 = 'A';
		for (int i = 0; i < alpa.length; i++) {
			alpa2[i] = b2;
			b2++;
		}

		
		
		// 빈도수 값 넣어줄 array배열 선언
		int[] array = new int[26];
		
		
		// 입력값a의 자릿수 문자마다 alpa배열의 알파벨들과 비교 후
		// 값이 같은 alpa배열 값의 인덱스 값과 같은 array배열 값을 +1
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < alpa.length; j++) {
				if (alpa[j] == a.charAt(i)||alpa2[j] == a.charAt(i)) {
					array[j]++;
				}
			}
		}

		for (int i = 0; i < alpa.length; i++) {
			System.out.println(alpa[i] + " : " + array[i]);
		}

		System.out.println(Arrays.toString(alpa));
		System.out.println(Arrays.toString(alpa2));
	}

}
