package Ex3일차;

public class 덧셈뺄셈 {

	public static void main(String[] args) {

		int i = 1;
		int num = 0;
		for (i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.print((-1) * i + " ");
				num -= i;
			} else {
				System.out.print(i + " ");
				num += i;
			}

		}
		System.out.println();
		System.out.println("결과 : " + num);

	}

}
