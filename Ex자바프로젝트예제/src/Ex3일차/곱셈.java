package Ex3일차;

public class 곱셈 {

	public static void main(String[] args) {

		int num = 0;
		int num1 = 0;
		for (int i = 77; i >= 1; i--) {
			num1++;
			num = num + (i * num1);
		}
		System.out.println(num);
	}
}
