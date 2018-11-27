package method;

public class CopyData {
	public static void main(String[] args) {
		//데이터 복사 
		
		//1.기본형, String의 데이터 복사 
		//값을 복사하기 때문에 복사본에서 원본의 데이터 수정 불가 
		int a = 10;
		String str = "Hello";
		//a, msg 자신이 가는게 아닌, 갖고 있는 데이터가 복사 됩니다. 
		//a가 아닌 a가 갖고 있는 10이 복사, str이 아닌 str이 갖고 있는 "Hello"가 복사 
		int b = a; 
		String msg = str;
		b=20;
		msg="Hi";
		//a, str을 바꾸기 전까지 출력결과는 원래 가지고 있는 데이터 
		System.out.println(a);
		System.out.println(str);
		System.out.println(b);
		System.out.println(msg);
		
		
		//2.참조형의 데이터 복사 
		//참조(주소)를 복사하기 때문에 복사본에서 원본의 데이터 수정가능 
		int [] ar = {10,20,30};
		//배열ar의 데이터가 아닌 ar의 주소가 대입
		int [] br = ar;
		//주소로 찾아가 데이터를 대입하기 때문에 원본의 데이터 수정
		br[0]=100;
		System.out.println(ar[0]);

	}
}
