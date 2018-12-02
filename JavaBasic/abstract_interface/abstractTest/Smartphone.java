package abstractTest;

//추상 클래스 : 상속을 통해서만 사용이 가능한 클래스로 자신의 인스턴스를 만들 수 없습니다. 
public abstract class Smartphone { 
	
	//추상 메소드 : 내용이 없는 메소드 
	//추상클래스와 인터페이에만 존재하는 메소드로, 재정의해서 사용해야 합니다. 
	
	//하위 클래스의 메소드와 오버라이딩 관계를 만들기 위해서 생성한 메소드.
	public abstract void call();
		
	
}
