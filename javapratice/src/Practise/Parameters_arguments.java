package Practise;

public class Parameters_arguments {

int c;
public void addition(int a,int b) { // here a,b are the parameters and through parameter we  will give arguments when method call
	c=a+b;
	System.out.println("addition is equal "+c); 
}
	public static void main(String[] args) {
		Parameters_arguments pa = new Parameters_arguments();
		pa.addition(10, 20);  // its an arguments bcoz we passed values here

	}

}
