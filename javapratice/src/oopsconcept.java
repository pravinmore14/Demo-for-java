public class oopsconcept {

	//properties
	
	int age;
	String name ;
	String colour;
	
	public void display () {
		System.out.println("diplay human deteials");
	}
	public void printlnhumanage(int humanage) {
	System.out.println(humanage);
	}
		public void printlnhumanname(String humanname) {
			System.out.println(humanname);
		}
		public void printlnhumancolour(String humancolour) {
		System.out.println(humancolour);	
		}
	public static void main(String[]args) {
	
		human h1 = new human();
		h1.display();
		h1.printlnname("pravin");
		h1.printcolour("white");
        h1.printage("humanage");
	}
}