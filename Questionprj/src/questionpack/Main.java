package questionpack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		QuestionDAO dao = new QuestionDAO();
		QuestionDTO dto = dao.login(null, null);
		QuestionDTO you = null;
		
		while (true) {
			System.out.println("[1]로그인\n[2]랭킹확인\n[3]회원가입"); // 처음화면엔 게임시작을 지우고 회원가입과 랭킹확인만
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("\n로그인을 시작합니다.");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				dto = dao.login(id, pw);
				if (dto != null) {
					// 로그인 성공했을때

					System.out.println(dto.getName() + "님 환영합니다");
					System.out.println("계급 : " + dto.getGrade() + "\t최고 점수: " + dto.getBest_score());
					you = dto;
					break;
				} else {
					// 로그인 실패했을때
					System.out.println("로그인 실패했습니다");
					System.out.println("아이디와 비밀번호를 확인해주세요");
				}

			} else if (choice == 2) {
				System.out.println("====랭킹확인====");

				QuestionDAO dao1 = new QuestionDAO();
				ArrayList<QuestionDTO> dtolist = dao.serch();

				for (int i = 0; i < dtolist.size(); i++) {
					System.out.println(i + 1 + "등 :" + dtolist.get(i).getName() + "\t계급 :" + dtolist.get(i).getGrade()
							+ "\t최고 점수:" + dtolist.get(i).getBest_score());
				}
			} else if (choice == 3) {
				System.out.println("====회원가입====");
				System.out.println("회원가입을 시작합니다");
				System.out.print("ID 입력 : ");
				String id = sc.next();

				System.out.print("PW 입력 : ");
				String pw = sc.next();

				System.out.print("name 입력 : ");
				String name = sc.next();
				QuestionDAO dao1 = new QuestionDAO();
				QuestionDTO dto1 = new QuestionDTO(name, id, pw);
				int row = dao1.join(dto);
				if (row > 0) {
					System.out.println("회원가입 성공");

				} else {
					System.out.println("회원가입 실패");

				}

			}
		}
		
		
		
		
		Random ran = new Random();
		
		while (true) {
			System.out.println("[1]게임스타트 [2]게임종료"); 
			int choice = sc.nextInt();
			if (choice == 1) {
				while(true) {
				int num = ran.nextInt(12)+1;
				
				QuestionDAO dao1 = new QuestionDAO();
				ArrayList<QuestionDTO> questionDa = dao1.questionData(num);
				
				
				
				System.out.printf(questionDa.get(0).getName(), questionDa.get(0).getGrade(), questionDa.get(0).getBest_score() );
				
				
				}
				
				
				
				
			}else if(choice == 2) {
				break;
			}else {
				System.out.println("번호를 다시 입력하세요");
			}
			}
		
		
		
		

	}
}