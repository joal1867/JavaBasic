package variable;

//클래스 생성 
class I {
	//멤버변수(Instance변수) : 클래스내부, 메소드 외부에 static 없이 선언하는 변수
	//인스턴스만 사용가능, 선언하면 0,null이나 false로 자동초기화
	int age;
	
	
	//클래스변수(static,정적변수) : 클래스내부, 메소드 외부에 static을 붙여서 선언하는 변수로 공유가 목적
	//클래스 안에 1개만 생성, 클래스와 인스턴스 모두가 사용가능, 선언하면 0,null이나 false로 자동초기화  
	//*static 변수는 변수명 글자가 기울어져 있습니다. 
	static String name;
	
	
	//final변수 : 값을 변경하지 못하도록 할때 사용하는 변수 
	//1.TEN의 값 수정 불가 
	//static final int TEN = 10; 
	//2.TEN의 값은 a로 고정되어 있지만, a는 수정할 수 있다. 
	static int a =10;
	static final int TEN = a;
} 

public class Main {
	public static void main(String[] args) {
		//인스턴스 
		// I 클래스의 인스턴스(객체)생성 
		I you = new I ();
		// 인스턴스 obj 출력 : toString() 메소드의 결과가 호출 
		// 출력결과 : 클래스이름과 해시코드(참조) 예)variable.I@7852e922
		System.out.println("you: "+you);
		
		
		//지역변수 : 메소드 내에서 만든 변수로 생성한 블록 내에서만 유효
		//*변수b, for문 바깥에서는 사용불가
		for (int b=0;b<3;b=b+1) {
			System.out.println("Hello Java");
		}		
		//지역변수는 반드시 초기화해서 사용해야합니다.
		//int a; 의 에러메시지 : "The local variable a may not have been initialized"
		int a = 0;
		System.out.println("a: "+a);
		
		
		//instance변수는 객체가 만들어질 때마다 별도의 메모리를 할당 받습니다. 
		I obj1 = new I();
		I obj2 = new I();
		System.out.println("obj1: "+obj1.age);
		System.out.println("obj2: "+obj2.age);
		//객체가 각각 별도의 메모리를 할당받기 때문에 obj1.age의 값만 10으로 변경되어서 출력 
		obj1.age=10;
		System.out.println("obj1: "+obj1.age);
		System.out.println("obj2: "+obj2.age);
		
		
		//static변수는 한개만 생성해서 공유하기 때문에 한쪽에서 변경하면 다른 쪽에도 영향을 줍니다. 
		//메모리를 공유해서 사용하기 때문에 obj1.name과 obj2.name 똑같은 값으로 출력 
		//static 변수를 객체를 이용해서 호출하면 에러발생 - 속도가 느려집니다.(직접부르는 것이 아니기 때문)
		//"The static field I.name should be accessed in a static way"
		obj1.name = "조아라";
		System.out.println("obj1: "+obj1.name);
		System.out.println("obj2: "+obj2.name);
		//클래스를 이용해서 static 변수 사용 
		I.name = "조아롸";
	}
}
