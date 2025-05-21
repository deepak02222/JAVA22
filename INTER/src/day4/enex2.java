package day4;

public class enex2 {
	private String firstName;
	private String lastName;
	private String Email;
	private long Phoneno;
	
	public void setFirstname(String fn) {
		firstName=fn;
	}
	public void setLastname(String ln) {
		lastName=ln;
	}
	public void setEmail(String en) {
		Email=en;
	}
	public void setPhoneno(long pn) {
		Phoneno=pn;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return Email;
	}
	public long getphoneno() {
		return Phoneno;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enex2 d1=new enex2();
		d1.setFirstname("dee");
	    d1.setLastname("pu");
	    d1.setEmail("boydeepak69@gmail");
	    d1.setPhoneno(8247009688l);
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmail());
		System.out.println(d1.getphoneno());
		

	}

}