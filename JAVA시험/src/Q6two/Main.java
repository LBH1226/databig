package Q6two;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("[1]음식점 보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료");
		int input = sc.nextInt();
		
		StoreController con = new StoreController();
		
		ArrayList<Restaurant> rlist = new ArrayList<Restaurant>();
		
		
		
		
		while(true) {
			
			if(input==1) {
				System.out.println("====음식점보기====");
				
				
				
			}else if(input==2) {
				
			}else if(input==3) {
				
			}else if(input==4) {
				
			}else if(input==5) {
				
			
			
		}
		
		
	}
	}
}

