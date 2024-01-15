package PocketmonGame;

import java.util.Scanner;

public class PocketmonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 실행공간

		// 두마리 포켓몬 생성(객체 생성)
		// 메타몽/노멀/변신하기/hp:80/atk:10
		// 피마츄/전기/백만볼트/hp:100/atk:15

		Pocketmon metamong = new Pocketmon("메타몽", 80, 10, "변신하기", "노멀");
		Pocketmon pikachu = new Pocketmon("피카츄", 100, 15, "백만볼트", "전기");

		while (true) {
			System.out.println("포켓몬을 선택하세요");
			System.out.print("[1]메타몽, [2]피카츄 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 사용자가 메타몽을 선택
				System.out.println("공격을 선택하세요");
				System.out.print("[1]일반공격 [2]스킬공격 >> ");
				int choiceAtk = sc.nextInt();

				if (choiceAtk == 1) {
					// 메타몽이 피카츄를 일반공격
					// 1. 메타몽이 atk만큼 피카츄의 hp 감소
					// (피카츄의 현재 hp) - (메타몽의 atk)
					pikachu.setHp(pikachu.getHp() - metamong.getAtk());
					// 2. 두마리 포켓몬의 현재 hp 출력
					System.out.println("피카츄 hp : " + pikachu.getHp());
					System.out.println("메타몽 hp : " + metamong.getHp());

				} else if (choiceAtk == 2) {
					// 메타몽이 피카츄를 스킬공격
					// 1. 메타몽의 atk의 1.5배만큼 피카츄의 hp 감소
					pikachu.setHp((int) (pikachu.getHp() - metamong.getAtk() * 1.5));

					System.out.println(metamong.getName() + "!!" + metamong.getSkill() + "!!");
					System.out.println("피카츄 hp : " + pikachu.getHp());
					System.out.println("메타몽 hp : " + metamong.getHp());

				}

			} else if (choice == 2) {
				// 사용자가 피카츄를 선택
				System.out.println("공격을 선택하세요");
				System.out.print("[1]일반공격 [2]스킬공격 >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 메타몽이 피카츄를 일반공격
					metamong.setHp(metamong.getHp() - pikachu.getAtk());
					// 2. 두마리 포켓몬의 현재 hp 출력
					System.out.println("피카츄 hp : " + pikachu.getHp());
					System.out.println("메타몽 hp : " + metamong.getHp());

				} else if (choiceAtk == 2) {
					// 메타몽이 피카츄를 스킬공격
					metamong.setHp((int) (metamong.getHp() - pikachu.getAtk() * 1.5));

					System.out.println(pikachu.getName() + "!!" + pikachu.getSkill() + "!!");
					System.out.println("피카츄 hp : " + pikachu.getHp());
					System.out.println("메타몽 hp : " + metamong.getHp());
				}

			} else {
				System.out.println("번호를 잘못누르셨습니다");
			}
			
			// 메타몽 or 피카츄 체력이 0과 같거나 작아지면 종료
			if(metamong.getHp()<=0) {
				System.out.println("피카츄 승리!!");
				break;
			}else if(pikachu.getHp()<=0) {
				System.out.println("메타몽 승리!!");
				break;
			}

		}
	}

}
