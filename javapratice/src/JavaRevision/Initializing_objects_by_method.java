package JavaRevision;

public class Initializing_objects_by_method {
	String name="pravin";
	int age =27;
	
//initializing object by method
	 void display() {
		 System.out.println("Name is "+name);
		 System.out.println("age is "+age); 
	 }
	 
	public static void main(String[] args) {
		Initializing_objects_by_method obj =new Initializing_objects_by_method();
		
		obj.display();

	}

}
