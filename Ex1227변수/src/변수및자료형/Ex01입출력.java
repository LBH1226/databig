package 변수및자료형;

// 도구를 꺼내올 때는 반드시 어디에서 꺼낼 지 import 구문을 작성
// 직접 작성하기 보단, 에러에 마우스를 올려서 해결
import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {
		// 주석 : 코드에 영향을 끼치지 않는 메모 역할
        // 단축키
		// 1) 글자 크기 늘리기,줄이기 : ctrl (+) or (-)
		// 2) 한 줄 삭제 : 삭제할 줄 선택 후 ctrl + d
		// 3) ctrl + f11 실행단축키
		// 4) Syso입력 후 ctrl + 스페이스 -> System.out.println 자동완성
		// 5) ctrl + shift + o -> import문 자동완성
	
		// 1. 출력문
		// ---> () 안쪽에 출력하고 싶은 구문 작성
		System.out.println("Hello World");
		System.out.println("이병헌");
		
		// 2. 입력문
		// 2-1) 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 개행(줄바꿈)을 없애고 싶다면 ln 지워주기
		System.out.print("글자를 입력하세요 >> ");
		// 2-2) 입력받기
		sc.next();
		
		
		
	}

}
