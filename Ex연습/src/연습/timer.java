package 연습;

import java.util.Timer;
import java.util.TimerTask;

public class timer {
	
	static int count = 1;

	public static void main(String[] args) {
		
		
		System.out.println("타이머");
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				if(count<=5) {
					System.out.println("[카운트다운 : "+count+"]");
					count++;
				}else {
					timer.cancel();
					System.out.println("카운트종료");
				}
				
			}
		};
		timer.schedule(task, 1000, 1000);
		
				
		

	}

}
