package day4;

public class enex1 {
	private String firstName;
	private String lastName;
	
	public void setFirstname(String fn) {
		firstName=fn;
	}
	public void setLastname(String ln) {
		lastName=ln;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enex1 d1=new enex1();
		d1.setFirstname("dee");
	    d1.setLastname("pu");
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());

	}

}
