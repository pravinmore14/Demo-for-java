public class thisreferstoclassconstructor {
	public thisreferstoclassconstructor() { 
		this(50);                                      //
		System.out.println("default constructor");
	}
	public thisreferstoclassconstructor(int a) { 
		
		System.out.println("paramatized constructor"   + a);
		
	}
	
	public static void main(String[] args) {
		thisreferstoclassconstructor x1 =new thisreferstoclassconstructor();	
                 
	}
}