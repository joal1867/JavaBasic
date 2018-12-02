package shareData;

public class Main {
	public static void main(String[] args) {
		
		//동일한 클래스로부터 생성된 인스턴스 사이의 데이터 공유 : static 변수를 이용 
		StaticShare obj1 = new StaticShare();
		StaticShare obj2 = new StaticShare();
		obj1.share = "안녕하세요";
		obj1.each = 100;

		// share는 static 이므로 obj1이 변경한 내용이 출력
		System.out.println(obj2.share);
		// each는 static이 아니므로 자신의 값 출력
		System.out.println(obj2.each);
	}
}
