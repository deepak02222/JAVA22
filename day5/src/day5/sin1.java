package day5;
class animal{
	void sleep() {
		System.out.println("Sleeping");
	}
}
class dog extends animal {
	void bark() {
		System.out.println("dog is barking");
	}
}

public class sin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.bark();
		d.sleep();
		

	}

}
