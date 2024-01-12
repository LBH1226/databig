package 통장관리프로그램;

public class Bankbook {

	// 통장 설계 도면
	// 통장 설계도면 --> 통장을 관리할 수 있는 우리만의 자료형 만들기

	// 1.Field(Data, 속성)
	// 잔액(money)
	// 다른 클래스에서 접근하지 못하게 하는 방법 - private 붙이기
	// 정보은닉을 지켜주어야한다 (사용자가 임의로 변경한는것을 막아줌)
	private int money;

	// 2. Method(행위, 로직, 기능)
	// 입금하다, 출금하다, 잔액확인 (deposit, withdraw, showMoney)
	// this : 현재 클래스 자체를 의미하는 키워드
	public void deposit(int money) {
		this.money += money;
	}

	public void withdraw(int money) {
		this.money -= money;
	}

	public int showMoney() {
		return money ;
	}

}
