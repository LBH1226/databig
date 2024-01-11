package 보너스문제;

public class 보너스문제3 {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 15;
		char op = '-';

		System.out.println(cal(num1, num2, op));

	}

	private static int cal(int num1, int num2, char op) {
		int result = 0;

		if (op == '-') {
			result = num1 > num2 ? num1 - num2 : num2 - num1;
		} else if (op == '+') {
			result = num1 + num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		} else {
			return 0;
		}

		return result;

	}
}
