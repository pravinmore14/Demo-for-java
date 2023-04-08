public class matahamatics {
	public void addition(int a, int b) {
		int sum = a+b;
		System.out.println("addition of two numbers" +sum );
	}
	public void substractio(int a, int b) {
		int diffrence = a-b;
		System.out.println("substration of two numbers" + diffrence);
	}
	public void multiplication (int a, int b) {
		int multi = a+b;
		System.out.println("multiplication  of two numbers" +multi );
	}


public static void main(String []args){
	 matahamatics m1 = new matahamatics();
	 m1.addition(10,20);
	 m1.substractio(30,10);
	 m1.multiplication(2,5);
}
}
