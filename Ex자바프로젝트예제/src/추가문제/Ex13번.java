package 추가문제;

public class Ex13번 {

	public static void main(String[] args) {

		String score = "AABCDACDDDF";
		
		
		int [] array = new int [5];
		char [] array1 = {'A','B','C','D','F'};
		
		
		for(int i = 0; i<score.length(); i++) {
			for (int j = 0; j < array.length; j++) {
				if(score.charAt(i)==array1[j]) {
					array[j]++;
				}
			}
		}
			
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array1[i]+" : "+array[i]+"명");
		}
		

	}

}
