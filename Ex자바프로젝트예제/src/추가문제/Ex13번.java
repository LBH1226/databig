package 추가문제;

public class Ex13번 {

	public static void main(String[] args) {

		String score = "AABCDACDDDF";
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		char[] array = {'A','B','C','D','E'};
		char[] array1 = {'a','b','c','d','e'};
		
		
		for(int i = 0; i<score.length(); i++) {
			if(score.charAt(i)=='A') {
				a++;
			}
			if(score.charAt(i)=='B') {
				b++;
			}
			if(score.charAt(i)=='C') {
				c++;
			}
			if(score.charAt(i)=='D') {
				d++;
			}
			if(score.charAt(i)=='F') {
				f++;
			}
		}
		
		System.out.println("A : "+a+"명");
		System.out.println("B : "+b+"명");
		System.out.println("C : "+c+"명");
		System.out.println("D : "+d+"명");
		System.out.println("F : "+f+"명");
	}

}
