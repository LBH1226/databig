package 닌텐도게임;

// 2. 추상 클래스
// - 추상 메소드를 하나라도 가지고 있으면 반드시 추상 클래스가 되어야한다
// - abstract 키워드 사용하여 선언
// - 추상 클래스도 일반 메소드 가지고 있을 수 있다
// - 일반 메소드만 가지고 있어도 추상 클래스가 될 수 있다
public abstract class GameChip {
	// 닌텐도에 들어갈 수 있는 모든 게임칩의 공통의 부모 클래스
	
	public void temp() {
		System.out.println("임의로 만든 메소드");
	}
	
	
	
	public abstract void gameStart();
	// 1. 추상 메소드
	// - {}가 없는 메소드
	// - 선언(틀:메소드명,매개변수,리턴타입)은 되어있으나
	// - 로직이 구현되지 않은 메소드
	// - abstract 키워드 사용
}
