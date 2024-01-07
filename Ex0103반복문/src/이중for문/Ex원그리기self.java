package 이중for문;

public class Ex원그리기self {

	final static int N = 16;
	public static void main(String[] args) {

		// x^2 + y^2 = r^2는 원점을 중심으로 하는 원의 방정식입니다.
		  for(int i = -N; i <= N; i++)
		  {
		   for(int j = -N; j <= N; j++)
		   {
		    if(i * i + j * j <= N * N)
		    {
		     System.out.print("*");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		   }
		   System.out.println();
		  }
		 }
		

		
	

}
