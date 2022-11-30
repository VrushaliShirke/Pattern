package Practice;

class A10 {
	void show() {
		System.out.println("Class A");
	}
}
class B10 extends A{
	void show() {
		System.out.println("Class B");
	}
}
public class Overriding {

	public static void main(String[] args) {
		A b= new A();
		b.show();

	}

}
