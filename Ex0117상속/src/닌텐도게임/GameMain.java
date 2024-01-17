package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {

		// 게임 실행 공간
		// 게임칩 가지고 오기
		Pocketmon p = new Pocketmon();
		// 게임칩 끼우기
		insert(p);
		
		
		
		// 마리오카트, 젤다의전설 게임칩 가져오기
		// Pocketmon을 마리오와 젤다에 상속시켜줌 extends 사용
		Mario m = new Mario();	
		insert(m);
		Zelda z = new Zelda();	
		insert(z);
		
	}
	
	// 게임칩을 끼우는 기능
	private static void insert(Pocketmon game) {
		game.gameStart();
	}
	

}
