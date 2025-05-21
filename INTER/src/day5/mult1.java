package day5;
class bike {
	void speed() {
		System.out.println("200 km per hour");
	}
}
class bmw extends bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class model extends bmw{
	void price() {
		System.out.println("20 lakhs");
	}
}

public class mult1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model m=new model();
		m.speed();
		m.rev();
		m.price();
	}

}
