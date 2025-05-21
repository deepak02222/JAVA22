package day6;

public class Sample2 extends Object {
          int a=88;
          void add() {
        	  int a=88;
        	  System.out.println(a);
          }
          void sub() {
        	  System.out.println(this.a);
        	  this.add();
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s=new Sample2();
		s.sub();
	}

}
