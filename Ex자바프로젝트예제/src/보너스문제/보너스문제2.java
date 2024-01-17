package 보너스문제;

import java.util.Scanner;

public class 보너스문제2 {

	public static void main(String[] args) {

		System.out.println(getMiddle("winter"));
		
	}
public static String getMiddle(String a) {
	String result = "";
	if(a.length()%2==0) {
		
		result = a.substring(a.length()/2-1, a.length()/2+1);
			
			
		}else {
		result = a.substring((a.length()-1)/2, (a.length()-1)/2+1 );
	}
	
	
	
	return result;
}
}