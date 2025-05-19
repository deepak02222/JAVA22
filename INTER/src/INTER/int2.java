package INTER;
interface T0{
	void add();
}
interface T1 extends T0{
	void sub();
}
class int2 implements T0 {
	void div() {
		System.out.println("hello");
		}
	class int5 implements T0 {
		public void add() {
			System.out.println("Welcome to Java");
		}
			
		
	}
	
    public void add() {
		System.out.println("world");
	}
	public void sub() {
		System.out.println("Thank You");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int2 i=new int2();
     
       i.div();
       i.add();
       
       i.sub();
      }
	  int5 i1=new int5();
	  
	
}



