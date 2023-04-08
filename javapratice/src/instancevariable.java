
public class instancevariable {
	int c;

	public void addition() {
		c = 2 + 5;
		System.out.println("Addition " + c);
	}

	public void substraction() {
		c = 5 - 2;
		System.out.println("Substraction => " + c);
	}

	public static void main(String[] args) {

		instancevariable i1 = new instancevariable();
		i1.addition();
		i1.substraction();
		
		i1.c = 50; // c variable of i1 intialize to 50
		
		instancevariable i2 = new instancevariable();
		i2.c = 100; // c variable of i2 intialize to 100
		
		System.out.println("I1 of c " + i1.c);
		
		System.out.println("I2 of c " + i2.c);
	}
}
		


