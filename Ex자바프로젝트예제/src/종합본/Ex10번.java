package 종합본;

public class Ex10번 {

	public static void main(String[] args) {

		int[]array= {10,56,21,55,35,54,14,26};
		
		
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(max<=array[i]) {
				max=array[i];
			}
			if(min>=array[i]) {
				min=array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
