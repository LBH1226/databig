package switch문;

import java.util.Scanner;

public class Ex01학점계산프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		//break안쓰면 값이 참인 부분부터 아래까지 전부 출력됨
		//조건식 부분 결과값은 참거짓이 아니라 값이 확실히 나오는 식으로
		
		switch(totalScore/10) {
		case 10:
		case 9:
			System.out.println("A학점입니다");
			break;
		case 8:
			System.out.println("B학점입니다");
			break;
		case 7:
			System.out.println("C학점입니다");
			break;
		default:
			System.out.println("D학점입니다");
			break;
		}
	}
}

//	char grade = 'A';
//	switch(totalScore/10) {
//	case 10:
//	case 9:
//		grade = 'A';
//		break;
//	case 8:
//		grade = 'B';
//		break;
//	case 7:
//		grade = 'C';
//		break;
//	default:
//		grade = 'D';
//		break;
//	}
//	System.out.println(grade + "학점입니다.");
//
//}
//}

