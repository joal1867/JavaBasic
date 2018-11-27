package constructor;

public class MemberMain {

	public static void main(String[] args) {
		//인스턴스 생성 - 생성자 호출 
		Member member1 = new Member();	
		System.out.println(member1.getName());
		
		Member member2 = new Member();
		member2.setName("조아라");
		System.out.println(member2.getName());
		
		Member member3 = new Member("가나다");
		System.out.println(member3.getName());
		
		
		member3.display();
	}

}
