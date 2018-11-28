package inheritance;

public class Super {
	// private String name;
	protected String name;

	
	// 매개변수가 없는 생성자 : default생성자
	public Super() {
		super();
	}
	// 매개변수가 있는 생성자
	public Super(String name) {
		super();
		this.name = name;
	}

	
	//접근자 메소드 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
