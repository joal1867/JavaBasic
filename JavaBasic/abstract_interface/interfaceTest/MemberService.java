package interfaceTest;

//Interface : 추상메소드, 상수(final변수), default 메소드를 가지는 java의 개체 
//인터페이스에서 선언문(모형)를 구성하고, implements한 클래스에서 실제내용을 구현합니다. 
//ㄴ템플릿 메소드 패턴 : 선언과 구현 분리 
public interface MemberService {

	// 인터페이스의 메소드는 abstract를 붙이지 않아도 추상메소드입니다.

	// 아이디 중복체크를 위한 메소드 선언
	public boolean idCheck(String id);

	// 로그인 처리를 위한 메소드 선언
	public int login(String id, String password);
}
