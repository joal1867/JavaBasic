package inheritance;

public class Main {

	public static void main(String[] args) {
		//상속(is a 관계) : 하위클래스가 상위클래스의 모든 멤버를 물려받는 것 
		Sub sub = new Sub();
		//상속 확인 
		//Sub클래스(하위클래스)가 Super클래스(상위클래스)의 멤버를 물려받았기 때문에 setName이 가능합니다. 
		sub.setName("조아라");
		sub.setPhone("1234567890");

	}

}
