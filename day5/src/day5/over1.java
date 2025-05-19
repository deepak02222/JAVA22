package day5;
class test6{
	void add() {
		
		System.out.println("hi");
	}
}
public class over1 extends test6{
	void add(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		over1 o= new over1();
		o.add();
	}

}
