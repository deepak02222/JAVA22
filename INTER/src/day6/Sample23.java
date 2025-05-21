package day6;

public class Sample23 {
void show() {
	System.out.println("HEEE");
}
class Test23{
	void print() {
		System.out.println("HAAAAA");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample23 s=new Sample23();
		s.show();
		Sample23.Test23 t=new Sample23().new Test23();
		t.print();
	}

}
