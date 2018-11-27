package method;

public class Job {
	//매개변수 전달 방법  
	//1.call by value : 메소드가 매개변수로 대입된 데이터의 원본 변경불가
	public static void plusValue(int n) {
		n = n + 1;
		System.out.println("n: "+n);
	}
	
	//2.call by reference : 메소드가 매개변수로 대입된 데이터의 원본을 변경할 수도 있다. 
	public static void plusReference(int[] br) {
		br[0] = br[0] + 1;
		System.out.println("br[0]: "+br[0]);
 	}
	
	
	private String name;
	private int age;
	//접근자메소드 : 인스턴스 변수를 사용하기 위한 메소드
	//getter : 데이터를 가져오는 메소드 
	//리턴이 항상 있기 때문에 변수에 담아야합니다. 예)변수=T.getName(); 
	public String getName() {
		return name;
	}
	//setter : 데이터를 설정하는 메소드 
	//매개변수 1개를 가지기 때문에 읽어야합니다. 예)T.setName(String name);
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//toString 메소드 : 인스턴스의 내용을 묶어 하나로 만들어 주는 메소드   
	@Override
	public String toString() {
		return "Job [name=" + name + ", age=" + age + "]";
	}
	
}
