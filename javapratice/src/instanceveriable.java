public class instanceveriable {
int c;
public void addition() {
	c=2+3;
	System.out.println("additon" + c);
}
public void substraction() {
	c=5-3;
	System.out.println("substraction" +c);
}
	public static void main(String[]args) {
	instancevariable I1=new	instancevariable();
	I1.addition();
	I1.substraction();
	I1.c=100;
	instancevariable I2=new	instancevariable();
	I2.c=200;
	System.out.println("I1 of c" +I1.c);
	System.out.println("I2 of c" +I2.c);
}
}
