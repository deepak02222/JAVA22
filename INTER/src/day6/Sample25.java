package day6;
class Sample26{
	private static void show() {
		System.out.println("hiii");
	}
	static class Test25{
		static void print() {
			System.out.println("helloo");
			show();
		}
	}
}

public class Sample25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample26.Test25.print();
	}

}
