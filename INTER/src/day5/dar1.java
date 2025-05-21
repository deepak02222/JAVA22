package day5;
class chocolate {
	void eat() {
		System.out.println("eating a chocolate");
	}
}
class Darkchocolate extends chocolate{
	void name() {
		System.out.println("amul");
	}
	void cost(){
		System.out.println("rs 100");
	}
	
}
class Sweetchocolate extends Darkchocolate{
	void name() {
		System.out.println("Ferarousious");
	}
	void cost() {
		System.out.println("Rs 1000");
		
	}
}

public class dar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        chocolate c= new chocolate();
        Darkchocolate d=new Darkchocolate();
        Sweetchocolate s=new Sweetchocolate();
        c.eat();
        d.name();
        d.cost();
        s.name();
        s.cost();
	}

}