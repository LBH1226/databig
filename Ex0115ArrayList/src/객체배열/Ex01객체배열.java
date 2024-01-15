package 객체배열;



public class Ex01객체배열 {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료형[] 변수명 = new 자료형[칸수];
		// 포켓몬 자료형 3개를 보관할 수 있는 bag 배열 생성
		Pocketmon[] bag=new Pocketmon[3];
		
		// 객체 배열의 0번방 출력
		System.out.println("배열의 0번반 : "+bag[0]);
		
		// 객체 배열의 0번방에 포켓몬을 넣어보자
		// 피카츄/전기/백만볼트/hp:100/atk:15
//		Pocketmon pikachu = new Pocketmon("피카츄", 100, 15, "백만볼트", "전기");
//		bag[0]=pikachu;
		bag[0]= new Pocketmon("피카츄", 100, 15, "백만볼트", "전기");
		System.out.println(bag[0].getName());
		
		// bag 1번방 >> 파이리/불/화염방사/90/12
		// bag 2번방 >> 꼬부기/물/물대포/88/14
		bag[1]= new Pocketmon("파이리", 90, 12, "화염방사", "불");
		bag[2]= new Pocketmon("꼬부기", 88, 14, "물대포", "물");
		
		System.out.println("=====포켓몬 정보 출력=====");
		for (int i = 0; i < bag.length; i++) {
			System.out.print(bag[i].getName()+"\t"+bag[i].getType()+"\t"+bag[i].getHp());
			System.out.println();
		}
		
		// for-each문
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작원리 : 배열안에 저장되어 있는 데이터를 for문에서 순차적으로 꺼내서
		//          콜론(:) 기준으로 왼쪽에 있는 변수에 담아줌
		for(Pocketmon b:bag) {
			System.out.print(b.getName()+"\t"+b.getType()+"\t"+b.getHp());
			System.out.println();
		}
		
		
	}

}
