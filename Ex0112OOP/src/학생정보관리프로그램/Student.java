package 학생정보관리프로그램;

public class Student {
	
	// 1.Field(이름,학번,나이,자바점수,웹점수,안드로이드점수)
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	
	// 생성자(Constructor)
	// --> 객체를 생성하는 순간에 실행되는 메소드
	// --> 필드에 있는 데이터를 개체를 생성하는 순간에 초기화(초기값을넣어준다)를
	//     시켜줄 수 있도록 로직 작성
	// 1) 리턴타입을 지정조차 하지 않는다(void도 작성안함)
	// 2) 생성자의 이름은 클래스 이름과 동일해야한다(대소문자까지)
	//    클래스 이름 첫글자는 대문자
	// 3) 생성자도 결국 메소드이다
	public Student(String name, String number, int age) {
		this.name=name;
		this.number=number;
		this.age=age;

	}

	// 4) 매개변수가 아무것도 없는 생성자를 기본생성자라고 하는데(default constructor)
    //    생략 가능하다
	//    단, 새로운 나만의 생성자(위 생성자)를 만들게 되면 기본 생성자는 덮어씌워진다 
	// 5) 생성자도 오버로딩(중복정의)가 가능하다
	//    오버로딩 : 메소드의 이름과 리턴타입이 동일한 상태에서
	//             매개변수의 개수와 타입을 다르게 중복으로 정의하는 메소드 정의 기법
	public Student() {

	}

	// 2. Method
	// getter 메소드
	// --> 클래스 내부에 있는 필드 값을
	//     외부(다른 클래스)에서 가져갈 수 있는 메소드
	public String getName() {
		return name;
		
	}
	
	// setter 메소드
	// --> 클래스 내부에 있는 필드 값을
	//     외부(다른 클래스)에서 수정할 수 있도록 하는 메소드
	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	//getters, setters 자동완성 단축키
	//alt + shift + s --> Generate Getters and Setters 옵션
	//마우스 우클릭 -> Sourse -> Generate Getters and Setters 옵션
	
	//생성자 자동완성 단축키
	//alt + shift + s --> Generate Constructor using Fields
}



