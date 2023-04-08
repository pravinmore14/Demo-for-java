package Practise;
abstract class Tata{
abstract void launchingNewcar(); //here we achirve 100% abstraction we are not providing any method body
	
}
class More extends Tata{
	
More() {
		
		System.out.println("we are in default constructor hence we can use constuctor in abstraction");	
	
	}                            

		void launchingNewcar() {
			System.out.println("launching car with tubelesstire");	  // here we are not achieve abstaction bcoz we provide method body.
		System.out.println("launching car with 10 tyres");
	System.out.println("more group launching car with high safety");
	}
}
public class Abstraction {


	public static void main(String[] args) {
		Abstraction a=new Abstraction();
		
		More t=new More();
		t.launchingNewcar();
		
	}
	}