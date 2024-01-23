package Q6one;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {

		
		
		MusicVO vo = new MusicVO();
		
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.등록 2.목록 3.삭제 4.전체삭제 5.종료 : ");
		int input = sc.nextInt();

		while (true) {

			if (input == 1) {
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
			    int playTime = sc.nextInt();
			    
			    
			    
				

			} else if (input == 2) {

			} else if (input == 3) {

			} else if (input == 4) {

			} else if (input == 5) {

			} else {
				System.out.println("정확한 숫자를 입력해주세요");
			}

		}
	}

}
