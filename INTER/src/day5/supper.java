package day5;
class Sample55{
	int x=99;
	void print() {
		System.out.println("hello");
	}
}

public class supper extends Sample55{
	public supper() {
		super();
	}
	void show() {
		int y=61;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		supper s=new supper();
		s.show();
	

	}

}
