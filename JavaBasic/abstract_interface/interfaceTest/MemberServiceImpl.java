package interfaceTest;

//MemberService 인터페이스를 implemens(구현)한 클래스를 생성
//인터페이스를 implements한 클래스의 이름은 인터페이스 이름뒤에 Impl을 붙이는 것이 관례입니다. 
//하나의 클래스는 여러개의 인터페이스를 구현할 수 있습니다. 
public class MemberServiceImpl implements MemberService {

	// 아이디 중복체크를 위한 메소드 구현
	@Override
	public boolean idCheck(String id) {
		boolean result = false;

		if (id.equals("root") == false) {
			result = true;
		}
		return result;
	}

	// 로그인 처리를 위한 메소드 구현
	@Override
	public int login(String id, String password) {
		int result = 2;
		if (id.equals("root")) {
			if (password.equals("1234")) {
				result = 0;
			} else {
				result = 1;
			}
		}
		return result;
	}
}
