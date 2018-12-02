package innerclass;

public class Outer {
	
	//Inner Class(내부클래스) : 클래스 안에 존재하는 클래스 
	
	//local inner class : 메소드 안에 만드는 클래스
	//메소드가 호출되서 실행될 때 만들어졌다가 없어지는 클래스
	//클래스가 메소드를 호출할때만 존재하기 때문에 메모리 효율을 높일 수도 있습니다.
	public void sample() {
		class LocalInner{			
		}
	}
	
	
	//Static inner class : static 멤버를 소유한 inner class 
	//*내부클래스 안에 static 멤버가 있으면 일반 inner class는 에러를 발생시킵니다.
	static class StaticInner{
		static int n;  
	}
	

	//innner class : 클래스 안에 존재하는 클래스 
	class Inner{
	}
		
}
