package day6;
class Demo1{
	void show() {
		System.out.println("hii");
	}
}
public class Sample27 {
	Demo1 d=new Demo1() {
		void show() {
			System.out.println("hello");
			super.show();
		}
		
	};
public static void main(String[]args) {
	Sample27 s=new Sample27();
	s.d.show();
	
}
}
