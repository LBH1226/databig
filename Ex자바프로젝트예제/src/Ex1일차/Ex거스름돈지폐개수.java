package Ex1일차;

import java.util.Scanner;

public class Ex거스름돈지폐개수 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
	    int money = sc.nextInt();
	    System.out.print("\n");
	    System.out.println("잔돈 : "+money+"원");
	    
	    int a = money/10000;
	    int b = 0;
	    int c = 0;
	    if(money%10000>=5000) {
	    	b = 1;
	    	c = (money%10000-5000)/1000;
	    }else {
	    	b = 0;
	    	c = money%10000/1000;
	    }
	   int d = 0;
	   int e = 0;
	   if(money%10000%1000>=500) {
		   d = 1;
		   e = (money%10000%1000-500)/100;
	   }else {
		   d = 0;
		   e = money%10000%1000/100;
	   }
	    
	    System.out.println("10000원 : "+a+"개");
	    System.out.println("5000원 : "+b+"개");
	    System.out.println("1000원 : "+c+"개");
	    System.out.println("500원 : "+d+"개");
	    System.out.println("100원 : "+e+"개");
	    
	}

}
