package method;

public class TaskMain {
	public static void main(String [] ars) {
		//Method란, 한번에 수행되어야할 코드의 모임을 하나의 이름으로 묶는 것 
		//1.반복되는 코드를 묶거나 2.지나치게 긴 코드를 분할해서 묶기 위해 사용합니다. 	
		//예1.
		//Hello Java 3번 출력
		//방1.수정해야하는 경우 3개의 명령문 모두 수정 - 유지보수 문제 
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		//방2.메소드 사용 - 수정시, 명령문 1개만 수정하면 됩니다. 
		for(int i=0;i<3;i=i+1) {
			System.out.println("Hello Java");
		}	
		//예2.
		//"Hello Java"3번, "Hello Eclipse"1번, "Hello Java"3번 출력
		//반복작업은 메소드로 묶고 다른 클래스에 넣어 인스턴스를 만들어 호출 
		//실행속도는 느리지만, 코드가 간결하며 유지보수가 수월해집니다. 
		Task task = new Task();
		task.javaDisplay();
		System.out.println("Hello Eclipse");
		task.javaDisplay();
		
		
		//매개변수 
		//메소드 호출시, 반드시 매개변수를 대입해서 호출해야 합니다. 
		//매개변수 대입하지 않은 경우 에러메시지 : "The method loop(int) in the type Task is not applicable for the arguments()"
		Task obj = new Task();
		obj.loop(3);
		obj.loop(2);
		
		
		//instance메소드 호출 
		//예.로그인 메소드 호출 
		Task job = new Task();
		//"로그인 성공"출력 : 콘솔창에만 나타날 뿐 자바는 가입성공 여부에 대해서 알지 못한다.
		job.login("root", "1234");
		//boolean r 변수를 이용해 true인 경우, false인 경우 각각 수행할 업무 지시가 가능 
		//boolean r = job.login("root", "1234");
		
		
		//static메소드 호출 
		//예.회원탈퇴 메소드 호출
		Task.deleteMember("root", "1234");
		
		 
		//재귀함수호출 
		Task plus = new Task();
		System.out.println(plus.sum(10));
		
		
		//가변매개변수 호출 
		System.out.println(Task.sum(10,30));
		System.out.println(Task.sum(10,20,30));
	}
}
