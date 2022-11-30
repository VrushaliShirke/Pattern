package Practice;
class A1{
	int show() {
		int x=10;
		System.out.println(x);
		return x;
	}
}
public class overriding_1 extends A1 {
		int show() {
			int x=50;
			System.out.println(x);
			return x;
		}
		public static void main(String[] args) {
			overriding_1 o= new overriding_1();
			o.show();
		}

}
