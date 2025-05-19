package day4;

public class thisx3 {
	int x;
	int y;
	public thisx3(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public thisx3(thisx3 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisx3 t=new thisx3(2,3);
		thisx3 t2=new thisx3(t);

	}

}
