package day5;
class movie {
	void title() {
		System.out.println("Funny");
	}
}
class Housefull extends movie{
	void name() {
		System.out.println("HouseFull");
	}
}
class hero extends Housefull {
	void HeroName() {
		System.out.println("akshay kumar");
		
	}
	
	
}
class heroin extends hero{
	void HeroinName(){
		System.out.println("deepika");
		
	}
}

public class movie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero h=new hero();
		heroin h2=new heroin();
		h.name();
		h2.HeroName();
		h2.HeroinName();
		h.title();

	}

}
