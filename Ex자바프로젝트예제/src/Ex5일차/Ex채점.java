package Ex5일차;

import java.util.Arrays;
import java.util.Scanner;

public class Ex채점 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		
//		int b = 0;
//		int c = 0;
//		for(int i = 1; i<7; i++) {
//			String a = sc.nextLine();
//			if(a=="o") {
//				b += 1;
//			}else if(a=="x"){
//				break;
//			}
//			}
//			c += b;
//			System.out.println(c);
		
		String[] array= new String [6];
	      for (int i = 0; i < array.length; i++) {
	    	  String a = sc.nextLine();
	    	  array[i]= a;
		}
	      System.out.println(Arrays.toString(array));
			
			
			
			
		}
		
		
	
		
	}


