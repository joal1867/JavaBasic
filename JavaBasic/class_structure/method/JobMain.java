package method;

public class JobMain {
	public static void main(String[] args) {
		//매개변수 전달 - 원본데이터 변경 여부 
		//1.call by Value : 원본데이터 변경 불가(*String은 참조형이지만, 기본형과 동일하게 적용!)
		int x =10;
		Job.plusValue(x);
		System.out.println("x: "+x);
		
		//2.call by Reference : 원본데이터 변경이 가능할 수도 있습니다.(반드시 변경되는 것은 아닙니다.) 
		int [] ar = {10,20};
		Job.plusReference(ar);
		System.out.println("ar[0]: "+ar[0]);
		
		
		//접근자 메소드호출, 데이터 저장 
		Job job = new Job();
		job.setName("조아라");
		job.setAge(19);
		
		//toString 메소드 호출 
		//출력하는 메소드에 멤버변수의 이름을 대입하면 자동으로 toString 메소드를 호출해 출력합니다. - 목적 : 디버깅
		System.out.println(job);
	}

}
