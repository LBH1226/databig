package 상속기초;

public class Main {

	public static void main(String[] args) {

		// 1. Parent 자료형 기반으로 p 객체 생성
		Parent p = new Parent();
		
		p.makeJjam();
		
		// 2. Child 자료형 기반으로 c 객체 생성
		Child c = new Child();
		c.makeJjam();
		// 메소드 오버라이딩을 하면 오버라이딩 한 메소드를 호출해서 사용
		c.makeJjajang();
		// 상속의 특징 3가지
		// 1. 다중상속을 지원하지 않는다 (부모가 둘이 될순 없다)
		// 2. 상속의 횟수에 제한을 두지 않는다 (상속의 상속의 상속이 가능)
		// 3. 모든 클래스는 java.lang.Object(모든 클래스는 Object를 상속받음(최상위클래스))
		
		// 객체의 형변환(Casting)
		// Reference Type 에서의 형변환은 반드시 상속이 전제되어 있어야한다
		// --> 객체 내의 필드, 메소드에 접근권한 강제형변환, 자동형변환 결정한다 
		// Child에서 자료를 가져옴
		// 1) UpCasting(업캐스팅)
		// : 자식(서브,하위)클래스가 부모(슈퍼,상위)클래스 타입으로
		//   자동 형변환 하는것
		// 부모자료형 변수명 = new 자식자료형();
		Parent p2 = new Child();
		
		p2.makeTang();
		// 만약에 자식 클래스에서 부모클래스의 메소드를 오버라이딩(재정의) 한 경우
		// 업캐스팅으로 만들어진 객체는 자식클래스의 메소드를 호출
		p2.makeJjam();
		
		
		// 2) DownCasting(다운캐스팅)
		// : 부모 클래스 타입이 자식 클래스로 형변환
		// Child c2 = (Child)new Parent();
		// --> Exception 오류(자바책 p.153)
		//     : 구문 오류는 없으나 실행했을 때 예외상황이 발생한는것
		// 코드가 빨간줄 뜬다 --> Syntax Error(구문오류)
		// 다운캐스팅은 업캐스팅된 객체를 강제 형변환으로
		// 본래의 자료형태로 되돌려 놓는 것
		// 전제조건 : 업캐스팅된 객체만 다운캐스팅 가능
		Child c2 = (Child)p2;
		c2.makeJjam();
		c2.makeJjajang();
		c2.makeTang();
		// 본래 자신이 가지고 있던 메소드를 사용할 수 있다
		
	}

}
