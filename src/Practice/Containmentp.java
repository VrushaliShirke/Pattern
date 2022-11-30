package Practice;
class Exam{
	int marks;
	String subject;
	Exam(int marks, String subject){
		this.marks=marks;
		this.subject=subject;
	}
}
public class Containmentp {

	int standard;
	String name;
	Exam ex;
	Containmentp(int standard,String name,Exam ex) {
		this.standard=standard;
		this.name=name;
		this.ex=ex;
	}
	public String toString() {
	return standard+" "+name+" "+ex.marks;
	}
	public static void main(String[] args) {
		Containmentp c= new Containmentp(23,"Vaani",new Exam(89,"Maths"));
		System.out.println(c);
	}

}
