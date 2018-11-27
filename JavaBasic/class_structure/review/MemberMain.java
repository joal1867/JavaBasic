package review;

public class MemberMain {

	public static void main(String[] args) {
		//매개변수가 있는 생성자 이용 
		MemberVO member1 = new MemberVO("조아라",39,"0212345678");
		
		//매개변수가 없는 생성자 이용 
		MemberVO member2 = new MemberVO();
		member2.setName("조아롸");
		member2.setAge(40);
		member2.setPhone("9876543201");
		
		//toStirng 메소드 호출 
		System.out.println(member1);
		System.out.println(member2);
	}

}
