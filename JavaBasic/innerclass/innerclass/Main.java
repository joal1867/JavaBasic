package innerclass;

public class Main {

	public static void main(String[] args) {
		ThreadEx obj = new ThreadEx();
		obj.start();

		
		//Annonymous inner class : 익명클래스 : 클래스를 별도로 생성하지 않고 인스턴스를 생성해서 사용합니다. 
		//ㄴ 주로 클래스를 상속받아 인스턴스를 만든 후, 한번만 사용하는 경우 이용합니다. 
		//Thread클래스의 Anonymous class 
		Thread th=new Thread(){
			public void run() {
				try {
					for(int i=10;i<20;i=i+1) {
						System.out.println(i);
						Thread.sleep(1000);
					}
				}
			catch(Exception e) {}
			}
		};
		th.start();		
	}
}
