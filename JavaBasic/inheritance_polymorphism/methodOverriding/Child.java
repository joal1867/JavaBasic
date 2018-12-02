package methodOverriding;

public class Child extends Parent {
	//Method Overriding(재정의) : 상위클래스에 있는 메소드를 하위 클래스에서 만드는것 
	//Parent클래스(상위클래스)의 display메소드를 Child클래스(하위클래스)에서 오버라이딩  
	// @Override 어노테이션을 붙였을 때, 에러가 발생하지 않으면 제대로 오버라이딩 된 것입니다. 
	@Override
	public void disp() {
		System.out.println("하위클래스의 메소드");
	}
	
	//Child클래스(하위클래스)에서 새로 생성한 메소드 
	public void print() {
		System.out.println("나는?");
	}
}
