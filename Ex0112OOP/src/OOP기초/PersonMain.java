package OOP기초;

public class PersonMain {

	//실행할 수 있는 공간
	public static void main(String[] args) {

		// 1. 설계도를 기반으로 객체 생성
		// 자료형 변수명 = new 자료형();
		// 사람자료형 만들기 (변수명은 person)
		Person person = new Person();
		System.out.println(person);
		System.out.println(person.name);
		// field에 아무것도 넣어주지 않았을때는 기본값을 세팅됨
		// String->null, int->0
		person.name = "이병헌";
		person.age = 28;
		person.gender = "male";

		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.gender);
		
		// 하나의 클래스로 여러개의 객체 생성 가능
		Person person2 = new Person();
		person2.name = "김동완";
		person2.age = 28;
		person2.gender = "male";
		
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.gender);
		
		person2.talk();

	}
}
