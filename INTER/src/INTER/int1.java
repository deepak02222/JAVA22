package INTER;

interface I1{
	void add();

} 
interface I2{
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}
class int1 implements I3{
	void div() {
		System.out.println("seeeee");
	}

	public void sub() {
		System.out.println("eeeeee");
	}
	public void mul() {
		System.out.println("haaaaa");
	}
	public void add() {
		System.out.println("ooooooo");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int1 i=new int1(); 
		i.add();
		i.sub();
		i.mul();
		i.div();
	}

}
