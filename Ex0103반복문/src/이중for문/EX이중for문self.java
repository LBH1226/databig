package 이중for문;

public class EX이중for문self {

	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) {

			for (int i = 10 - j; i >= 1; i--) {

				System.out.print("*");
			}

			for (int k = 1; k < j; k++) {

				System.out.print(" ");
			}

			for (int l = 1; l < j; l++) {
				System.out.print(" ");
			}
			for (int u = 10 - j; u >= 1; u--) {

				System.out.print("*");
			}

			System.out.println("");
		}

		for (int a = 1; a <= 9; a++) {

			for (int b = 1; b <= a; b++) {

				System.out.print("*");
			}

			for (int c = 10 - a; c > 1; c--) {

				System.out.print(" ");
			}

			for (int d = 10 - a; d > 1; d--) {
				System.out.print(" ");
			}
			for (int e = 1; e <= a; e++) {

				System.out.print("*");
			}

			System.out.println("");
		}

	}

}
