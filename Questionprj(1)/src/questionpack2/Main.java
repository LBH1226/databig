package questionpack2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
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

				QuestionDAO dao = new QuestionDAO();
				QuestionDTO dto = dao.login(id, pw);
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

				QuestionDAO dao = new QuestionDAO();
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
				QuestionDAO dao = new QuestionDAO();
				QuestionDTO dto = new QuestionDTO(name, id, pw);
				int row = dao.join(dto);
				if (row > 0) {
					System.out.println("회원가입 성공");

				} else {
					System.out.println("회원가입 실패");

				}

			}
			
		}
		
//		System.out.println(you.getName()+"님 게임을 시작하겠습니다");
		
		
		while(true) {
			System.out.println(you.getName()+"님 무엇을할까요?");
			System.out.println("[1]게임시작\t[2]게임종료");
			int choice = sc.nextInt();
			
			
			if(choice==1) {
				
				
				int a = 0;
				while(true) {
					QuestionDAO dao = new QuestionDAO();
					ArrayList<QuestionDTO> qd = dao.quiz();
					
					
					
					System.out.println(qd.get(1).getQuestion());//get(정수형 변수)으로 랜덤출제
					System.out.println();
					String input = sc.next();
					String answer = qd.get(1).getAnswer();
					a++;
					
					if(input.equals(answer)) {
						System.out.println("정답입니다 정답은 :"+answer +" 입니다");
						
						
					}else {
						System.out.println("틀렸습니다.");
						
						
					}
					
				}
			}
			
			
			
		}
		
		
		
	}
}