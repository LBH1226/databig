package mp3Player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {
	
	// MVC패턴 : 디자인 패턴 중 하나
	// Model --> 데이터 관리를 위한 부분
	// View --> 실제로 사용자에게 보여지는 부분
	// Controller --> 실제 기능에 관여하는 부분

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 노래를 재생시키는 도구
		MP3Player mp3 = new MP3Player();

		String comPath = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\Ex0115ArrayList\\player\\";

		// 2. 노래 데이터(Music 객체)를 생성(Music 자료형 사용하기)
		// 노래 데이터를 전부 저장하는 ArrayList 생성, 이름은 musicList
		ArrayList<Music> musicList = new ArrayList<Music>();
		Music a = new Music("HypeBoy", "뉴진스", 180, comPath + "HypeBoy.mp3");
		musicList.add(a);
		musicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3"));
		musicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3"));
		musicList.add(new Music("Smoke", "다이나믹듀오", 210, comPath + "Smoke.mp3"));
		musicList.add(new Music("한페이지가될수있게", "데이식스", 185, comPath + "한페이지가될수있게.mp3"));

		System.out.println("=====mp3 플레이어=====");

		int nowP = 0;
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("==========재생=========");
				// 1. 재생중인 노래가 있는지 판단
				if (mp3.isPlaying() == true) {
					// 2. 재생중이라면 노래 멈추기
					mp3.stop();
				}

				// 3. musicList의 0번방에 있는 노래 재생
				mp3.play(musicList.get(nowP).getPath());

				// 4. "가수 - 노래제목이 재생중입니다" 출력
				System.out.println(nowP+1 + "번곡 " + musicList.get(nowP).getSinger() + " - "
						+ musicList.get(nowP).getTitle() + "이(가) 재생중입니다");

			} else if (input == 2) {
				System.out.println("==========정지=========");
				if (mp3.isPlaying() == true) {
					mp3.stop();
					System.out.println("노래재생을 정지합니다");
				} else {
					System.out.println("재생중인 노래가 없습니다");
				}

			} else if (input == 3) {
				System.out.println("==========이전곡=========");
				// 1. 재생중인 노래 있는지 판단
				// 2. 재생중이라면 노래정지
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				
				// 3. musicList에서 이전곡을 재생
				// 4. "가수 - 노래제목이 재생중입니다" 출력
				nowP--;
				if(nowP>=0) {
				mp3.play(musicList.get(nowP).getPath());

				System.out.println(nowP+1 + "번곡 " + musicList.get(nowP).getSinger() + " - "
						+ musicList.get(nowP).getTitle() + "이(가) 재생중입니다");
				}else {
					// 5. 이전곡이 없을때 이전곡은 없습니다 출력
					// 6. 다시 재생을 선택한다면 musicList 첫번째곡 재생
					System.out.println("이전곡이 없습니다");
					nowP=0;
				}

			} else if (input == 4) {
				System.out.println("==========다음곡=========");
				// 1. 재생중인 노래 있는지 판단
				// 2. 재생중이라면 노래정지
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				
				// 3. musicList에서 다음곡을 재생
				// 4. "가수 - 노래제목이 재생중입니다" 출력
				nowP++;
				if (nowP< musicList.size()) {
				mp3.play(musicList.get(nowP).getPath());

				System.out.println(nowP+1 + "번곡 " + musicList.get(nowP).getSinger() + " - "
						+ musicList.get(nowP).getTitle() + "이(가) 재생중입니다");
				}else {
					// 5. 다음곡이 없을때 다음곡없습니다 출력
					// 6. 다시 재생을 선택한다면 musicList 마지막곡 재생되게 만들기
					System.out.println("다음곡이 없습니다");
					nowP=musicList.size()-1;
				}
				
				
			} else if (input == 5) {
				System.out.println("======Mp3플레이어 종료=====");
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				break;
				
			} else {
				System.out.println("번호를 잘못 누르셨습니다");
			}

		}

	}

}
