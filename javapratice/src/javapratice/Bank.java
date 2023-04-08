package javapratice;

public interface Bank {
	public static final int rateofinteress=10;
	 public abstract void display();
		

class Sbi implements Bank{
	public void display() {
		System.out.println("rate of interest is 8");
	}	
}
	public static void main(String []args) {
		Sbi s1=new Sbi();
		s1.display();
}
}
