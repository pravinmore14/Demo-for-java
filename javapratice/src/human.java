
public class human {

	//properties
	
	 int age;
	String name ;
	String colour;

//non paramatrize method
	
	public void display () {
		System.out.println("diplay human deteials");
	}
	
	//paramatrized method
		public void printlnname(String humanname){
			System.out.println(humanname);
		}
		
		
		public void printage(String humanage){
			System.out.println(humanage);
		}
		
		public void printcolour(String humancolour){
			System.out.println(humancolour);
		}
		
	public static void main(String[]args) {
	
		human h1 = new human();
		h1.display();
		    h1.printlnname("pravin");
		    h1.printage("27");
		    h1.printcolour("fair");
		human h2 = new human();
		h2.display();
            h2.printlnname("vishal");
         
		    h2.printage("30");
		    h2.printcolour("white");
	
		
	}
}
