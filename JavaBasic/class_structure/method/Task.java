package method;

public class Task {
	// *접근지정자 public : 어디에서나 사용이 가능
	public void javaDisplay() {
		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("Hello Java");
		}
	}

	// 매개변수 : 메소드를 수행할 때 필요한 데이터
	public void loop(int n) {
		int i = 0;
		while (i < n) {
			System.out.println("Hello, World");
			i = i + 1;
			// return : 메소드의 수행을 종료하고 호출한 곳으로 돌아가는 명령어
			// Hello, World를 한번만 출력하고 TaskUse클래스의 obj.loop로 돌아갑니다.
			// return;
		}
	}

	// instance 메소드
	// 예.로그인 메소드
	// return *메소드의 수행을 종료하고 호출한 곳으로 돌아갈때, 데이터를 가지고 돌아가려면 메소드 앞에 자료형 기입
	public boolean login(String id, String pw) {
		if (id.equals("root") & pw.equals("1234")) {
			System.out.println("로그인성공");
			return true;
		} else {
			System.out.println("없는 아이디이거나 비밀번호가 틀렸습니다. ");
			return false;
		}
	}

	// static 메소드
	// 예.회원탈퇴 메소드
	public static boolean deleteMember(String id, String pw) {
		if (id.equals("root") & pw.equals("1234")) {
			System.out.println("회원탈퇴");
			return true;
		} else {
			System.out.println("회원탈퇴실패");
			return false;
		}
	}


	// 재귀호출(recursive call) : 메소드가 자기자신을 다시 호출하는것
	// 메모리 사용량도 늘어나고 속도가 느리지만, 코드를 간결해집니다.
	// 예) 1부터 n까지의 합을 재귀를 이용해서 리턴해주는 함수
	public int sum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}

	
	// 가변매개변수 : 개수에 상관없이 매개변수의 대입이 가능한 문법 
	// 매개변수에.. 있으면 매
	public static int sum(int... ar) {
		int tot = 0;
		// heap에 있는 데이터를 stack에 저장;
		// 자주 사용하기 때문에 heap에 있으면 효율이 떨어진다.
		int len = ar.length;

		for (int i = 0; i < len; i = i + 1) {
			tot = tot + ar[i];
		}
		return tot;
	}
}
