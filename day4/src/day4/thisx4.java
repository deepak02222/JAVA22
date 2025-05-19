package day4;

public class thisx4 {
	
		float x;
		int y;
		float z;
		public thisx4(){
			System.out.println("welcome to my profile:K.DEEPAK");
		}
		public thisx4(float x){
			this.x=x;
			System.out.println("SCC:"+(x));
		}
		public thisx4(float x,int y) {
			this.x=x;
			this.y=y;
			System.out.println("SSC: " + (x) + " INTER: " +(y));
		}
		public thisx4(float x,int y,float z) {
			this.x=x;
			this.y=y;
			this.z=z;
			System.out.println("SCC: "+(x)+ " INTER:" +(y)+ " BTECH:"+(z));
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			thisx4 t=new thisx4();
			thisx4 t2=new thisx4(9.3f);
			thisx4 t3=new thisx4(9.3f,65);
			thisx4 t4=new thisx4(9.3f,650,7.4f);

		}

	}


