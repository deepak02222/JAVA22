package day5;
interface I1{
	void add();
	void sub();
} 
public class in1 implements I1 {
	public void add() {
		System.out.println("yooo");
	}
	public void sub() {
		System.out.println("eeeeee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in1 i=new in1(); 
		i.add();
		i.sub();

	}

}
