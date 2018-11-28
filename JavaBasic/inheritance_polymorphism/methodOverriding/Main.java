package methodOverriding;

public class Main {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.disp();
		((Child) obj).print();

	}
}
