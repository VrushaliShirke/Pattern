package Practice;

public class Student {

	private int id;
	private String name;

	public int getId(){
		return id;
	}
	public void setId(int n){
		id=n;
	}
	public String getName(){
		return name;
	}
	public void setName(String s){
		name=s;
	}

	public static void main(String[] args) {
		Student st= new Student();
		st.setId(12);
		st.getName("Neha");
		System.out.println(st.getId()+" "+st.getName());
	}

}
