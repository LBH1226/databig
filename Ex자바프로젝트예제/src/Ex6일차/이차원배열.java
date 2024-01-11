package Ex6일차;

public class 이차원배열 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];



		int num = 1;
		array[0][0] = num;
		for (int i = 0; i < array.length; i++) {
			array[i][0] = num++;

			for (int j = 1; j < array.length; j++) {
				array[i][j] = array[i][j - 1] + 5;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
		}
		
		
		
		
	}

}
