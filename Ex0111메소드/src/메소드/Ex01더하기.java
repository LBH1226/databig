package 메소드;

public class Ex01더하기 {

	public static void main(String[] args) {
		// 메소드 사용하기(main 영역 안쪽에서 사용)
		double result = addDouble(4.2, 3.14);
		System.out.println(result);

		int result1 = subNum(1, 5);
		System.out.println(result1);

		printHell();
	}

	// 3. "Hello World"를 5번 출력하는 메소드
	public static void printHell() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}

	}

	// 2. 빼기를 수행하는 메소드 생성
	// 리턴 타입 : int / 매개변수 : int 2개 / 메소드명 : subNum
	// 단, 큰수에서 작은 수를 뺀 결과를 돌려주기
	public static int subNum(int num1, int num2) {
		int result = 0;

		result = num1 > num2 ? num1 - num2 : num2 - num1;
		return result;
	}

	// 1. 메소드 생성(main 영역 벗어나서 작성하기)
	// static : 저장공간, 제일먼저 실행되는 공간
	// main에 변수를 올려줄거면 main과 같은 저장공간 쓰기
	// return은 중괄호 안 맨 마지막에 와야한다
	// ->메소드는 return을 만나면 데이터를 반환하고 끝난다
	public static double addDouble(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

}
