package PatternHw;

public class Car {
	
	int id;
	String name;
	
	public Car(){
		this(23,"Audi");
	}
	
	public Car(int i, String s){
		id=i;
		name=s;
	}
	
	 protected void display() {
		 System.out.println(id+" "+ name);
	 }

	public static void main(String[] args) {

		Car c= new Car();
		c.display();
	}

}
