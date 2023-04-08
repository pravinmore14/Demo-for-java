package Practise;
class parent{
 public void dispaly() {
	System.out.println("In parent class");
}
}
 class child extends Inheritance{
	public void dispaly() {
	 System.out.println("In child class");
 }
 

 }
 public class Inheritance{
public static void main(String []args) {
	parent c = new parent();
	c.dispaly();
	child d = new child();
	d.dispaly();
	} 
}
 
 

 

