package casting;

public class Upcasting {

	public static void main(String[] args) 
	{
		Father f= new Father();
		
		f.home();
		f.money();
		System.out.println("========================");
		
		Son s= new Son();
		
		s.money();
		s.home();
		s.shareMarket();
		System.out.println("========================");
		
		//creating object of subclass and giving reference of super class
		
		Father f1= new Son();
		
		f1.home();
		f1.money();
		//we cant call shareMarket() using fathers reference

	}

}
