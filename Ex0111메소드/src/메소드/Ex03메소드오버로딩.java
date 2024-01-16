package 메소드;

public class Ex03메소드오버로딩 {

	public static void main(String[] args) {
		// 메소드 사용
		// 메소드 오버로딩(중복정의)
		// 메개변수의 타입을 다르게 하거나 갯수를 다르게 해야 
		// 구분해서 어떤 메소드에 들어갈수 있는지 컴퓨터가 판별할수있다
		System.out.println(add(12.,2.5));
		System.out.println(add(1.2, 3.5));
	}
	// 메소드 오버로딩 성립 조건
	// 1. 메소드 이름이 같아야한다
	// 2. 매개변수의 갯수 혹은 자료형(타입)이 달라야한다
	// 3. 매개변수와 매소드 이름이 같고 리턴 타입만 다른경우는 오버로딩이 아니다
	private static int add(int num1, int num2) {
		return num1 + num2;
	}

	private static double add(double num1, double num2) {
		return num1 + num2;
	}
	

}
