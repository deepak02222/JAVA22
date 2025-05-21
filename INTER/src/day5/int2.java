package day5;
interface I3{
	void add();
}
interface I4{
	void sub();
} 
public class int2 implements I3,I4 {
	public void add() {
		System.out.println("yooo");
	}
	public void sub() {
		System.out.println("eeeeee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int2 i=new int2(); 
		i.add();
		i.sub();

	}

}
