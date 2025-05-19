package day5;
class fruits{
	void benfit() {
		System.out.println("good");
	}
}
class apple extends fruits{
	void colour() {
		System.out.println("REd");
	}
}
class mango extends fruits{
	void price() {
		System.out.println("100rs");
	}
}
class banana extends fruits{
	void taste() {
		System.out.println("sweet");
	}
}

public class mulpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         apple a =new apple();
         mango m=new mango();
         banana b=new banana();
         a.colour();
         m.price();
         b.taste();
         a.benfit();
         
         
         
	}

}
