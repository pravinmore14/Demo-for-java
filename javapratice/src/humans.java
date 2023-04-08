public class humans {

		int age ;
		String colour ;
		String name;
public void display () {
	System.out.println("diplay humans details");
}
public void printlnname(String humaname) {
	System.out.println(humaname);
}
public void printcolour(String humancolour) {
	System.out.print(humancolour);
}
public void printlnage(String humanage) {
	System.out.println(humanage);
}
public static void main(String[]args) {
	human h1=new human();
	h1.display();
	h1.printlnname("pravin");
	h1.printage("27");
	h1.printcolour("white");
	
	
	
}
}
