package 이중for문;

public class Ex이중for문self3 {

	public static void main(String[] args) {

		
		for (int j = 1; j <= 9; j++) {

			for (int y = 1; y <= 9; y++) {
				System.out.print("*");
			}

			for (int i1 = 10 - j; i1 >= 1; i1--) {

				System.out.print("*");
			}

			for (int k1 = 1; k1 < j; k1++) {

				System.out.print(" ");
			}

			for (int l1 = 1; l1 < j; l1++) {
				System.out.print(" ");
			}
			for (int u1 = 10 - j; u1 >= 1; u1--) {

				System.out.print("*");

			}

			for (int y1 = 1; y1 <= 9; y1++) {
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
