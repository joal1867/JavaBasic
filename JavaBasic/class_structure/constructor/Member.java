package constructor;

public class Member {
	//생성자를 이용하지 않고 초기화하는 방법 
	//1.static Initializer : 클래스가 로딩될때 실행 
	static { 
		System.out.println("맨 처음 한번만 수행되는 내용");
	}

	//2.nostatic Initializer : 객체가 생성될때마다 호출 
	{ 
		System.out.println("인스턴스를 만들 때마다 수행되는 내용");
	}
	
	
	//이름을 저장하기 위한 인스턴스 변수 선언 
	private String name;
	//외부 클래스에서 인스턴스 변수를 사용하기 위해 접근자 메소드 생성 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//생성자 : 인스턴스를 생성할 때 호출되는 메소드로 객체의 초기화를 담당합니다. 
	//매개변수가 없는 생성자 : default constructor 
	public Member(){
		name="noname";
	}
	//생성자 오버로딩 
	//매개변수가 있는 생성자 : 외부에서 값을 받아 인스턴스 변수를 초기화할때 사용 (Dependency Injection)
	public Member(String arg) {
		name=arg;
	}
	
	
	//This : 인스턴스메소드나 생성자에서만 사용이 가능한 인스턴스 자신에 대한 포인터 
	public void display() {
		String name = "지역변수 name";
		System.out.println(name);
		//this를 붙이면 지역변수에서 찾지 않고, instance변수에서 찾아온다.
		System.out.println(this.name);
	}
	

}
