package inheritance;

public class Sub extends Super {
	// Super클래스(상위클래스)에 default생성자가 없을 경우, 에러발생
	// 에러메시지 : Implicit super constructor Super() is undefined for default
	// constructor. Must define an explicit constructor
	// ㄴ이유 : Sub클래스(하위클래스)에는 Super클래스(상위클래스)의 default생성자를 호출하는 구문이 존재(눈에 보이지는 않지만,기본적으로 추가됩니다.)
	// ㄴ해결 : Sub클래스(하위클래스)에서 Super클래스(상위클래스)의 생성자를 호출
	// cf.또다른 해결 : 상위클래스에 매개변수가 없는 생성자를 추가해줘도 되지만, 상위클래스의 소스파일이 없으면 불가능한 작업
	public Sub(String name) {
		super(name);
	}
	public Sub() {
		super();
	}

	// Sub클래스에서 멤버변수 name을 private으로 생성했을 경우, 에러발생
	// 에러메시지 : The field Super.name is not visible
	// ㄴ이유 : Super클래스(상위클래스)의 private멤버변수느 상속은 되지만, Sub클래스(하위클래스)에서 접근은 불가능
	// ㄴ해결 : private을 protected/public으로 변경 cf.상위클래스의 소스파일이 없으면 불가능 - 접근 불가
	public void I() {
		name = "조아라";
	}
	
	
	private String phone;
	//접근자 메소드 
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
