package MVC;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	// MVC패턴 : 디자인 패턴 중 하나
	// Model --> 데이터 관리를 위한 부분
	// View --> 실제로 사용자에게 보여지는 부분
	// Controller --> 실제 기능에 관여하는 부분

	/// view : 사용자 화면

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 노래 재생을 담당하는 Controller 생성
		MusicController con = new MusicController();

		System.out.println("=====mp3 플레이어=====");

		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("==========재생=========");
				System.out.print("재생시키고 싶은 노래 번호 : ");
				int songN = sc.nextInt();
				
				Music m = con.play(input);

				System.out.println(m.getSinger() + " - " + m.getTitle() 
				+ "이(가) 재생중입니다");

				
			} else if (input == 2) {
				System.out.println("==========정지=========");
				if (con.stop()) {
					System.out.println("노래재생을 정지합니다");
				} else {
					System.out.println("재생중인 노래가 없습니다");
				}

				
			} else if (input == 3) {
				System.out.println("==========이전곡=========");

				Music b = con.before();

				if (b != null) {
					System.out.println(b.getSinger() + " - " + b.getTitle() 
					+ "이(가) 재생중입니다");
				} else {
					System.out.println("이전곡이 없습니다");
				}

				
			} else if (input == 4) {
				System.out.println("==========다음곡=========");

				Music a = con.after();

				if (a != null) {
					System.out.println(a.getSinger() + " - " + a.getTitle() 
					+ "이(가) 재생중입니다");
				} else {
					System.out.println("다음곡이 없습니다");
				}

				
			} else if (input == 5) {
				con.stop();
			    System.out.println("======Mp3플레이어 종료=====");
				
				break;

			} else {
				System.out.println("번호를 잘못 누르셨습니다");
			}

		}

	}

}
