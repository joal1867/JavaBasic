package review;

public class MemberVO {
	//저정할 항목에 대한 인스턴스 변수 선언 
	private String name;
	private int age;
	private String phone;
	
	//인스턴스 변수 사용을 위한 접근자 메소드 생성 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	//인스턴스의 내용을 묶어 하나로 만들어 주는 toString 메소드 생성 : 디버깅  
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	//매개변수가 없는 생성자 : default constructor 
	public MemberVO() {
		super();	
	}
	
	//매개변수가 있는 생성자 : dependency injection 
	public MemberVO(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
}
