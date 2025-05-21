package day5;
class Sample33
{
	int x=90;
}

public  class supper1 extends Sample33 {
	void show() {
		int y=18;
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		supper1 s= new supper1();
		s.show();
	}
}

