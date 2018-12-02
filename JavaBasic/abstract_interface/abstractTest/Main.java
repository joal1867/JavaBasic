package abstractTest;

public class Main {

	public static void main(String[] args) {
		//Smartphone은 추상클래스 이므로 자신의 인스턴스는 생성할 수 없습니다. 
		//에러메시지 : Cannot instantiate the type Smartphone
		//Smartphone smartPhone = new Smartphone();
				
		Smartphone smartPhone = new Iphone();
		smartPhone.call();
		
		smartPhone = new Android();
		smartPhone.call();
		
		
		smartPhone = new WinPhone();
		smartPhone.call();

	}

}
