package Practice;

abstract class A{
	A(){
		System.out.println("Hi");
	}
//	final void show() {
//		System.out.println("Hello");     ====>we can't access final method in child class.
//	}
}
class B extends A{
//	void show() {
		public void show() {
			System.out.println("Good Morng....");
		}
//	}
}
public class Practice1 {

	public static void main(String[] args) {
		A a= new B4();
		a.show();

	}

}
