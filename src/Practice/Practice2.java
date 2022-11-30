package Practice;
interface Parent1{
	abstract class A{
		 
	}
//	Parent1(int x){
//		we can't use final access modifier in 'interface'
//	}
	default void show() {
		System.out.println("Hi");
	}
}
interface Parent2{
	void show();
}
class Child implements Parent1,Parent2{
	public void show() {
		System.out.println("Hello");
	}
}

public class Practice2 {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.show();

	}

}
