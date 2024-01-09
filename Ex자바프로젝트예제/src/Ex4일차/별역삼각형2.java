package Ex4일차;

public class 별역삼각형2 {

	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {

			for (int k = 5-j; k >= 0; k--) {

				System.out.print(" ");
				}
			for (int i = 1; i <= j; i++) {

				System.out.print("*");
			    }
			
				System.out.println("");
		}
	}
}
