package Practice;
class Address{
	private int pin;
	private String name;
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPin() {
		return pin;
	}
	public String getName() {
		return name;
	}
}
public class GetterSetter {
	private int Sname;
	private int Pyear;
	private Address adr;
	
	public void setSname(int Sname) {
		this.Sname=Sname;
	}
	public void setPyear(int Pyear) {
		this.Pyear=Pyear;
	}
	public void setAdr(Address adr) {
		this.adr=adr;
	}
	public int getSname() {
		return Sname;
	}
	public int getPyear() {
		return Pyear;
	}
	public Address getAdr() {
		return adr;
	}
	public static void main(String[] args) {
		GetterSetter gs= new GetterSetter();
		gs.setSname(34);
		gs.setPyear(2020);
		gs.setAdr(new Address());
		gs.getAdr().setPin(4157689);
		gs.getAdr().setName("Pune");

		System.out.println(gs.Sname+" "+gs.Pyear+" "+gs.getAdr().getPin()+" "+gs.getAdr().getName());
	}

}
