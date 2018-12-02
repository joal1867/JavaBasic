package methodOverriding;

public class Main {
	public static void main(String[] args) {
//		*참조형 변수간의 대입 : 참조형 변수를 선언할 때 사용한 자료의 데이터만 대입이 가능합니다. 
//		*객체지향 언어에, 참조형 변수간의 대입  
//		1)상위클래스타입으로 선언된 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있습니다. 
		Parent obj = new Child();
		
//		2)하위클래스 타입으로 선언된 변수에 상위클래스 타입의 인스턴스 변수를 대입하려면 강제형변환이 필요합니다. 
//		에러메시지 : Type mismatch: cannot convert from Parent to Child
//		Child obj1 = new Parent();
//		Child obj1 = (Child)new Parent();
//		빨간 밑줄은 나오지 않은상태에서 실행이 되지 않습니다. -> 에러가 아닌 예외의 경우!
//		예외메시지 Exception in thread "main" java.lang.ClassCastException
//					: methodOverriding.Parent cannot be cast to methodOverriding.Child
//		 			at methodOverriding.Main.main(Main.java:13)
		
		
		
//		소속된 멤버를 찾을 경우, 참조형 변수를 선언했을 때 사용한 멤버를 호출합니다. 
//		but, 출력결과 : "하위클래스 메소드"
//		 ㄴ이유 : 오버라이딩 된 메소드는 참조형 변수를 선언했을 때의 자료형으로 멤버를 호출하지않고, 
//				new했을 때의 자료형으로 멤버를 호출합니다.  
		obj.disp();
		
		//에러 메시지 : The method print() is undefined for the type Parent
		//print()는 오바라이딩 된 메소드가 아닙니다. -> 참조형 변수를 선언했을 때 사용한 멤버(상위클래스-Parent)를 호출
		//but, Parent클래스(상위클래스)에는 print()메소드가 없기 때문에 Child로 형변환해서 호출합니다. 
		((Child)obj).print();

	}
}
