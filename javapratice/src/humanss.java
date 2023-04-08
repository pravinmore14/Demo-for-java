public class humanss {
	
	int age;
	String name;
	String colour;

	public void diplay() {
	System.out.println("in human class");
	}
	public void printlnname(String humanssname) {                 
		System.out.println(humanssname);
}
	public void printlncolour(String humansscolour) {
	System.out.println(humansscolour);	
	}
	public void printlnage(int humanssage) {
		System.out.println(humanssage);	
	}
	public static void main(String[]args) {
		humanss h1=new humanss();
		h1.diplay();
	h1.printlnname("pravin");
	
	h1.printlncolour("white");
	h1.printlnage(27);
		
	}
	}