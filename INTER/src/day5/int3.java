package day5;
interface I5{
	void add();
}
class test{
	void sub(){
		System.out.println("hello");
	}
} 
public class int3 extends test implements I5 {
	public void add() {
		System.out.println("yooo");
	}
	public void sub() {
		System.out.println("eeeeee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int3 i=new int3(); 
		i.add();
		i.sub();

	}

}
