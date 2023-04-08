package javapratice;

public class Swapingnumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//by using third variable
		//int t=a;
		//a=b;
		//b=t;
		
		
   // swapping by adding and substration
	a=a+b;	  // a=30
	b=a-b;    // b=30-20=10
	a=a-b;	  // a=30-10=0
	
	System.out.println("a  values after swaping " +a);
	System.out.println("b values after swaping " +b);
	}
}

