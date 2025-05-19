package day4;

public class thisx2 {
	int a;
	int b;
	public thisx2(int x,int y){
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisx2 t=new thisx2(12,13);

	}

}
