package 통장관리프로그램;

public class BankMain {

	//실행공간
	public static void main(String[] args) {

		// 1. Bankbook 설계도면을 기반으로 bank1 객체 생성
		Bankbook bank1 = new Bankbook();
		// money가 private가 붙었기 때문에 실행안됨
//		System.out.println(bank1.money);
		
		// 2. bank1에 1000원 입금
		bank1.deposit(1000);
		// 3. bank1에 300원 출금
		bank1.withdraw(300);
		// 4. bank1의 잔액 확인
		System.out.println(bank1.showMoney()+"원");
		
	}

}
