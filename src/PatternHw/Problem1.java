package PatternHw;
class Test{
	int id;
	void sId() {
		System.out.println("Hello");
	}
}
public class Problem1 {
	String name;
	void sName() {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		new Problem1().sName();
		new Test().sId();
		

	}

}
