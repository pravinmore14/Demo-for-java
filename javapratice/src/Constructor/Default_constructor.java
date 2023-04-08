package Constructor;

public class Default_constructor {
int a; String b; boolean c;
Default_constructor(){
	int a=10; 
	String b="PRAVIN"; 
	boolean c=true;
}
void display(){
	System.out.println(a+" "+b+" "+c);
}

	public static void main(String[] args) {
		Default_constructor r=new Default_constructor();
           r.display();
	}

}
