package polymophism;

public class Main {

	public static void main(String[] args) {
		//다형성(Polymorphism) : 동일한 코드가 어떤 객체가 대입되었는지에 따라서 다른 메소드를 호출하는 것

		//1.다형성을 이용하지 않고 구현한 경우 : 서로 다른 3개의 변수 필요 
		//3가지(테란,저그,프로토스)클래스의 공격하는 메소드를 호출
//		Terran terran = new Terran();
//		terran.attack();
//		Zerg zerg = new Zerg();
//		zerg.attack();
//		Protoss protoss = new Protoss();
//		protoss.attack();
		
		
		//2.다형성을 이용해 구현한 경우 : 하나의 변수에 3개 클래스의 인스턴스 주소 대입이 가능 
		//오버라이딩 된 메소드가 아닐 경우 에러발생 : The method attack() is undefined for the type Starcraft
		//ㄴ이유 : 오버라이딩 되었을 때만, 하위클래스의 메소드를 호출할 수 있습니다. 
		Starcraft star = new Terran();
		star.attack();
		star = new Zerg();
		star.attack();
		star = new Protoss();
		star.attack();


	}

}
