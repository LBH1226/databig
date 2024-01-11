package 보너스문제;

public class 보너스문제6 {

	public static void main(String[] args) {

		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과확인 : "+result);
	}

	
	private static int powerN(int base, int n) {
		int result = 0;
		int num = 1;
		for(int i = 0; i<n; i++) {
			num *= base;
			
		}
		
		result = num;
		
		
		return result;
	}
	
	
	
}
