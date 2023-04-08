class Parent{
	
	public void display() {
		System.out.println("In parent class display method");
	}
}


class Child extends Parent{
	
	
	
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.display();
		
		
	}

}


