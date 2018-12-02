package interfaceTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 인터페이스는 자신의 객체를 생성할수는 없지만, 참조형 변수는 만들 수 있습니다.
		// 인터페이스로 만든 참조형 변수는 자신을 implements한 클래스의 인스턴스를 대입할 수 있습니다.
		MemberService memberService = new MemberServiceImpl();

		// 아이디 중복처리 메소드 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요");
		String id = sc.nextLine();
		boolean r = memberService.idCheck(id);
		if (r == true) {
			System.out.println("사용가능한 아이디입니다.");
		} else {
			System.out.println("이미존재하는 아이디입니다.");
		}

		// 로그인 처리 메소드 사용
		System.out.println("로그인 할 아이디를 입력하세요");
		id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요");
		String password = sc.nextLine();
		int result = memberService.login(id, password);
		if (result == 0) {
			System.out.println("로그인 성공");
		} else if (result == 1) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (result == 2) {
			System.out.println("없는 아이디입니다.");
		}

	}
}
