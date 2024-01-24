package 연습;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class timer2 {

	static int count = 1;
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				end();
				
			}
		}, 5*1000);
		start();
		
		
		
//		TimerTask tast = new TimerTask() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				if(count<=5) {
//					System.out.println("카운트 : "+count);
//					count++;
//				}else {
//					timer.cancel();
//					System.out.println("카운트 종료");
//				}
//			}
//		};timer.schedule(tast, 1000, 1000);
		
		
		
			
			
		}
	
	
	private static void end() {
		System.out.println();
		System.out.println("종료되었습니다");
		System.exit(0);
	}
	

	private static void start() {
		
		while(true) {
		System.out.print("입력 : ");
		int a = sc.nextInt();
		}
	}
		
		
		
		
	}


