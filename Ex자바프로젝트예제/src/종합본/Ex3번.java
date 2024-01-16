package 종합본;

public class Ex3번 {
	
	public static void main(String[] args) {
		
	
	//array배열에 1to100까지 넣어주기
	int[] array = new int[100];
	for( int i = 0; i<array.length; i++) {
		array[i]=i+1;
	}
	
	//array 배열 값을 추출
	int sum = 0;
	int a =1;
	
	for (int i = 0; i < array.length; i++) {
		if(array[i]%2==0) {
			a=array[i]*-1;
			System.out.print(a+" ");
		}else {
			a= array[i];
			System.out.print(a+" ");
		}
		sum += a;
	}
	System.out.println();
	System.out.println("결과 : "+sum);

}
}
